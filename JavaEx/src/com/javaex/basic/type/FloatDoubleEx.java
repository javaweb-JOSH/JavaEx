package com.javaex.basic.type;

//	실수
//	float(4) < double(8)
//	정밀도를 포기하고 표현 범위를 넓힌 자료형
//	표현 범위 : byte < short < int(4) < long(8) < float(4) < double(8)
public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar = 3.14159F;	//	F or f 접미
		double doubleVar = 3.14159;	//	살수형 기본은 double
		
		int intVar = 30000000;
		floatVar = 3E7f;
		doubleVar = 314159E-5;	// =3.14159
		
		System.out.println("int:" + intVar);
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		//	부동소수점 계산의 유의점
		//	folat, double 정밀도 포기하고 표현범위를 넓힌 자료형
		//	정밀계산에 활용시에는 유의 (예:금융)
		System.out.println(0.1 * 3);

	}

}
