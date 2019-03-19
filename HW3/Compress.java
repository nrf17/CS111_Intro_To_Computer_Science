public class Compress{
	public static void main(String [] args){
		System.out.println("Enter a sequence you want compressed: ");
		String sequence = IO.readString();
		System.out.println("Your compressed sequence is: ");
		System.out.println(compress(sequence));
	}

	public static String compress(String original){
		int token = 0; 
		int i;
		String printer = "";

		for(i = 0; (i < original.length() - 1); i++){
			token = 1;
			
			while(original.charAt(i) == original.charAt(i+1) && i+1 != original.length() -1 ){
				token++;
				i++;
			}
			
			if(i+1 == original.length() -1 && original.charAt(i) == original.charAt(i+1)){
				token++;	
			}
			if(token == 1){
				printer +=""+ original.charAt(i);
			}
			else{
				printer +="" + token + "" + original.charAt(i);
			}
			if(i+1 == original.length() -1 && original.charAt(i) != original.charAt(i+1)){
				printer += ""+ original.charAt(i+1);
			}
		}
		return printer;
	}
}