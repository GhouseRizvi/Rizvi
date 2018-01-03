package geometricShapes;

public abstract class Cylender {

	abstract void radius(double volume,double height);
	abstract void volume(double radius,double height);
	abstract void height(double radius,double volume);
	abstract void  surfaceArea(double radius,double height);
	abstract void baseArea(double radius);
	abstract void  lateralSurface(double radius,double height);
	
	
}
