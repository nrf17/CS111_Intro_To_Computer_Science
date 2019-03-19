public class StringRec{

	public static void multiNum(int n, char c){
		if(n == 1){
			System.out.print(c);
			return;
		}
		else{
			System.out.print(c);
			multiNum(n-1, c);
			return;
		}
	}

	public static void decompress(String original){
		if(original.length() == 0 || original == null || original == ""){
			return;
		}
		if(Character.isLetter(original.charAt(0))){
			char b = original.charAt(0);
			System.out.print(b);
			original = original.substring(1, original.length());
			decompress(original);
			return;
		}
		if(Character.isDigit(original.charAt(0))){
			int n = Character.getNumericValue(original.charAt(0));
			char c = original.charAt(1);
			multiNum(n, c);
			original = original.substring(2, original.length());
			decompress(original);
			return;
		}
	}

	public static void main(String[] args){
		System.out.print("The compressed string is: a2b3T4YgG5r6U7o8P9LdC" + "\n" + "The decompressed string is: ");
		decompress("a2b3T4YgG5r6U7o8P9LdC");
	}
}