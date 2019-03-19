public static boolean palindrome(String s){

	int len = s.length();
	Sting s2 = s.toLowerCase();
	for(int i = 0; i < len/2; i++){
		if(s2.charAt(i) != s2.charAt(len-1-i)){
			return false;
		}
	}
	return true;
}