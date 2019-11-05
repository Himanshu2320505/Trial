package learningoops;

import java.util.ArrayList;
import java.util.Arrays;

class Dog extends TestSuper2 {
	void eat() {
		System.out.println("eating bread from same class...");
	}

	void bark() {
		System.out.println("barking same class...");
	}

	void work() {
		super.eat();
		bark();
	}
}

class TestSuper2 {
	void eat() {
		System.out.println("eating from parent class...");
	}
}

public class Overiding {
	public static void main(String[] args) {
		//Dog d = new Dog();
		//d.work();
		 
		
	}
}
