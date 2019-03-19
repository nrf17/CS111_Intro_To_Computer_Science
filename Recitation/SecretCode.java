public class SecretCode{

	public static String code(String str){
	
		str = IO.readString();
		str = str.toLowerCase();
		String result = "";
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c == 'a'){
				c = 'z';
			}
			else{
				c--;
				result += c;
			}
			if(Character.isDigit(i)){
				if(c == 0){
					c = 9;
				}
				else{
					c--;
				}
				result += c;
			}
			if(c == ' '){
				c = ' ';
				result += c;
			}
		}
		return result;
	}
	
	public static void main(String [] args){
		String original = new String();
		System.out.println(code(original));
	}
}