package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class MultiplyController {

	@GetMapping("/multiply")
	public String getResult(@RequestParam(value = "operand1") String operand1, @RequestParam(value = "operand2") String operand2) {
		BigInteger bigInt1 = new BigInteger(operand1);
		BigInteger bigInt2 = new BigInteger(operand2);

		bigInt1 = bigInt1.multiply(bigInt2);
		return bigInt1.toString();
	}
}
