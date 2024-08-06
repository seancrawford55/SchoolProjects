import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triangles tri = new Triangles();
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the sides of the triangle:");
		
		double s1 = myObj.nextDouble();
		double s2 = myObj.nextDouble();
		double s3 = myObj.nextDouble();
		
		
		Triangles.createTriangle(s1, s2, s3);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What color is the shape?");
		String c = keyboard.nextLine();
		
		System.out.println("Is the shape filled?");
		boolean f = myObj.nextBoolean();
		
		tri.setFilled(f);
		
		tri.setColor(c);
		
		System.out.println(tri.toString());
		
		myObj.close();

	}

}
