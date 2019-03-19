public class Titles{

	public static String order(){
		String book1 = IO.readString();
		String book2 = IO.readString();
		String book3 = IO.readString();
		String bookA = "";
		String bookB = "";
		String bookC = "";
		String title1 = "";
		String title2 = "";
		String title3 = "";

		for(int i = 0; i < book1.length(); i++){
			char c = book1.charAt(i);
			if(i == ' '){
				bookA = book1.substring(0,i+1);
			}
			if(bookA == "The "){
				bookA = book1.substring(4, i);
			}
		}
		
		for(int i = 0; i < book2.length(); i++){
			char c = book2.charAt(i);
			if(i == ' '){
				bookB = book2.substring(0,i+1);
			}
			if(bookB == "The "){
				bookB = book2.substring(4, i);
			}
		}
		
		for(int i = 0; i < book3.length(); i++){
			char c = book3.charAt(i);
			if(i == ' '){
				bookC = book3.substring(0,i+1);
			}
			if(bookC == "The "){
				bookC = book3.substring(4, i);
			}
		}
		
		
		if(bookA.compareTo(bookB) == 0 && bookA.compareTo(bookC) == 0){
			title1 = book1;
			if(title1 == book1){
				if(bookB.compareTo(bookC) == 0){
					title2 = book2;
					title3 = book3;
				}
				else{
					title2 = book3;
					title3 = book2;
				}
			}
		}

		if(bookB.compareTo(bookA) == 0 && bookB.compareTo(bookC) == 0){
			title1 = book2;
			if(title1 == book2){
				if(bookA.compareTo(bookC) == 0){
					title2 = book1;
					title3 = book3;
				}
				else{
					title2 = book3;
					title3 = book1;
				}
			}
		}

		if(bookC.compareTo(bookA) == 0 && bookC.compareTo(bookB) == 0){
			title1 = book3;
			if(title1 == book3){
				if(bookA.compareTo(bookB) == 0){
					title2 = book1;
					title3 = book2;
				}
				else{
					title2 = book2;
					title3 = book1;
				}
			}
		}
		return title1 + "\n" + title2 + "\n" + title3;
	}

	
	public static void main(String [] args){
		System.out.println(order());
	}
}