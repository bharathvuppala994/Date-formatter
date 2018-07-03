package com.siri.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		String str = "Java";
		
		String intN = "100";
		
		//int j = intN;
		
		Integer c = Integer.parseInt(str);//Auto Boxing
		
		Integer strToInt = Integer.parseInt(intN);
		
		String newS = String.valueOf(i);
		
		int newI = strToInt;
	
		float f = 10.3f;
		
		Float f1 = f;
		
		System.out.println(f1.toString());
		
		System.out.println(strToInt);

		String cryt = "Hello";
		
		char[] cyrtArr = cryt.toCharArray();
		for(char ch : cyrtArr) {
			System.out.println((int) ch);
		}
	}

}
