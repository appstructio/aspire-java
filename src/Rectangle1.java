public class Rectangle1 {

	private int length;
	private int breadth;
	private static int rectangleCount; 

	public static int getRectangleCount() {
		return rectangleCount;
	}

	public static void setRectangleCount(int rectangleCount) {
		Rectangle1.rectangleCount = rectangleCount;
	}

	public Rectangle1() {
	}

	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle1(Rectangle1 r){
		this.length = r.length;
		this.breadth = r.breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
