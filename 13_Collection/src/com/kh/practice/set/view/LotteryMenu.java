package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 추첨 프로그램 ==========");
			System.out.println("******* 메인 메뉴 ******* \r\n" + "1. 추첨 대상 추가   \r\n" + "2. 추첨 대상 삭제   \r\n"
					+ "3. 당첨 대상 확인   \r\n" + "4. 정렬된 당첨 대상 확인  \r\n" + "5. 당첨 대상 검색   \r\n" + "9. 종료    ");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1 -> insertObject();
			case 2 -> deleteObject();
			case 3 -> winObject();
			case 4 -> sortedWinObject();
			case 5 -> searchWinner();
			case 9 -> {
				return;
			}
			default -> {
				System.out.println("잘못 입력하였습니다.");
			}
			}
		}
	}

	public void insertObject() {
//		추가할 추첨 대상 수를 입력 받아 입력한 수만큼  
		System.out.print("추가할 추첨 대상 수 : ");
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("핸드폰 번호 : ");
			String phone = sc.next();
			
			Lottery l = new Lottery(name, phone);
			boolean result = lc.insertObject(l);
			if(!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println("추가 완료되었습니다.");
	}

	public void deleteObject() {
		System.out.print("삭제할 이름 : ");
		String name = sc.next();
		
		System.out.print("삭제할 전화번호 : ");
		String phone = sc.next();
		
		Lottery remove = new Lottery(name, phone);
		boolean result = lc.deleteObject(remove);
		
		if(result) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
	}

	public void winObject() {
		Set s =  lc.winObject();
		System.out.println(s);
	}

	public void sortedWinObject() {
		//lc에서 받아온 Set객체를 Iterator를 통해 출력
		TreeSet<Lottery> set = lc.sortedWinObject();
		Iterator<Lottery> l = set.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}

	public void searchWinner() {
//		검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해 
//		객체에 정보를 담아 lc에 객체를 보냄.
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("핸드폰 : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		
		if(result) {
			System.out.println("축하합니다.");
		}else {
			System.out.println("다음기회에..");
		}
	}

}
















