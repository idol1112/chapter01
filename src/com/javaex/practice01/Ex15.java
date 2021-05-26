package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double mile =1.609;
		
		System.out.print("마일을 입력하세요: ");
		double km = sc.nextDouble();
		System.out.println(km+"마일은 "+ km*mile+"킬로미터 입니다.");
		

	}

}
