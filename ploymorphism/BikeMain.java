package polymorphismAssignment;

public class BikeMain {

	public static void main(String[] args) {
		
		BikeImplementation bi = new BikeImplementation();
		bi.Catalog(new Fz25());
		bi.Catalog(new RoylEnfield());
		bi.Catalog(new Dominor());
	}

}
