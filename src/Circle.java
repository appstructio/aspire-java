
public class Circle {
	
	public int x = 0;
	public int y = 0;
    

    class Point {

        public int x = 1;
        public int y = 2;

        void getCentre() {
            System.out.printf("The centre is %d %d", this.x, this.y);
            //System.out.printf("The centre is %d %d", x, y);
        }
        
        void testVars(){
        	System.out.printf("The Point centre is %d %d\n", this.x, this.y);  
        	System.out.printf("Or.. the Point centre is %d %d\n", x, y);
        	System.out.printf("The Outer vars are %d %d\n", Circle.this.x, Circle.this.y);
        	
        }
    }

    public static void main(String... args) {
        Circle st = new Circle();
        Circle.Point fl = st.new Point();
        //fl.getCentre();
        fl.testVars();
    }
}
