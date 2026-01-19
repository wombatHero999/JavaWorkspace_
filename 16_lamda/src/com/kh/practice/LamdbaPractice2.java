package com.kh.practice;

public class LamdbaPractice2 {

	public static void main(String[] args) {
		Calculator<Integer> adder = (a , b) -> a * b;
		System.out.println(adder.operate(10, 20));
		
		Calculator<Integer> findMax = Math::max;
		System.out.println(findMax.operate(10, 20));
		
		Calculator<String> combiner = (a, b) -> a+"-"+b;
		System.out.println(combiner.operate("hello","world"));
	}
	
	@FunctionalInterface
	interface Calculator<V>{
		V operate(V v1, V v2);
	}
}












