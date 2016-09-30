package com.HRank.Implementation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkdList<T> implements Iterable<T>{
	
	Node<T> head;
	
	//constructor
	public LinkdList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	/*
	 * 
	 * First Node Methods
	 * 
	 * */
	
	public void addFirst(T data){
		head = new Node<T>(data, head);
	}
	
	public T getFirst(){
		if(head == null) throw new NoSuchElementException();
		return head.data;
	}
	
	public T removeFirst(){
		T temp = getFirst();
		head = head.next;
		return temp;
	}
	
	
	/*	
	 * 
	 * Last Node Methods
	 * 
	 * */
	
	public void addLast(T data){
		if(head == null){
			addFirst(data);
		}else{
			Node<T> temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			
			temp.next = new Node<T>(data, null);
			
		}
	}
	
	public T getLast(){
		if(head == null) throw new NoSuchElementException();
		Node<T> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void clearAll(){
		head = null;
	}
	
	public boolean contains(T value){
		
		Node<T> temp = head;
		while(temp.next != null){
			System.out.println(temp.data);
			if(temp.data.equals(value)) return true;
		}
		
		return false;
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
