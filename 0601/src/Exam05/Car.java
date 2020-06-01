package Exam05;

public class Car {
//	필드
	
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed >= 0 && speed <= 350) {
			this.speed = speed;
			System.out.println("현재속도" + this.speed);
		}
		else {
			System.out.println("오류");
		}
	}
	
//	생성자
	
//	메소드

	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}



}
