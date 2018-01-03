package constructor;

public class Box {
	double width;
	double height;
	double depth;
	public Box() {
		width=10;
		height=20;
		depth=30;
	}
	void voilume() {
		System.out.println("Volume of the Box is :"+width*height*depth);
	}

}
