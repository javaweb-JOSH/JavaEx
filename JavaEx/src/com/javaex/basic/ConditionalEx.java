package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifEx();
//		ifElseEx();
//		ifPractice();
//		swichchEx();
//		switchEx2();
//		switchEx3();
//		ifPractice02();
		ifPractice03();
	}
	private static void ifPractice03() {
//	점수를 입력받아 등급을 표시하는
//	프로그램을 작성하세요
//	90점 이상      이면"A 등급"
//	80점 이상 ~89점이면"B 등급"
//	70점 이상 ~79점이면"C 등급"
//  60점 이상 ~69점이면"D 등급"
//	60점 미만이면 "F 등급"
	Scanner scanner = new Scanner(System.in);
	System.out.println("점수를 입력하세요:");
	int score = scanner.nextInt();
	
	
	}
	private static void ifPractice02() {
//	점수를 입력받아
//	입력된 수가 3의
//  배수인지 판별하는 프로그램을
//  작성하세요
	Scanner scanner = new Scanner(System.in);
	System.out.println("점수를 입력하세요:");
	int score = scanner.nextInt();
	
	/*
	if (score % 3 == 0) {
		// 3의 배수
		System.out.println(score + "는 3의 배수입니다.");
	} else {
		System.out.println(score + "는 3의 배수가 아닙니다.");
	}
	*/
	System.out.println(score + "는 " +
			(score % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다."));
	
	scanner.close();
	}
	// Java의 case 문에는 char, String도 점검할 수있다
	private static void switchEx3() {
//	SUN -> 일요일

//	MON 
//	TUE
//	WED
//	THU
//      ->열공 
//	FRI
//      ->불금
//	SAT
//      ->주말
		String day = "TUE";
		String message;	//	결과 변수
		//	요일 변수: 지정된 범위의 값만 들어와야 한다
		//	문자열 사용을 자제하도록 (대소문자 or 오타위험)->enum 데이터 타입으로 변경하는게 좋다
		switch (day) {
		case "SUN":
			message = "일요일";
			break;	//	잊지말자
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "주말";
			break;
		default:
			message = "?";
		}
		
		System.out.println(day + "에는" + message);
	}
	private static void switchEx2() {
//		월을
//		입력받아 해당월의 일수를 출력하는
//		프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요:");
		
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일 입니다.");
			break;	//	잊지말자
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일 입니다.");
			break;
		default:
			System.out.println("?");
		}
		scanner.close();
	}
	// swich ~ case
	private static void swichchEx() {
//		code 값이
//		1이면 "R101호 입니다."
//		2이면 "R202호 입니다."
//		3이면 "R303호 입니다."
//		4이면 "R404호 입니다."
//		나머지는 (else)
//		상담원에게 문의하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목코드 (1. C, 2. C++, 3. Java, 4. Python):");
		
		int code = scanner.nextInt();
		
		switch (code){
			case 1: // code ==1
				System.out.println("R101호 입니다.");
				break; // 잊지말자
			case 2: // code ==2
				System.out.println("R202호 입니다.");
				break;
			case 3: // code ==3
				System.out.println("R303호 입니다.");
				break;
			case 4: // code ==4
				System.out.println("R404호 입니다.");
				break;
			default:	// 마지막 else
				System.out.println("관리자에게 문의하세요.");
			}
			scanner.close();
			
			// 이 뒤에서는 scanner의 메서드를 사용할 수 없다.
	}
	//	연습문제
	private static void ifPractice() {
//		code 값이
//		1이면 "R101호 입니다."
//		2이면 "R202호 입니다."
//		3이면 "R303호 입니다."
//		4이면 "R404호 입니다."
//		나머지는 (else)
//		상담원에게 문의하세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목코드 1. C, 2. C++. 3. Java, 4. Python)");
		int code = scanner.nextInt();	//	과목코드 입력
		
		if (code == 1) {
			System.out.println("R101호 입니다.");
		} else if (code == 2) {
			System.out.println("R202호 입니다.");
		} else if (code == 3) {
			System.out.println("R303호 입니다.");
		} else if (code == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요");
			
			scanner.close();
		} 
	}
	//	if ~ else if ~ else 분기문	
	private static void ifElseEx() {
//		숫자를
//		입력받아
//		숫자가
//		0보다 크면 양수 0보다 작으면 음수 0일떄는 0입니다를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num = scanner.nextInt();    //   정수 입력
		
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		//	중첩 if : if 문은 중첩될 수 있다.
		if (num == 0) {
			System.out.println("0입니다.");
		} else {	// != 0
			if (num > 0 ) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		//	if문의 중첩이 3단계 이상 -> 의심해보자
		
		scanner.close();
	}
	
	//	 if 분기문
	private static void ifEx() {

//		점수를 
//		입력받아
//		점수가
//		60점 이상이면 합격입니다 . 를 출력하세요
//		그렇지 않으면 불합격입니다. 를 출력하세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
			
			//	조건 분기
			if (score >= 60) {
				System.out.println("합격입니다.");
			} else {
				// 거짓이다
				System.out.println("불합격입니다.");
			}
	
			scanner.close();
	}
	

}
