package com.example.util;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int divide(int a, int b) {
		return a / b; // 0 나눗셈 예외 처리 안됨
	}
}
