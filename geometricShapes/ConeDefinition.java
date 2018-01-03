package geometricShapes;

public class ConeDefinition extends Cone {
	final double pi = 3.142;
	
	void radius(double height,double surfaceArea) {
		double radius = Math.sqrt((surfaceArea*surfaceArea)/(pi*((pi*(height*height))+2*surfaceArea)));
		System.out.println("Radius of a cone is :"+radius);
	}
	
	void surfaceArea(double radius,double height) {
		double surfaceArea = pi*(radius*(radius+Math.sqrt((height*height)+(radius*radius))));
		System.out.println("Surface area of a Cone is :"+surfaceArea);
	}
	
	void slantHeight(double radius,double height) {
		double slantHeight = Math.sqrt((radius*radius)+(height*height));
		System.out.println("slant height of a Cone is :"+slantHeight);
	}
	
	void latralSurface(double radius,double height) {
		double latralSurface = pi*(radius*(Math.sqrt((radius*radius)+(height*height))));
		System.out.println("Lateral surface of a Cone is :"+latralSurface);
	}
	
	void baseArea(double radius) {
		double baseArea = pi*(radius*radius);
		System.out.println("Base area of a Cone is :"+baseArea);
	}
	
	void height(double radius,double volume) {
		double height = 3*((volume)/(pi*(radius*radius)));
		System.out.println("Height of a Cone is :" +height);
	}
	
	void volume(double radius,double height) {
		double volume = pi*((radius*radius)*(height/3));
		System.out.println("volume of the Cone is :"+volume);
	}
}
