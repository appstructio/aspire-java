package vehicles;

public abstract class Vehicle implements VehicleInfo {

	private int numWheels;
	private String color;
	protected String make; 
	protected String manufacturer; 
	
	
	public abstract void setManufacturer(String m);
	public abstract void setMake(String m);
	
	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return this.numWheels;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public void setNumWheels(int i) {
		// TODO Auto-generated method stub
		this.numWheels = i;
	}

	@Override
	public void setColor(String s) {
		// TODO Auto-generated method stub
		this.color = s;
	}

}
