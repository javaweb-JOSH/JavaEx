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
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String retry;
			int num = (int) (Math.random() * 100) + 1;
			int inputNum;
			
			System.out.println("====================");
			System.out.println("[숫자맞추기게임 시작");
			System.out.println("====================");
			while (true) {
				
				System.out.print(">>");
				//	사용자 입력값 받기
				//	입력한 값 높은지 낮은지 맞추었는지 판단
				
			}
			sc.nextLine();
			
			System.out.print("게임을 종료하시겠습니다? (y/n) >>");
			retry = sc.next();
			if ("y".equals(retry)) {
				//	"y"일떄 종료시키기
			}
		}
		
		sc.close();
		

	}

}
