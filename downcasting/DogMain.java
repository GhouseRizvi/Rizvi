package downcasting;

public class DogMain {

	public static void main(String[] args) {
		
		/*DogImpl di = new DogImpl();
		di.list(new Dog());
		di.list(new PoliceDog());*/
		
		Dog d1 = new Dog();
		PetDog pd = (PetDog)d1;
		pd.dogName();
		pd.getType();
		Dog d2 = new Dog();
		
		PoliceDog pl = (PoliceDog)d2;
		pl.getType();
		pl.secretId();
		

		
		
		
		
		/*//creating the different objects with super class reference
		Dog obj1 = new Dog();
		*//**
		 *  Object of Pet Dog is created with the Dog reference since
		 * Upcasting is done automatically for us we don't have to worry about it
		 *//*
		Dog obj2 = new PetDog();
		
        *//**
         *  Object of Police Dog is created with Dog Reference since                
         *  Upcasting is done automatically for us we don't have to worry       
         *  about it here even though we are extending PoliceDog with PetDog 
         *  since PetDog is extending Dog Java automatically upcast for us 
         *//*
		Dog obj3 = new PoliceDog();*/
		
		
	}

}
