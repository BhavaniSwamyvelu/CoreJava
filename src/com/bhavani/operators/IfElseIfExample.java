package com.bhavani.operators;

public class IfElseIfExample {
	public static void main(String[] args) {
		int marks = 50;
		if (marks > 90) {
			System.out.println("Merit");
		} else if (marks <= 80 && marks >= 50) {
			System.out.println("Average");
		} else if (marks <= 50) {
			System.out.println("Below Average");
		} else {
			System.out.println("Enter valid marks");
		}
	}

}
