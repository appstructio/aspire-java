package vehicles;

public class Car extends Vehicle {

	public Car(String manufacturer, String make){
		setMake(make);
		setManufacturer(manufacturer);
	}
	
	@Override
	public void setManufacturer(String m) {
		// TODO Auto-generated method stub
		this.manufacturer = m;
	}

	@Override
	public void setMake(String m) {
		// TODO Auto-generated method stub
		this.make = m;
	}

}
