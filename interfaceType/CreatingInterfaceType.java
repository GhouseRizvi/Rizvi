package interfaceType;

public class CreatingInterfaceType {
	public Run1 getObjectType(int input) {//Creating interface type argument
		Run1 r = null;
		
		if(input == 1) {
			r = new Sample5();
		}else if(input == 2 ) {
			r = new Sample6();
		}
		
		return r;
	}

}
