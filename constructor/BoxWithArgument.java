package constructor;

public class BoxWithArgument {

	double width;
	double height;
	double depth;
	public BoxWithArgument(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width*height*depth;
	}
}
