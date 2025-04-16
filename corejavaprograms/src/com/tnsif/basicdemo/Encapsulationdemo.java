package com.tnsif.basicdemo;

public class Encapsulationdemo {
int serialnumber;
String name;
int age;
public void show() {
System.out.println("serialnumber "+serialnumber + " name "+ name + " age "+age);

}
	public static void main(String[] args) {
		Encapsulationdemo e=new Encapsulationdemo();
		e.serialnumber=18;
		e.name="jenifer";
		e.age=21;
		
		e.show();
		

	}

}
