
public class TestObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1, rect2; 
		rect1 = new Rectangle(10, 20);
		rect2 = rect1; 
		
		System.out.printf("Rectangle 1 dimensions are %d x %d \n", rect1.getLength(), rect1.getBreadth());
		System.out.printf("Rectangle 2 dimensions are %d x %d \n", rect2.getLength(), rect2.getBreadth());
		
		
		rect1.setBreadth(40);

		System.out.printf("Rectangle 1 dimensions are %d x %d \n", rect1.getLength(), rect1.getBreadth());
		System.out.printf("Rectangle 2 dimensions are %d x %d \n", rect2.getLength(), rect2.getBreadth());
		
		
	}

}
