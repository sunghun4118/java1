package Exam02;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle v = new Car();
		
		if(v instanceof Bus) {
			System.out.println("¹ö½º");
		} else if(v instanceof Car) {
			System.out.println("½Â¿ëÂ÷");
		}
	}

}
