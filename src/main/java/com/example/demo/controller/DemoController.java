package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;

@RestController
public class DemoController {
	
	@Autowired
	KafkaTemplate<String,Book> kafkaTemplate;
	
	private static final String TOPIC = "NewTopic";
	
	
	
	@PostMapping("/publish")
	public String publishBook(@RequestBody Book book) {
		kafkaTemplate.send(TOPIC,book);
		return "Published successfully";
	}
	
}
