package Exam05;

public class Car {
//	�ʵ�
	
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed >= 0 && speed <= 350) {
			this.speed = speed;
			System.out.println("����ӵ�" + this.speed);
		}
		else {
			System.out.println("����");
		}
	}
	
//	������
	
//	�޼ҵ�

	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}



}
