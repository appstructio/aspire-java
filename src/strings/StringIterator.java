package strings;

public class StringIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string: ");
		String s = SimpleIO.readString();
		for (int i = 1; i < s.length(); i += 2) {
			System.out.println(s.charAt(i));
		}
		
		int i = 1;

		while (i > 0) {
			System.out.println("Enter an index (enter 0 to exit):");
			i = SimpleIO.readInteger();
			if (i > 0) {
				System.out.println(s.charAt(i));
			} else {
				System.out.println("Exited");
			}
		}

	}

}
