public class Recursion{
	public static void main(String [] args){
		fib(5);
	}

	public static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
}