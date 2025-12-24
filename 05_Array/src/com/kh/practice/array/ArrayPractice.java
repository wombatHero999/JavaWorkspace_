package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//		역순으로 배열 인덱스에 넣은 후그 값을 출력하세요
		int arr[] = new int[10];
		// [0,0,0,0,0,0,0,0,0,0,0]
		
		// 배열의 길이만큼 반복 진행
		// i => 0
		// i => 1
		// i => 2 ...
		// i => 9
		int value = 10;
		for(int i =0; i< arr.length; i++) {
			arr[i] = value--;
			System.out.print(arr[i]+" ");
		}
	}

	public void practice2() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();// 5
		
		int[] arr = new int[num];// [0,0,0,0,0]
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}

	public void practice3() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		int [] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i]+" ");
		}
		
	}

	public void practice4() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요
		String[] arr = {"월","화","수","목","금","토","일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num =sc.nextInt();
		
		if(!(num >= 0 && num <= 6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(arr[num]+"요일");
	}

	public void practice5() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println("\n총합 : "+sum);
	}

	public void practice6() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		System.out.print("문자열 : ");
		String str = sc.next(); 
		char[] arr = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		int count = 0;
		// 전체 문자 반복
		for(int i =0; i< arr.length; i++) {
			char ch = arr[i]; // 중복인지 검사하고자 하는 문자.
			
			// 문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인.
			boolean isDup = false;
			for(int j = 0; j<i; j++ ) {
				if(ch == arr[j]) {
					// 중복
					isDup = true;
					break;
				}
			}		
			if(!isDup) {
				System.out.print(ch+", ");
				count++;
			}
		}
		System.out.println("\n문자 개수 : "+count);
//		문자의 개수와 함께 출력하세요
	}

	public void practice7() {

	}

	public void practice8() {

	}

	public void practice9() {

	}

	public void practice11() {

	}

	public void practice12() {

	}
}
