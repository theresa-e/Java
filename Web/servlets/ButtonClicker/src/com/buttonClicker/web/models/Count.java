package com.buttonClicker.web.models;

public class Count {
	public static int count = 1;
	
	public Count() {
	}
	
	public void increaseCount() {
		count++;
	}
	
	public int getCount() {
		return this.count;
	}
}
