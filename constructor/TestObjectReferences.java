package constructor;

public class TestObjectReferences {

	int a;
	int b;
	public TestObjectReferences(int i,int j) {
		i *= 2;
		j /= 2;
	}
	void meth(TestObjectReferences to) {
		to.a *= 2;
		to.b /= 2;
	}
	
}
