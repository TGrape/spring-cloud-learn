package com.forezp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${foo}")
	String foo;
	@Value("${foo1}")
	String sp ;
	
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
	
	@RequestMapping(value = "/hj")
	public String hj(){
		return sp;
	}
}
