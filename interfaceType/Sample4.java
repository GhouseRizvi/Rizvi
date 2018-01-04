package interfaceType;

public class Sample4 implements Demo5,Demo6 {

	public void m1() {

		System.out.println("Single implementation is enough if both\n"
				+ "the interface type has a method with same name");
	}

}
