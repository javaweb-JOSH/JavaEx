package com.javaex.oop.goods.v4;

//	v4. this : 객체 자신을 의미
//		this() : 내부에 있는 다른 생성자를 호출
public class Goods {
	//	필드
	private String name;	//	객체내부 name
	private int price;
	
	//	코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
	//		but 사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다
	//	생성자 1
	public Goods(String name) {
		this.name = name;
	}
	
	//	모든 필드를 초기화하는 생서자: 생성자 2
	public Goods(String name, int price) {
//		this.name = name;
		//	내부에 있는 다른 생성자
	
		this(name);
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
		System.out.printf("상품 이름:%s%n가격: %d원%n", name, price);
	}

}
