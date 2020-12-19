package com.ecodation.innerclass;

import com.ecodation.innerclass.DisClass.icClass;

public class InnerClassTestMain {

	public static void main(String[] args) {
		DisClass disClass = new DisClass();
		disClass.setAd("Hamit");
		disClass.setSoyad("Mızrak");

		// DisClass.icice icteki=new DisClass.icice();
		DisClass.icClass ic = new icClass(); // new disClass.icClass();
		ic.setOzelBilgiler("Deneme iç class");
		System.out.println(ic);

		/*
		 * DisClass.icClass ic = new icClass(); //doğrusu DisClass.icice icteki=new
		 * DisClass.icice(); //static nested class için böyle yapıyoruz. Bütün alanda
		 * aynı bilgiler ve özel bilgiler olacak NestedClass.icice icteki2=nested.new
		 * icice(); //static yazmazsak
		 * 
		 * 
		 */
	}

}
