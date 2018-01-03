package ploymorphism;

public class FlowerMain {

	public static void main(String[] args) {
		ImplementFlowers ifl = new ImplementFlowers();
		ifl.list(new Rose());
		ifl.list(new Lotus());
		ifl.list(new Lilies());

	}

}
