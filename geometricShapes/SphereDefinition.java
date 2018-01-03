package geometricShapes;

public class SphereDefinition extends Sphere {
	 void radius(double diameter) {
		 double radius = diameter/2;
		 System.out.println("Radius of sphere is : "+radius);
		 
	 }
	 void volume(double radius) {
		 double pi = 3.142;
		 double volume = 4/3*(pi*(radius*radius*radius));
		 System.out.println("volume of sphere is :"+volume);
	 }
	 void surfaceArea(double radius) {
		 double pi = 3.142;
		 double surfArea = 4*(pi*(radius*radius));
		 System.out.println("Surface area of sphere is :"+surfArea);
	 }
	 void diameter(double radius) {
		 double diameter = 2*radius;
		 System.out.println("Diameter of the sphere is :"+diameter);
	 }
}
