package com.HRank.LinkedList;

import java.util.Iterator;

public class LinkedList1<T> implements Iterable<T> {

	private Node<T> head;
	
	public LinkedList1(){
		head = null;
	}
	
	public boolean isEmplty(){
		return (head == null);
	}
	
	
	
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	public class Node<T>{
		
		T data;
		Node<T> next;
		
		public Node(T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
	}
	
}
