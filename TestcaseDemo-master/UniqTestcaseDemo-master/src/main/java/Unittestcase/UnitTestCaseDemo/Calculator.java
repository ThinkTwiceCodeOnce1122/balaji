package Unittestcase.UnitTestCaseDemo;

public class Calculator {

	public int add(int a, int b) {
		if(a!=0&&b!=0) {
			return a + b;
		}
		return 0;
		
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return (double) a / b;
	}
}
