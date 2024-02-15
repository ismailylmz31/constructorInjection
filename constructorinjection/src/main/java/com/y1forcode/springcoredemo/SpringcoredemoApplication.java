package com.y1forcode.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	// 	(		scanBasePackages = {"com.y1forcode.springcoredemo" , "com.y1forcode.util"})
// spring uygulamalarinda paketler yukardaki gibi tanimlanir dosya gormedigi durumlarda
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
