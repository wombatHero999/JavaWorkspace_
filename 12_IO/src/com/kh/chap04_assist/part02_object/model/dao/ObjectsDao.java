package com.kh.chap04_assist.part02_object.model.dao;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	public void fileSave() {
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("아이폰",1500000,"1111");
		arr[1] = new Phone("갤럭시",1000000,"1111");
		arr[2] = new Phone("갤럭시플립",1200000,"1111");
		
	}
	
}















