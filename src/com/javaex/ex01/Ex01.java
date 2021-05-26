package com.javaex.ex01;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
        System.out.print("몇단까지 출력?");
        int num = (new Scanner(System.in)).nextInt();
        //단수의 반복분  3입력 -> ex)1단,2단,3단   //
        for(int i=1; i<=num; i++) {
            System.out.print(i + "단\t");
        }
        	System.out.println("\t");
        //이중 for문  안쪽을 for문을 먼저 해석한다 !!
        //? * 곱하기 9까지에 대한 반복문 
        for(int i=1; i<=9; i++) {
            //1.구구단 구문이 나오느 부분  0분터 시작하는이유 i가 1부터 시작하기 때문이다
            for(int j=1; j<=num; j++) {
                //J= 몇단을 할것인지 /i=9까지 곱하는 반복문
                System.out.print(j+ "*" + i + "=" + j*i + " ");
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
	
