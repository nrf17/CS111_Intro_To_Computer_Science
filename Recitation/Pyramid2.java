public class Pyramid2{
	public static void main(String [] args){
		
		int n = IO.readInt();

		for(int i = 1; i <= n; i++){
			for(int k = 0; k < i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n - 1; i >= 1; i--){
			for(int k = 0; k < i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}