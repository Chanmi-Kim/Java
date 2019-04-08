package com.test.example.collection;

public class MyQueue {
	
	private String[] list;
	private int index = 0;
	private int capacity = 0;
	
	public MyQueue() {
		this(4);
	}
	
	public MyQueue(int initialCapacity) {
		this.capacity = initialCapacity;
	}
	
	public void add(String s) {
		
		if (this.list == null) {
			this.list = new String[this.capacity];
		}
		
		doubling();
		
		this.list[index] = s;
		this.index++;
		
	}
	
	private void doubling() {
		if (this.index == this.list.length) {
			
			String[] temp = new String[this.list.length * 2];
			
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;
			
		}
	}
	
	@Override
	public String toString() {
		
		String temp = "";
		
		for (String s : this.list) {
			temp += s + ", ";
		}
		
		temp += "\r\nindex : " + this.index;
		temp += "\r\nlength : " + this.list.length;
		
		return temp;
		
	}
	
	public String poll() {
		
		String temp = this.list[0];
		
		for (int i=0; i<this.index-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		
		return temp;
	}
	
	public int size() {
		
		return this.index;
	}
	
	public String peek() {
		
		return this.list[0];
	}
	
	public void clear() {
		
		this.index = 0;
	}

	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}
}
