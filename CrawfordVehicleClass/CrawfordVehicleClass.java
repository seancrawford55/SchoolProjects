import java.util.Scanner;

public class CrawfordVehicleClass {

	public static void main(String[] args) {
		
		Vehicle newVehicle = new Vehicle();
		System.out.println("What is the make of your car?");
		Scanner myObj = new Scanner(System.in);
		newVehicle.setMake(myObj.nextLine());
		
		System.out.println("What is the model of your car?");
		newVehicle.setModel(myObj.nextLine());
		
		System.out.println("What is the gas tank size?");
		newVehicle.setTankSize(myObj.nextInt());
		
		System.out.println("Your new car is a " + newVehicle.getMake() + " " + newVehicle.getModel() + " with a gas tank that holds " 
		+ newVehicle.getTankSize() + " gallons of gas." );
		
		double distance = newVehicle.getTankSize() * 31.75;
		double roundOff = Math.round(distance)/100;
		
		System.out.println ("With this tank size you can go " + distance + " miles before running out of gas");
		
	}

}
