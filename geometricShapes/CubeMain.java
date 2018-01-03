package geometricShapes;

public class CubeMain {

	public static void main(String[] args) {
		System.out.println("Cube Calculation");
		Cube c = new CubeDefinition();//Up-Casting
		c.area(2.3);
		c.volume(4.5);
		c.spaceDiagonal(3.24);
	}

}
