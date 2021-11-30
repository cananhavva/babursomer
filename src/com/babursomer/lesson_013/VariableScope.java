package com.babursomer.lesson_013;

public class VariableScope {
	
	int variableA;
	int variableC = 23;
	
	public static void main(String[] args) {
		VariableScope scope = new VariableScope();
		scope.variableA = 10;
		int variableD = 12;
		System.out.println("Sonuç : " + scope.doSomeCalculation(variableD));
		System.out.println("VariableD\'nin değeri: " + variableD);
	}
	
	private int doSomeCalculation(int variableA) {
		int retVal = 0;
		int b = 3;
		
		retVal = b * variableA * this.variableA;
		
		if (b > 1) {
			int variableC = 5;
			retVal += variableC;
		}
		
		variableA = 1234;
		System.out.println("VariableC\'nin değeri: " + variableC);
		return retVal;
	}
	
}
