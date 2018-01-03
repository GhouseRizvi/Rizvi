package constructor;

public class BoxObject {
	double width;
	double height;
	double depth;
	public BoxObject(double w,double h,double d) {
		width=w;
		height=h;
		depth=d;
	}
	public BoxObject(BoxObject bo) {
		width = bo.width;
		height = bo.height;
		depth = bo.depth;
	}
	public BoxObject() {
		width = -1;
		height = -1;
		depth = -1;
	}
	BoxObject(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*height*depth;
	}

}
