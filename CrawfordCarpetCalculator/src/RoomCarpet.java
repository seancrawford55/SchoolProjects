
public class RoomCarpet{
	private RoomDimension roomDimensions;
	private double carpetCost;

	public RoomCarpet(RoomDimension roomDimensions, double carpetCost) 
    {
        this.roomDimensions = roomDimensions;
        this.carpetCost = carpetCost;
    }

    public RoomCarpet(RoomCarpet roomCarpet)
    {

    }

    public double getTotalCost() 
    {
        return carpetCost * roomDimensions.getArea();
    }

    public RoomDimension getSize()
    {
        return roomDimensions;
    }

    public double getCarpetCost()
    {
        return carpetCost;
    }

    public String toString() 
    {
        return "" + roomDimensions + ", Carpet cost per square feet = $" + carpetCost + ", " + "Total cost = $" + getTotalCost() + "";
    }

}
