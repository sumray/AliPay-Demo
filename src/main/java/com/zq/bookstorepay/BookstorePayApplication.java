package com.zq.bookstorepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zq.bookstorepay.config.PropertyListener;

@SpringBootApplication
public class BookstorePayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstorePayApplication.class, args);
	}

}
