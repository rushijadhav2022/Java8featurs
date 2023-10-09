package com.interfaceFeatures;

import java.util.*;

interface myInterface1 {

	int division(int num1, int num2);

}

public class LambdaExpressionDemo2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		myInterface1 i1 = (int n1, int n2) -> {

			n1 = sc.nextInt();
			n2 = sc.nextInt();
			return n1 - n2;

		};

		int n1 = 0;
		int n2 = 0;
		System.out.println("Division : " + i1.division(n1, n2));

	}

}
