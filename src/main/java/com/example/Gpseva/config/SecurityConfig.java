package com.example.Gpseva.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http
				// 🔥 REQUIRED FOR POST APIs
				.csrf(csrf -> csrf.disable())

				// 🔥 REQUIRED FOR REST APIs
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

				// 🔥 CORS ENABLE
				.cors(cors -> {
				})

				// 🔥 AUTH RULES
				.authorizeHttpRequests(auth -> auth.requestMatchers("/api/register", "/api/register/**").permitAll()
						.requestMatchers("/api/documents/download/**").permitAll()
						.requestMatchers("/api/documents/upload").permitAll()

						.anyRequest().authenticated());

		return http.build();
	}
}
