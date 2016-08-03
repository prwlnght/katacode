package com.kata.chop;

public class testBinaryChop {

	public static void  main(String[] args){
		
		int [] testArray = {1, 0, -5, 5, 6, 3, 2};
		
		for (int index = 0;index < testArray.length; index = index + 1  ){
		
		System.out.println("The index of the number " + testArray[index] + "in Array 1 is " + binarychop.binaryChop(testArray[index], new int[] {1,2,3}));
		
		System.out.println("The index of the number " + testArray[index] + " in Array 2 is " + binarychop.binaryChop(testArray[index], new int[] {3,1,5, 0, 9, 5, 6}));
		
		System.out.println("The index of the number " + testArray[index] + " in Array 3 is " + binarychop.binaryChop(testArray[index], new int[] {}));
		
		System.out.println("The index of the number " + testArray[index] + " in Array 4 is " + binarychop.binaryChop(testArray[index], new int[] {7}));

	}
	
		System.out.println("The index of the number " + 1 + " is " + binarychop.binaryChop(1, new int[] {1,2,3}));
		
	}
}
