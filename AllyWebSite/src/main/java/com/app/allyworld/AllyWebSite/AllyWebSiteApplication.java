package com.app.allyworld.AllyWebSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;*/

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableWebSecurity
//@EnableOAuth2Sso
public class AllyWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllyWebSiteApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

