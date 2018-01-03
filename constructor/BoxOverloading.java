package constructor;

public class BoxOverloading {
	double width;
	double height;
	double depth;
	public BoxOverloading(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	public BoxOverloading(){
		width = -1;
		height = -1;
		depth = -1;
	}
	public BoxOverloading(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return width*height*depth;
	}

}
