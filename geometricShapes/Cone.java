package geometricShapes;

public abstract class Cone {
	
	abstract void radius(double height,double surfaceArea);
	abstract void surfaceArea(double radius,double height);
	abstract void slantHeight(double radius,double height);
	abstract void latralSurface(double radius,double height);
	abstract void baseArea(double radius);
	abstract void height(double radius,double height);
	abstract void volume(double radius,double height);

}
