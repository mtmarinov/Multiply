package com.example.restservice;

import java.math.BigInteger;

public class Multiply {

	private final String operand1;
	private final String operand2;

	public Multiply(String operand1, String operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public String getResult() {
		BigInteger bigInt1 = new BigInteger(operand1);
		BigInteger bigInt2 = new BigInteger(operand2);

		bigInt1 = bigInt1.multiply(bigInt2);
		return bigInt1.toString();
	}
}
