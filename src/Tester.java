public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Rectangle1 r = new Rectangle1();
			Rectangle1.setRectangleCount(Rectangle1.getRectangleCount() + 1);
		}
		
		System.out.printf("Total rectangles %d", Rectangle1.getRectangleCount());

	}

}
