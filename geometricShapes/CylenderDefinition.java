package geometricShapes;

public class CylenderDefinition extends Cylender {
		
	final double pi = 3.142;
	
	void radius(double volume,double height) {
		double radius = Math.sqrt(volume/(pi*height));
		System.out.println("Radius of the cylender is :"+radius);
	}
	
	void volume(double radius,double height) {
		double volume = pi*((radius*radius)*height);
		System.out.println("volume of a cylender is :"+volume);
	}
	
	void height(double radius,double volume) {
		double height = volume/(pi*(radius*radius));
		System.out.println("Height of the cylender is :"+height);
	}
	
	void  surfaceArea(double radius,double height) {
		double surfaceArea = (2*(pi*radius*height)) + (2*(pi*(radius*radius)));
		System.out.println("Surface area of a cylender is :"+surfaceArea);
	}
	
	void baseArea(double radius) {
		double baseArea = pi*(radius*radius);
		System.out.println("Base area of a cylender :"+baseArea);
	}
	
	void  lateralSurface(double radius,double height) {
		double lateralSurface = 2*(pi*(radius*height));
		System.out.println("Lateral surface of a cylender is :"+lateralSurface);
	}
}
