package com.example.teste.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class TesteController {

	@PostMapping()
	public Object createUpdateProduct(@Valid @RequestBody Object request) {
		return request;
	}
}