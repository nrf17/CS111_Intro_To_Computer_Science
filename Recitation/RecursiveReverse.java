public class RecursiveReverse{
	public static String reverse(String a){
		if(a.length() == 1){
			return a;
		}
		else{
			return (a.substring(a.length()-1) + reverse(a.substring(0, a.length(0-1))));
		}
	}
}