package com.interfaceex;

interface Drawable6 {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle5 implements Drawable6 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		Drawable6 d = new Rectangle5();
		d.draw();
		System.out.println(Drawable6.cube(3));
	}
}