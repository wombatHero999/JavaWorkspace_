package com.kh.chap01_innerClass.part03_local;

public class OuterClass3 {
	
	/* 
	 * 지역 내부 클래스
	 *  - 지역(local)변수처럼 메서드 내부에 정의된 클래스
	 *  - 메서드 안에서만 사용이 가능하며, 메서드가 호출될 때 생성된다.
	 *  - 지역내부클래스안에서 사용되는 지역변수는 "상수(final)"처럼 취급 된다.
	 *    (메모리 효율성을 위해)
	 *    
	 *  메모리 복습
	 *  1) stack
	 *   - 메서드 호출시 스택에는 메서드프레임이 쌓인다.
	 *   - 메서드 프레임 내부에는 지역변수를 위한 저장공간이 할당된다.
	 *   - 메서드 종료시에는 메서드프레임이 제거되면서 지역변수의 저장공간도 함께 소멸된다.
	 *  
	 *  2) static키워드가 붙은 변수는 static메모리 영역에 저장공간이 할단된다
	 *   static final ... -> static 메모리 내부의 constant pool에 할당
	 *   final 키워드만 붙은 변수도 constant pool에 저장공간이 임시로 할당된다.
	 * */
	

}












