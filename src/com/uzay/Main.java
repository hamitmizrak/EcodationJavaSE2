package com.uzay;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Hamit");
		student.setSurname("Mızrak");

		System.out.println("Adınız: " + student.getName() + " Soyadınız: " + student.getSurname());
	}
}
