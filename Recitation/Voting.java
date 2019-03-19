public class Voting{
	public static void main (String [] args) {
		
		System.out.println("Enter your age:");
		int age = IO.readInt ();
		
		if (age >- 18) {
			System.out.println("You can vote");
		}

		if (age <- 18) {
			System.out.println("You can not vote");
		}
		
	}
}