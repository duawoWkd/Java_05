package com.biz.var;

public class Var_07 {

	public static void main(String[] args) {

		// 0부터 9까지 숫자의 ASCII 코드
		for(int i = '0'; i <= '9'; i++) {
			System.out.print(i);
			System.out.print(":");
			System.out.println((char)i);
		}
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			System.out.print(":");
			System.out.println((char)i);
			
		}
		// ASCII 코드 0부터 255(8bit)의 모든 값
		for(int i = 0; i < 256; i++) {
			System.out.print(i);
			System.out.print(":");
			System.out.println((char)i);

			
		}
	}

}
