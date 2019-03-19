public class Speeding{
	public static void main(String [] args) {

		System.out.println("Enter the speed:");
		int speed = IO.readInt ();

		if (speed <- 60) {
			System.out.println("$0 fine");
		}

		if (speed > 60 || <- 75) {
			System.out.println("$100 fine");
		}

		if (speed > 75 || <- 90) {
			System.out.println("$200 fine");
		}

		if (speed > 90) {
			System.out.println("$500 fine");
		}
		
	}
}