
public class Weather {
	private static String skyConditions = "Sunny";
	private static int temp = 70;
	
	public static int getTemp() {
		return temp;
	}
	
	public static String getSkyConditions() {
		return skyConditions;
	}
	
	public static void setTemp(int temperature) {
		if (temperature > -50 && temperature <= 150) {
			temp = temperature;
		} else {
			System.out.println("Not a valid temperature");
		}
	}
	
	public static void setSky(String skyCond) {
		skyConditions = skyCond;
		//snowy, cloudy, sunny, foggy, rainy
	}
	
	public static int toCelcius() {
		return ((temp - 32) * (5/9));
	}
	
	public String toString() {
		return "The temperature is " + temp + " and " + skyConditions;
	}
}
