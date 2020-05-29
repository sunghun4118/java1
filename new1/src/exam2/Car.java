package exam2;

public class Car {
	
	String Model;
	@Override
	public String toString() {
		return "Car [Model=" + Model + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}

class Tire{
	


	boolean starter;
	String company;
	String Model;
	String color;
	int MaxSpeed;
	int speed;
	int rpm;
	public Tire(boolean starter, String company, String model, String color, int maxSpeed, int speed, int rpm) {
		super();
		this.starter = starter;
		this.company = company;
		Model = model;
		this.color = color;
		MaxSpeed = maxSpeed;
		this.speed = speed;
		this.rpm = rpm;
	}
	public Tire() {
		super();
		// TODO Auto-generated constructor stub
	}
}

	
	