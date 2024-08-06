
public class Triangles extends GeometricObjects {
	private static double side1 = 1.0;
	private static double side2 = 1.0;
	private static double side3 = 1.0;
	
	public void Triangle() {
		
	}
	
	public static void createTriangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle:  side1 = " + this.getSide1() + " side2 = " + this.getSide2() + " side3 = " + this.getSide3() +
				" with the area " + this.getArea() + " and the perimeter " + this.getPerimeter() + 
				" and the object is " + this.getColor() + " and is " + this.isFilled() + " and was created on " + this.getDateCreated();
	}
}
