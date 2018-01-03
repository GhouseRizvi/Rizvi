package geometricShapes;

public class CubeDefinition extends Cube {
	 void volume(double a) {
		 double res = (a*(a*a));
		 System.out.println("Volume of a Cube is :"+res);
		
	}
	 void area(double a) {
		double res = 6*(a*a);
		System.out.println("Area of cube is :"+res);
	}
	 void spaceDiagonal(double a) {
		 double res = Math.sqrt(3)*a;
		 System.out.println("Diagonal Space of a cube is :"+res);
	 }

}
