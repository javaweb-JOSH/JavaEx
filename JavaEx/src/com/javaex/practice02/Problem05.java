package com.javaex.practice02;

public class Problem05 {

	public static void main(String[] args) {
		//다음과 같이 배열 선언
		int scoreboard[][] = {
			 {80, 75, 90, 95, 78},
			 {92, 88, 89, 92, 70},
			 {78, 80, 85, 87, 63},
			 {83, 84, 89, 87, 75},
			 {89, 83, 93, 94, 78}
					};
		//	배열 내에서 85점 이상인 점수만 뽑아, 총 합과 평균값을 산출하세요.
		int total = 0, count = 0;
		
		//	행 루프
		for (int row = 0; row < scoreboard.length; row++) {
			//	열 루프
			for (int col = 0; col < scoreboard[row].length; col++) {
				//바교
				if (scoreboard[row][col] >= 85) {
					total += scoreboard[row][col];
					count++;
				}
			}
		}
			
		//	결과 출력
			System.out.println("합계:" + total);
//			System.out.println("평균:" + ((double)total / count));
			System.out.printf("평균:%.2f%n", ((double)total / count));
	}

}
