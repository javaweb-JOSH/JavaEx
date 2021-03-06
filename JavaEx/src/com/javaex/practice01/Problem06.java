package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// a.입력받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다
		// 예) 입력이 7이면 16을 출력 (1+3+5+7 =16)
		// b.입력받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다
		// 예) 입력이 10이면 30을 출력 (2+4+6+8+10 =30)
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		
		int startNum = (num % 2 == 0) ? 2:1;
		int sum = 0;
		
		for(int i = startNum; i <= num; i += 2) {
			sum += i;
		}
		
		System.out.println("결과:" + sum);
		scanner. close();
	}

}
