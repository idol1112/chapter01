package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double pie =3.14;
		
		System.out.print("반지름을 입력하세요:");
		double half = sc.nextDouble();
		System.out.println("원의 넓이는 "+(half*half)*3.14);
		

	}

}
