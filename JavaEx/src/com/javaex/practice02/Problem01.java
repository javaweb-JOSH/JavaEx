package com.javaex.practice02;

public class Problem01 {

	public static void main(String[] args) {
		// 주어진 배열 데이터를 이용 3의 배수의 개수와 배수의 합을 출력하는 프로그램을 작성
		int[] data = {1,3,5,7,9,11,15,19,18,20,30,33,31};
		int total = 0, count = 0;
		
		for (int num: data) {
			if (num % 3 == 0) {
				total += num;
				count++;
			}
		}
		
		System.out.println("3의 배수의 합:" + total);
		System.out.println("3의 배수의 갯수:" + count);
	}

}
