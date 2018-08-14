package com.pistachio.lotto;

public class lottoMain {

	public static void main(String[] args) {
		//로또 클래스
		//class Lotto;
		//generate함수 만들기(6개의 숫자를 보여주는것)

	
		Lotto  lotto = new Lotto();
		int numbers[] = lotto.generate(); 		
	
		for(int num : numbers ) {
			System.out.printf(num+",");
		}
	}
}
