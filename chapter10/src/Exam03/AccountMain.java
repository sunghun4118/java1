package Exam03;

public class AccountMain {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(20000);
		try {
			a.withdraw(3000);
		}
		catch (BalanceInsufficienException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
