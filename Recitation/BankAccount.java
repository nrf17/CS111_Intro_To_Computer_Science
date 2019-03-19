public class BankAccount{
	private int accountNumber;
	private String name;
	private String address;
	private double balance;

	public BankAccount(int accountNumber, String name, String addr){
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = addr;
		this.balance = 0.0;
	}

	public BankAccount(int accountNumber, String name, String addr, double balance){
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = addr;
		this.balance = balance;
	}

	public boolean depositMoney(double amount){
		if(amount > 0){
			this.balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdrawMoney(double amount){
		if(amount < 0 && this.balance >= amount){
			this.balance = amount;
			return true;
		}
		return false;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public String setAddress(String newAddress){
		return this.address = newAddress;
	}

	public double getBalance(){
		return this.balance;
	}

	public static boolean transferMoney(BankAccount from, BankAccount to, double amount){
		if(from.withdrawMoney(amount)){
			to.depositMoney(amount);
			return true;
		}
		return false
	}

	@Override
	public String toString(){
		return this.accountNumber + " - " + this.name + ": $" + this.balance;
	}
}