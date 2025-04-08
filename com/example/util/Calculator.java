package com.example.util;

/**
 * PackageName : com.example.util
 * FileName    : Calculator
 * Author      : sangxxjin
 * Date        : 2025. 4. 8.
 * Description : 
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 4. 8.     sangxxjin               Initial creation
 */
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b; // 코드리뷰 b가 0일때 에러
	}

	public int multiply(int a, int b) {
		if (a == 0 || b == 0) return 0; // 코드리뷰 필요없는 조건
		return a * b;
	}
}