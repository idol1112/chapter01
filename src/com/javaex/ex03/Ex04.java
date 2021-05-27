package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		int money = 10000;
		int time = sc.nextInt();
		if(time<=8) {
			System.out.println("받으실 임금은 "+time*money+"원 입니다.");
		}
		else {
			System.out.println("받으실 임금은 "+((time-8)*12000+(money*8))+"원 입니다.");
		}
		
		sc.close();

	}

}
