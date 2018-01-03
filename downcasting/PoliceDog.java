package downcasting;

public class PoliceDog extends Dog {
	public String getType() {
		System.out.println("I'm Police Dog");
		return "Police Dog";
	}
	public String secretId() {
		System.out.println("ID");
		return "ID";
	}

}
