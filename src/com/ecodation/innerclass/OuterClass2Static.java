package com.ecodation.innerclass;

public class OuterClass2Static {
	int x = 25;

	static class InnerClass {
		int y = 45;
	}

	public static void main(String[] args) {
		OuterClass2Static outer = new OuterClass2Static();
		OuterClass2Static.InnerClass inner = new InnerClass();
		System.out.println(outer.x + inner.y);

	}
}
