public class WordCount{
	public static void main(String [] args){
		System.out.println("Please enter a sentence: ");
		String sentence = IO.readString();
		System.out.println("Please enter a minium length of characters to count in each word: ");
		int minLength = IO.readInt();
		System.out.println("Your word count is: ");
		System.out.println(countWords(sentence, minLength));
	}
	public static int countWords(String orginal, int minLength){
		int wordCount = 0;
		int letterCount = 0;
		
		if(minLength <= 0){
			IO.reportBadInput();
		}
		
		int i;
		for(i = 0; i < orginal.length() - 1; i++){
			if(Character.isLetter(orginal.charAt(i))){
				letterCount = letterCount + 1;
			}
			else if(orginal.charAt(i) == ' '){
				if(letterCount >= minLength)
				wordCount = wordCount + 1;
			letterCount = 0;
			}
		}
		return wordCount;
	}
}