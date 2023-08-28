package com.ancile.lambda;


interface Demo{
	//int sum(int a, int b);
	
	
	default void jik() {
		System.out.println("From interface");
	}
	static void jikk() {
		System.out.println("From ss interface");
	}
	void ss();
}
public class DemoLambda implements Demo{
	public void ss() {
		System.out.println("SS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo d = (a,b)->{return a+b;};
//		System.out.println(d.sum(10,20));
//		DemoLambda d = new DemoLambda();
//		d.jik();
//		d.ss();
		Demo.jikk();

	}

}
