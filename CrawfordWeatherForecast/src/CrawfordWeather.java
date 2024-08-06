import java.util.Scanner;

public class CrawfordWeather {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("What is the weather like outside?");
		Weather.setSky(myObj.nextLine());
		
		System.out.println("What is the temperature outside?");
		Weather.setTemp(myObj.nextInt());
		
		myObj.close();
		
		System.out.println("The temperature is " + Weather.getTemp() + " in fahrenheit and " + Weather.toCelcius() + " in celcius");
		
		System.out.println("The temperature is " + Weather.getTemp() + " and it is " + Weather.getSkyConditions());
		

	}

}
