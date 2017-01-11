package com.amazingd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*", allowedHeaders="*")
@SpringBootApplication
public class JezzApplication {

//	 @Bean
//	    public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurerAdapter() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:3000");
//	            }
//	        };
//	    }
	
	public static void main(String[] args) {
		SpringApplication.run(JezzApplication.class, args);
	}
}
