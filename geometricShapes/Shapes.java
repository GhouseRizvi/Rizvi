package geometricShapes;

import java.util.Scanner;

public class Shapes {

	public  void inplement() {


		Scanner s1 = new Scanner(System.in);
		for(;;) {


			System.out.println("Enter : 1 for Cone \n"
					+ "Enter : 2 for Cube \n"
					+ "Enter : 3 for Cylender \n"
					+ "Enter : 4 for Ellipse \n"
					+ "Enter : 5 for Sphere\n"
					+ "Enter : 6 for Exit");
			System.out.println("Select Shapes \n");
			switch (s1.nextInt()) {

			 case 1: Cone c = new ConeDefinition();
			
			System.out.println("Enter : 1 for Radius \n"
					+ "Enter : 2 for Surface Area \n"
					+ "Enter : 3 for Slant Height \n"
					+ "Enter : 4 for Lateral Surface \n"
					+ "Enter : 5 for Base Area\n"
					+ "Enter : 6 for Height\n"
					+ "Enter : 7 for Volume\n");
			System.out.println("Select Property \n");

			switch(s1.nextInt()) {
			case 1: System.out.println("Enter values for"
					+ " Height and Surface area :\n");

			c.radius(s1.nextDouble(),s1.nextDouble());
			break;

			case 2 : System.out.println("Enter values for"
					+ " Radius and Height :\n");
			c.surfaceArea(s1.nextDouble(), s1.nextDouble());
			break;

			case 3 : System.out.println("Enter values for"
					+ " Radius and Height :\n");
			c.slantHeight(s1.nextDouble(), s1.nextDouble());
			break;

			case 4 : System.out.println("Enter values for"
					+ " Radius and Height :\n");
			c.latralSurface(s1.nextDouble(), s1.nextDouble());
			break;

			case 5 : System.out.println("Enter values for"
					+ " Radius :\n");
			c.baseArea(s1.nextDouble());
			break;

			case 6 : System.out.println("Enter values for"
					+ " Radius and volume :\n");
			c.height(s1.nextDouble(), s1.nextDouble());
			break;

			case 7 : System.out.println("Enter values for"
					+ " Radius and Height :\n");
			c.volume(s1.nextDouble(), s1.nextDouble());
			break;
			
			default: System.out.println("Invalid choice");
			break;
			}
			
			break;

			case 2: Cube c1 = new CubeDefinition();//Up-Casting
			System.out.println("Enter : 1 for Volume \n"
					+ "Enter : 2 for  Area \n"
					+ "Enter : 3 for Diagonal space \n");
			System.out.println("Select Property \n");
			switch(s1.nextInt()) {
			case 1: System.out.println("Enter area :\n");
			c1.area(s1.nextDouble());
			break;
			case 2: System.out.println("Enter area :\n");
			c1.volume(s1.nextDouble());
			break;

			case 3: System.out.println("Enter area :\n");
			c1.spaceDiagonal(s1.nextDouble());
			break;

			default : System.out.println("Invalid choice");
			break;


			}


			break;
			case 3: Cylender c2 = new CylenderDefinition();
			System.out.println("Enter : 1 for Radius \n"
					+ "Enter : 2 for Volume \n"
					+ "Enter : 3 for Height \n"
					+ "Enter : 4 for Surface Area \n"
					+ "Enter : 5 for Base Area\n"
					+ "Enter : 6 for Lateral Surface\n");
			System.out.println("Select Property \n");
			switch(s1.nextInt()) {
			case 1: System.out.println("Enter the values for Volume and Height :\n");
			c2.radius(s1.nextDouble(), s1.nextDouble());
			break;

			case 2: System.out.println("Enter the values for radius and Height :\n");
			c2.volume(s1.nextDouble(), s1.nextDouble());
			break;

			case 3: System.out.println("Enter the values for radius and Volume :\n");
			c2.height(s1.nextDouble(), s1.nextDouble());
			break;

			case 4: System.out.println("Enter the values for radius and Height :\n");
			c2.surfaceArea(s1.nextDouble(), s1.nextDouble());
			break;

			case 5: System.out.println("Enter the values for radius :\n");
			c2.baseArea(s1.nextDouble());
			break;

			case 6: System.out.println("Enter the values for radius :\n");
			c2.lateralSurface(s1.nextDouble(),s1.nextDouble());
			break;	
			default: System.out.println("Invalid choice");
			break;

			}
			break;
			case 4: Ellipse e = new EllipseDefinition();
			System.out.println("Enter : 1 for Radius \n"
					+ "Enter : 2 for Volume \n"
					+ "Enter : 3 for Height \n"
					+ "Enter : 4 for Surface Area \n"
					+ "Enter : 5 for Base Area\n"
					+ "Enter : 6 for Lateral Surface\n");
			System.out.println("Select Property \n");
			switch(s1.nextInt()) {
			case 1: System.out.println("Enter the values for axis-a and axis-b :\n");
			e.area(s1.nextDouble(),s1.nextDouble());
			break;

			case 2: System.out.println("Enter the values for area and axis-b :\n");
			e.axisA(s1.nextDouble(),s1.nextDouble());
			break;

			case 3: System.out.println("Enter the values for area and axis-a :\n");
			e.axisB(s1.nextDouble(),s1.nextDouble());
			break;

			case 4: System.out.println("Enter the values for axis-a and axis-b :\n");
			e.circumference(s1.nextDouble(),s1.nextDouble());
			break;

			default : System.out.println("Invalid choice");
			break;
			}			
			break;
			case 5: Sphere s = new SphereDefinition();
			System.out.println("Enter : 1 for Diameter \n"
					+ "Enter : 2 for Radius \n"
					+ "Enter : 3 for Surface Area \n"
					+ "Enter : 4 Volume \n");
			System.out.println("Select Property \n");
			switch(s1.nextInt()) {
			case 1: System.out.println("Enter value for Diameter :\n");
			s.radius(s1.nextDouble());
			break;

			case 2: System.out.println("Enter value for Radius :\n");
			s.volume(s1.nextDouble());
			break;
			case 3: System.out.println("Enter value for Radius :\n");
			s.surfaceArea(s1.nextDouble());
			break;
			case 4: System.out.println("Enter value for Radius :\n");
			s.diameter(s1.nextDouble());
			break;
			}


			break;

			case 6: System.exit(0);
			break;

			default: System.out.println("Invalid choice");
			break;
			}

		}

	}
}