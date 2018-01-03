package ploymorphism;

public class SamplMain {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		Sample s1 = new Sample();
		s1.test(d1);
		s1.test(d2);
		s1.test(d3);
	}

}
