package time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(4, 30, 0);
		Time newTime = t.addTimes(new Time(8, 20, 20));
		System.out.printf("New time is %s\n", newTime.toString());

		Time f = new Time(4, 30, 20);
		Time g = new Time(4, 30, 20);

		System.out.printf("The two times are equal: %s ", f.equals(g));

	}

}
