import java.util.Scanner;
public class CarpetCalc {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("This will calculate carpet cost for a room.");
		
		System.out.println("Enter the length of the room");
		double length = myObj.nextDouble();
		
		System.out.println("Enter the width of the room");
		double width = myObj.nextDouble();
		
		System.out.println("How much will the carpet cost per square foot?");
		double carpetCost = myObj.nextDouble();
		
		myObj.close();
		
		RoomDimension dimensions = new RoomDimension(length, width);
		RoomCarpet roomCarpet = new RoomCarpet(dimensions, carpetCost);
		
		System.out.println(roomCarpet);
		
	}

}
