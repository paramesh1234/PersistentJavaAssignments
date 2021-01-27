package com.psl.training.e2;

public class Stack {
	static int[] a1= {};
	static int a2[] = {1,2,3};
	static int a3[];
	public static void main(String[] args) {
		pop(a1);
		push(a3,10);
		push(a2,10);
	}
	private static void push(int[] a, int i) {
		try {
			a[3]=i;
		}
		catch(NullPointerException e) {
			System.out.println("Array is not initialised.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is full");
		}
	}
	private static void pop(int[] a) {
		try {
			System.out.println(a[a.length-1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pop is failed on empty stack");
		}
	}
}
