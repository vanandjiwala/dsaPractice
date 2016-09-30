package com.HRank.Implementation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkdList<String> list = new LinkdList<String>();
		list.addFirst("new1");
		System.out.println("1 is" + list.getFirst());
		
//		list.addFirst("new1");
//		list.addFirst("new1");

		System.out.println(list.contains("new1"));
	}

}
