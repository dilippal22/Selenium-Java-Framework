package com.dgsl.java.fibonacci;

public class WithRecursion {
	
	static int n1 = 0, n2 = 1, n3;
	
	public static void PrintFibonacci(int count){
		if(count>0){
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		
		System.out.print(n3+" ");
		PrintFibonacci(count-1);
		}
	}
	
	public static void main(String args[]){
		int count = 10;
		System.out.print(n1 + " " + n2+" ");
		PrintFibonacci(count-2);
		
	}

}
