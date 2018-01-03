package constructor;

public class TestObjMain {

	public static void main(String[] args) {
		TestObjectParameter ob = new TestObjectParameter(22, 10);
		TestObjectParameter ob1 = new TestObjectParameter(3, -34);
		TestObjectParameter ob2 = new TestObjectParameter(22, 10);
		System.out.println(ob.equal(ob1));
		System.out.println(ob.equals(ob2));
	}

}
