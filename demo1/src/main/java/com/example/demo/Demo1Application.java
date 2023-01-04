package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo1.**.mapper")
public class Demo1Application {

	//건드리지 않는 것이 좋다.
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
