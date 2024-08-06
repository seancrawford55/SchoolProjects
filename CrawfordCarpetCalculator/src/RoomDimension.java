public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public RoomDimension(RoomDimension roomDimension) {
		
	}
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		return "Dimensions of room: (length = " + length + ", width = " + width + ")";
	}
}

