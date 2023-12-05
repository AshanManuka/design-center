package com.designCenter.designCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@SpringBootApplication
public class DesignCenterApplication {


	@GetMapping
	public String helloReq(){
		System.out.println("Request is comming -------------");
		return "Hellooooooooooooooo";
	}

	@GetMapping(value ="/hellow")
	public String helloReqTwo(){
		System.out.println("Request is came Two  -------------");
		return "Two Hellooooooooooooooo";
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignCenterApplication.class, args);
	}

}
