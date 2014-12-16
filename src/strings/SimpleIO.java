package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIO {

    /*
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    String s = in.next();
    */


    public static String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = br.readLine();
        } catch (IOException ioe) {
            System.err.println("Invalid Format!");
        }
        return s;
    }
    public static int readInteger() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try {
            i = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println("Invalid Format!");
        }
        return i;


    }

    public static double readDouble() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = 0.0;
        try {
            d = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.err.println("Invalid Format!");
        }
        return d;
    }
}