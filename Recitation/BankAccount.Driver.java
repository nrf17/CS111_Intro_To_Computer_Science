public class BankAccountDriver{
	
	public static void main(String [] agrs){
	BankAccount john = new BankAccount("123456789", "John Doe", "123 Main St., New Bruinswick, NJ", 1000.0);
	System.out.println(john);

	BankAccount joe = new BankAccount("987654321", "Joe Smith", "321 Main St., New Bruinswick, NJ", 200.0);
	System.out.println(joe);

	BankAccount.transerMoney(john, joe, 250);
	}
}