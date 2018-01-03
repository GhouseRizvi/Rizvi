package downcasting;

public class PetDog extends Dog {
	public String getType() {
		System.out.println("PetDog");
		return "PetDog";
	}
	public String dogName() {
		System.out.println("I don't have any name");
		return "No Name";
	}

}
