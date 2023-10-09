package com.interfaceFeatures;

interface myInterface {

	int add(int n1, int n2);

}

interface myInterface2 {
	int division(int num1, int num2);

	public class LambdaExpressionDemo {

		public static void main(String[] args) {

			myInterface i1 = (int n1, int n2) -> {
				return n1 + n2;
			};
			System.out.println(i1.add(5, 5));

			myInterface2 i = (int num1, int num2) -> {

				return num1 - num2;

			};
			System.out.println(i.division(50, 25));

		}

	}
}
