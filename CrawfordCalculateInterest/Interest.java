import java.util.Scanner;
public class Interest {
	
	public static void main(String[] args) {
		double i, b, x, y;
		
		System.out.println("What is your current balance?");
		Scanner myObj = new Scanner(System.in);
		b = myObj.nextDouble();
		System.out.println("Your balance is " + b);
		
		System.out.println("What is your interest rate?");
		Scanner myObj1 = new Scanner(System.in);
		i = myObj1.nextDouble();
		System.out.println("Your interest rate is " + i);
		i = i/1200;
		y = b * i;
		System.out.println("The interest added is " + y);
		x = b + y;
		System.out.println("Your balance after interest is " + x);
	}
}
