package constructor;

public class BoMain {

	public static void main(String[] args) {
		//calling unargumentd constructor
		BoxObject bo1 = new BoxObject();
		System.out.println(bo1.volume());
		//calleing argumented constructor
		BoxObject bo2 = new BoxObject(10, 20, 30);
		System.out.println(bo2.volume());
		//calling object type constructor
		BoxObject bo3 = new BoxObject(bo2);
		System.out.println(bo3.volume());
		//calling uniargumented constructor
		BoxObject bo4 = new BoxObject(7);
		System.out.println(bo4.volume());
		
	}

}
