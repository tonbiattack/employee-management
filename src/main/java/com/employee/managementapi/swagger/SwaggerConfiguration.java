package com.employee.managementapi.swagger;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swaggerの設定ファイル
 */
@Configuration
public class SwaggerConfiguration {

	//JWTのために必要
	public static final String AUTHORIZATION_HEADER = "Authorization";

	//JWTのために必要
	private ApiKey apiKey() {
		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				//JWTのために必要
				.securityContexts(Arrays.asList(securityContext()))
				.securitySchemes(Arrays.asList(apiKey()))
				// パッケージを指定して表示するAPIを絞り込む
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.employee.managementapi"))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// タイトル
				.title("社員管理API")
				// 詳細な説明
				.description("社員に関する情報を管理できるAPIです")
				// バージョン
				.version("1.0.0")
				// 連絡先
				.contact(new Contact("豊岡 大知", "https://github.com/tonbiattack", "teni213638395636@gmail.com"))
				.build();
	}

	/**
	 * JWTのために必要
	 * @return
	 */
	private SecurityContext securityContext() {
		return SecurityContext.builder().securityReferences(defaultAuth()).build();
	}

	/**
	 * JWTのために必要
	 * @return
	 */
	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
	}
}
