package com.employee.managementapi.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * JWT認証フィルター
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtTokenProvider tokenProvider;

	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {
		// httpリクエストからトークンを抽出
		String token = getJWTformRequest(request);
		//トークンの検証
		if (StringUtils.hasText(token) && tokenProvider.validateToken(token)) {
			// トークンからメールアドレスを取得する
			String email = tokenProvider.getEmailFromJWT(token);
			//トークンに紐づくユーザーを取得する
			AccountUserDetails accountUserDetails = (AccountUserDetails) userDetailsService
					.loadUserByUsername(email);
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
					accountUserDetails, null, accountUserDetails.getAuthorities());
			authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		}
		filterChain.doFilter(request, response);
	}

	/**
	 * リクエストからJWTトークンを取得する。
	 * 
	 * @param request
	 * @return 
	 */
	private String getJWTformRequest(HttpServletRequest request) {
		String bearerToken = request.getHeader("Authorization");
		if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
			return bearerToken.substring(7);
		}
		return null;
	}
}
