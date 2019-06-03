package com.biz.myclass;

public class Oop_10 {

	public static void main(String[] args) {

		
		int ret = add(50,100);
		ret = MyClass_03.add(100, 200);
			
	}
	
	public static int add(int num1, int num2) {   //main에서 직접 method를 사용하라면 똑같이 static을 사용한다
		return num1 + num2;
	}

}
