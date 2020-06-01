package exam01;

public class car {
	public int speed;
	
	public void speedUp() { speed += 1; }
	
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}

}
