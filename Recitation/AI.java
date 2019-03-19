public class AI{
	public static int gcf(int a, int b){
	int smaller = 1;

	if(a < b)
		smaller = a;
	else if(b < a)
		smaller = b;

	for(int divisor = smaller; divisor > 1; divisor--){
		if((a%divisor == 0)&&(b%divisor == 0)){
			return divisor;
		}
	} return 1;
	}
}