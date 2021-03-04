package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		//배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요-미니로또
		//(중복체크할것)
		int[] nums = new int[6];
		int idx = 0;	//	인덱스 변수
		
		while (idx <nums.length) {
			//	난수 발생
			int choice = (int)(Math.random() * 45) +1;
			//	중복 데이터 체크
			boolean isDuplicated =false;
			
			if (idx != 0) {
				//	중복 체크
				for (int i = 0; i < idx; i++) {
					//	내부 값 체크
					if (nums[i] == choice) {
						isDuplicated = true;
						break;
					}
				}									

	        }
			
			if (!isDuplicated) {
				//	중복되지 않을 떄 코드를 수행
				nums[idx] = choice;
				idx++;
			}
		}	// 난수 추출
		
		for (int value: nums) {
			System.out.print(value + " ");
		}
		System.out.println();
		
	}
}
