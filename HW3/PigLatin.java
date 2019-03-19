public class PigLatin{
	public static void main(String [] args){
		System.out.println("Enter the word you would like to translate to pig latin: ");
		String word = IO.readString();
		translate(word);
	}
	public static String translate(String orginal){
		orginal = orginal.toLowerCase();
		char orginal1 = orginal.charAt(0);
		String orginal2 = orginal.substring(1, orginal.length());
		String pig = "";
		if (orginal1=='a' || orginal1=='e' || orginal1== 'i' || orginal1=='o' || orginal1=='u' || orginal1=='A' || orginal1=='E' || orginal1== 'I' || orginal1=='O' || orginal1=='U'){
			pig = orginal + "way";
		}
		else{
			pig = orginal2 + orginal1 + "ay";
		}
		pig.toLowerCase();
		System.out.println("The pig latin word is: " + pig);
		return pig;
	}
}