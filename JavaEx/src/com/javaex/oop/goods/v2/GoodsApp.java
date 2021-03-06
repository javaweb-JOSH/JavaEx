package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	setter를 이용한 우회 접근
		notebook.setName("LG GRAM");
		notebook.setPrice(15000000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice(650000);
		
		System.out.printf("%s, %d원%n",	
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();	
	}

}
