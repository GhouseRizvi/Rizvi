package constructor;

public class TestObMain {

	public static void main(String[] args) {

		TestObjectReferences to = new TestObjectReferences(15,20);
		System.out.println("Value of a and b \n"+to.a+" "+to.b);
		to.meth(to);
		System.out.println("Value of a and b \n"+to.a+" "+to.b);
		
	}

}
