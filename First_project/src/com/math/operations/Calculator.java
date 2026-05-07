package com.math.operations;

class Calcu{
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcu c=new Calcu();
		int sum = c.add(10, 5);
		int sub = c.sub(10,  5);
		System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + sub);
		
	}

}
