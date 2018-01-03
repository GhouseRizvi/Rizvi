package constructor;

public class TestObjectParameter {
	int a;
	int  b;
	public TestObjectParameter(int i,int j) {
		a=i;
		b=j;
	}
	boolean equal(TestObjectParameter o) {
		if(o.a == o.a && o.b == o.b) {
			return true;
		}else {
			return false;
		}
	}
	public void meth(TestObjectParameter to) {
		// TODO Auto-generated method stub
		
	}

}
