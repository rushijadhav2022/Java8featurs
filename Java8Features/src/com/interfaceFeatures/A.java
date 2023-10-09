package com.interfaceFeatures;
/*>The Java compiler adds public and abstract keywords before the interface method.
   >Moreover, it adds public, static and final keywords before data members.
   >Since Java 8, we can have default and static methods in an interface.
   >Since Java 9, we can have private methods in an interface.
   */

interface I1 {
	int num = 45; // by default public static final

	void doTask();

	default void doTask1() {
		System.out.println("This is default way to work");
	}

	static void m1() {
		System.out.println("This is static method");
	}

}

public class A implements I1 {

	public void doTask() {

		System.out.println("Performing some task");

	}

	@Override
	public void doTask1() {
		System.out.println("This is class A  way to work ");
	}

	public static void main(String[] args) {

		A a = new A();
		a.doTask();
		a.doTask1();
		I1.m1();

	}

}
