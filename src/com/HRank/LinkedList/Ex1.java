package com.HRank.LinkedList;

import java.util.LinkedList;

import javax.sound.sampled.ReverbType;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		System.out.println(list);
		
		LinkedList1<String> list1 = new LinkedList1<String>();
		System.out.println(list1.isEmpty());
		list1.addFirst("we");
		list1.addFirst("we");
		list1.addFirst("we");
		list1.addFirst("we");
		System.out.println(list1.isEmpty());
		System.out.println(list1.getFisrt());
		

		
	}

}
