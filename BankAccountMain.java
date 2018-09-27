package package1;
public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("George", 1);
		BankAccount account2 = new BankAccount("John", 2, 87.36);
				
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		account2.deposit(50.64);
		account2.withdraw(51.99);
		System.out.println(account2.getBalance());
		System.out.println(account2.toString());
	}

}
