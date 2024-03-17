package com.example.HospitalManagement.configruation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class MyConfiguration {
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
    public SecurityFilterChain FilterChain(HttpSecurity httpSecurity) throws Exception {
				
		httpSecurity.cors(AbstractHttpConfigurer::disable);
		httpSecurity.csrf(AbstractHttpConfigurer::disable);
		
		httpSecurity.authorizeHttpRequests(request->{
	            request.requestMatchers("/**").permitAll();
	           // request.requestMatchers("/user/**").hasRole("USER");
	           
	            request.anyRequest().authenticated();
	            
	        });
	        
	        
	        return httpSecurity.build();	
	        
	}
}
	
