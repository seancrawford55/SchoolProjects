import java.util.Date;

public class GeometricObjects {
	private static String color;
	private static String filled;
	private static Date dateCreated = new Date();
	
	public void GeemetricObjects(){
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String isFilled() {
		return filled;
	}
	
	public void setFilled(boolean f) {
		if (f == true) {
			filled = "Filled";
		} else {
			filled = "not filled";
		}
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "The object is " + color + " and is " + filled + " and was created on " + dateCreated;
	}

}
