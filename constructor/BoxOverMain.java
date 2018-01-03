package constructor;

public class BoxOverMain {

	public static void main(String[] args) {
		double vol;
		BoxOverloading bo = new BoxOverloading();
		vol = bo.volume();
		System.out.println(vol);
		BoxOverloading bo1 = new BoxOverloading(10, 20, 30);
		vol=bo1.volume();
		System.out.println(vol);
		BoxOverloading bo2 = new BoxOverloading(7);
		vol = bo2.volume();
		System.out.println(vol);
	}

}
