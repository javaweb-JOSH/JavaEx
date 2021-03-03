package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		//"1.예금" 선택후 금액을 입력하면 예금액이 합산됩니다.
		//"2.출금" 선택후 금액을 입력하면 예금액이 차감됩니다.
		//"3.잔고" 선택시 현재 잔고가 출력됩니다.
		//"4.종료" 선택시 종료됩니다.
		//"1,2,3,4 이외의 숫자" -> "다시 입력해주세요." 메세지 출력됩니다
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("");
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택");
			
			int menuNo = sc.nextInt();
			
			switch(menuNo ) {
			
			case 1: //	에금일떄
				System.out.print("예금액>");
				break;
			case 2: //	출금일때
				break;
			case 3: //	잔금일떄
				break;
			case 4:	//	종료일때
				run = false;
				break;
			default: //	메뉴이외의 번호일때
				System.out.println("다시 입력해주세요.");
				break;
				
			}//switch
			
		}//while
		
		System.out.print("프로그램 종료");
		sc.close();
	}
	
}
