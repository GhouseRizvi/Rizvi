package constructor;

public class BWAMain {

	public static void main(String[] args) {
		
		BoxWithArgument bwa = new BoxWithArgument(10.0, 20.0, 30.0);
		System.out.println(bwa.volume());
	}

}
