package geometricShapes;

public class EllipseDefinition extends Ellipse {
	void area(double a,double b) {
		double pi = 3.142;
		double area = pi*(a*b);
		System.out.println("Area of ellipse is :"+area);
	}
	
	void axisA(double area,double b) {
		double pi = 3.142;
		double axis_a =  area/(pi*b);
		System.out.println("value for Aixs a is :"+axis_a);
	}
	
	void axisB(double area,double a) {
		double pi = 3.142;
		double axis_b =  area/(pi*a);
		System.out.println("value for Aixs b is :"+axis_b);

	}
	
	void circumference(double a,double b) {
		double circum=2*3.14*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
	System.out.println("Circumference of ellipse is :"+circum);
	}

}
