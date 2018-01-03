package downcasting;

public class DogImpl {

	public void list(Dog d) {
		Dog d1 = new Dog();
		PetDog pd =(PetDog) d1;
		Dog d2 = new Dog();
		PoliceDog pld = (PoliceDog) d2;
		pd.dogName();
		d.getType();
		pld.secretId();
	
	}
}
