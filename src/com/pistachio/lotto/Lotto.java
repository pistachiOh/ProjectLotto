package com.pistachio.lotto;
//로또 번호를 생성하는 클래스
import java.util.Random;
public class Lotto {

	//반환값이 있는 함수의 경우, 반환타입으로 result변수를 먼저 선언하고
	//마지막에 return해놓고 코딩을 시작한다.
	
	//public int[] generate() {
	//int[] result = new int[6];
	
	//이 사이에 코드 작성
	//36개의 코드 중에 count개를 맞추는 것이 로또의 규칙.
	//return result;
	
	public int[] generate(int count){
		int[] result = new int [count];
		
		Random random = new Random();
		
		for(int i =0; i<count;) {
			int randomNumber = random.nextInt(35)+1;
			if(!isExist(randomNumber, result)){
				result[i] = randomNumber;
				i= i+1;
			}
		}
		return result;
	}
	private boolean isExist(int randomNumber,int randomArray[]  ) {
	Boolean result = false;
	
	for(int num : randomArray) {
		if(num ==randomNumber);
		return true;
	}
	return result;
	}
	
	
	final int DEFAULT_Count = 6;
	public int[] generate() {
		return generate(DEFAULT_Count);
	}
	
  }

