package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// 숨겨진 숫자를 맞추는 게임
		// 프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
		// 사용자가 입력한 숫자가 결정된 숫자보다 높으면 "더 낮게" 출력
		// 사용자가 입력한 숫자가 결정된 숫자보다 낮으면 "더 높게" 출력되며
		// 정답을 맞춘경우 "맞았습니다."출력됩니다.
		// 게임을 반복하기 위해 y/n이라고 묻고 n인 경우 종료됩니다.
		// (y 인경우 다시 게임이 시작됩니다.
		Scanner scanner = new Scanner(System.in);
		
		//	바깥쪽 루프
		while (true) {
			//	게임 로직
			int num = (int)(Math.random() * 100) + 1;	// 1~100 사이의 정수난수			
			System.out.println("================");
			System.out.println("게임을 시작합니다");
			System.out.println("================");
			
			while (true) {				
				System.out.print(num + ">>");
				int inputNum = scanner.nextInt();
				//	num와 inputNum을 비교 -> 정답체크
				if (inputNum == num) {
					System.out.println("정답입니다!");
					break;
				} else if (inputNum < num) {
					System.out.println("더 높게");
				} else {
					System.out.println("더 낮게");
				}
								
			}
			
			System.out.print("게임을 종료하시겠습니다? (y/n) >>");
			String retry = scanner.next();	//	더 진행할 것인지를 물어봄

			if (retry.equals("y")) {
				break;
			
			}
		}
		
		scanner.close();
	}

}
