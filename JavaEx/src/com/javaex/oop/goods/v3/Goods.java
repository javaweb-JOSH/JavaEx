package com.javaex.oop.goods.v3;

//	v. 생성자
//	new 키워드와 함꼐 사용되고 객체의 초기화를 담당한다
public class Goods {
	//	필드
	private String name;	//	객체내부 name
	private int price;
	
	//	코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
	//		but 사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다
	//	모든 필드를 초기화하는 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//Getter/Setter
	//	getter 만 있고, setter가 없으면 -> ReadOnly(읽기만)
	public String  getName() {
		return name;
	}
	
//	public void setName(String name) {	//	바깥입력 name
//		this.name = name;	// this <- 중요 객체내부이름
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	출력용 메서드
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격: %원%n", name, price);
	}

}
