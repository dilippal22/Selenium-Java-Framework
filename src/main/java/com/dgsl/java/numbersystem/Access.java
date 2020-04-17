// General Practice Program

package com.dgsl.java.numbersystem;

class Access {

	public int x;

	static int y;

	void cal(int a, int b) {
		x += a;
		y += b;
	}
}

class static_specifier {
	public static void main(String args[]) {
		Access object1 = new Access();
		Access object2 = new Access();
		object1.x = 0; // x = 0
		object1.y = 0; // y = 0
		object1.cal(1, 2); // x = 1, y = 2
		object2.x = 0; // x = 0
		object2.cal(2, 3); // x = 2, y = 2 + 3 = 5
		System.out.println(object1.x + " " + object2.y); // x = 2, y = 5
	}
}
