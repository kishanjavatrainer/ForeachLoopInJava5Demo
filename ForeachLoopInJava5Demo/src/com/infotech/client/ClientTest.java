package com.infotech.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Sean");
		nameList.add("Martin");
		nameList.add("Sam");
		nameList.add("Tommy");
		
		Iterator<String> iterator = nameList.iterator();
		while (iterator.hasNext()) {
			String name =  iterator.next();
			System.out.println(name);
		}
		System.out.println("------------------------------------");
		for (String name : nameList) {
			System.out.println(name);
		}
		
		String nameArr[] = new String[4];
		nameArr[0] = "Johnny Depp";
		nameArr[1] = "Russell Crowe";
		nameArr[2] = "Brad Pitt";
		nameArr[3] = "Angelina Jolie";
		System.out.println("------------------------------------");
		for (String name : nameArr) {
			System.out.println(name);
		}
	}
}
