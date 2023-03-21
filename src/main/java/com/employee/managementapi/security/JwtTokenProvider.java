package com.employee.managementapi.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * JWTトークンプロバイダー
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class JwtTokenProvider {

	@Value("${app.jwt-secret}")
	private String jwtSecret;

	@Value("${app.jwt-expiration-milliseconds}")
	private int jwtExpirationInMs;

	/**
	 * トークン作成
	 * @param authentication
	 * @return トークン
	 */
	public String generateToken(Authentication authentication) {
		String customername = authentication.getName();
		Date currentDate = new Date();
		Date expireDate = new Date(currentDate.getTime() + jwtExpirationInMs);

		return Jwts.builder()
				.setSubject(customername)
				.setIssuedAt(new Date())
				.setExpiration(expireDate)
				.signWith(SignatureAlgorithm.HS512, jwtSecret)
				.compact();
	}

	/**
	 * JWTからアカウントを取得する
	 * 
	 * @param token
	 * @return 取得したアカウント
	 */
	public String getEmailFromJWT(String token) {
		Claims claims = Jwts.parser()
				.setSigningKey(jwtSecret)
				.parseClaimsJws(token)
				.getBody();
		return claims.getSubject();
	}

	/**
	 * トークンの検証をする
	 * 
	 * @param token
	 * @return true 正常 false 異常
	 */
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
			return true;
		} catch (SignatureException ex) {
			log.warn(ex.getMessage());
		} catch (ExpiredJwtException ex) {
			log.warn(ex.getMessage());
		} catch (MalformedJwtException ex) {
			log.warn(ex.getMessage());
		} catch (UnsupportedJwtException ex) {
			log.warn(ex.getMessage());
		} catch (IllegalArgumentException ex) {
			log.warn(ex.getMessage());
		}
		return false;
	}
}
