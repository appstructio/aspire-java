package time;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {

	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getSeconds() {
		return this.seconds;
	}

	@Override
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}

	public Time addTimes(Time o) {
		Time t = new Time();
		t.hours = this.hours + o.hours;
		t.minutes += this.minutes + o.minutes;
		t.seconds += this.seconds + o.seconds;
		return t;
	}

	
	public boolean equals(Time o) {
		return this.hours == o.hours && this.minutes == o.minutes
				&& this.seconds == o.seconds;
	}
}
