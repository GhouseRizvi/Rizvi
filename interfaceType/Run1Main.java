package interfaceType;

public class Run1Main {

	public static void main(String[] args) {
		System.out.println("run1 implemented inside sample5");
		Run1 r = new Sample5();
		r.m1();
		r.m2();
		System.out.println("----------------------------------");
		System.out.println("Run1 implemented inside the sample6");
		Run1 r1 = new Sample6();
		r1.m1();
		r1.m2();
		System.out.println("______________________________________");
		System.out.println("Calling the run type");
		CreatingInterfaceType cit = new CreatingInterfaceType();
		Test t = new Test();
		t.test(cit.getObjectType(1));
		System.out.println("Objetype 1 is running");
		System.out.println("____________________________");
		t.test(cit.getObjectType(2));
		System.out.println("Object Type 2 is running");
	}
/*
	an interface can be implemented by multiple classes as they behave according
	to the implementation inside each class this is known as the runtime polymorphism*/
}
