package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {

	@GetMapping("/multiply")
	public Multiply greeting(@RequestParam(value = "operand1") String arg1, @RequestParam(value = "operand2") String arg2) {
		return new Multiply(arg1, arg2);
	}
}
