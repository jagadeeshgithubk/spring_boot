package com.jaggu.spring.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.jaggu.spring.controller","com.jaggu.spring.service"})
public class SpringMainArpplication{

	public static void main(String args[]){
		SpringApplication.run(SpringMainArpplication.class, args);
	}
}
