package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.domain")
public class StartupApp {

	public static void main( String[] args ) throws Exception
    {
		SpringApplication.run(StartupApp.class, args);
    }
}
