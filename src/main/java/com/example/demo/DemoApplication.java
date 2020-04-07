package com.example.demo;

import com.sun.javafx.fxml.BeanAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
@EnableBinding(Processor.class)
public class DemoApplication {

	public static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(DemoApplication.class, args);
	}
	}

