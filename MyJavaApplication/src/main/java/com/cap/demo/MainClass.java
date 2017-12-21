package com.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass salesClass=new SalesClass();
		salesClass.display();
		greetings();
		System.out.println(ColorConstants.RED);
	}

	
	public static void greetings(){
		System.out.println("Welcome to GIT Repository");
	}
}

enum ColorConstants{
	RED("RED");
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	ColorConstants(String color){
		this.color=color;
	}
	
	
} 