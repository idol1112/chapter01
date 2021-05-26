package com.javaex.practice01;

public class Ex03 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a="+a); //++가 앞에왔기때문에 2*2=4
		System.out.println("b="+b); //++가 뒤에왔기때문에 1*2=2
		System.out.println("x="+x); // 2
		System.out.println("y="+y); // 2

	}

}
