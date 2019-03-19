public class Average3{
	public static void main (String[]args) {
	System.out.println("Enter 3 numbers:");
	int x = IO.readInt ();
	int y = IO.readInt ();
	int z = IO.readInt ();

	System.out.println("enter your name");
	String name = IO.readString();

	int sum = x + y + z;
	double avg = sum/3;

	System.out.println(name + ", the average of your numbers is: " + avg);


;
	}
}