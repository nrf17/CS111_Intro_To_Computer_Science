public class Poly{ 
	public static void main(String [] args){

		System.out.println("Enter the first root:");
		int r1 = IO.readInt();

		System.out.println("Enter the second root:");
		int r2 = IO.readInt();

		System.out.println("Enter the third root:");
		int r3 = IO.readInt();

		int coeff1 = r1+r2+r3;
		int coeff2 = r1*r2+r1*r3+r2*r3;
		int coeff3 = r1*r2*r3;

		System.out.println("The polynomial is:" + "x^3-" + coeff1 + "x^2+" + coeff2 + "x-" + coeff3);
		}
}