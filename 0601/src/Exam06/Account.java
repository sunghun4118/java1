package Exam06;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	int num;
	static int number;
	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano; //����
		this.owner = owner; //������
		this.balance = balance; //�ݾ�
		this.num = number + 1;
		
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance,String gubn) {
		if(gubn.equals("+"))
			this.balance += balance;
		else
			this.balance -= balance;
			
	}
	
	
	

}
