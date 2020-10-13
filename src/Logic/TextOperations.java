package Logic;

public class TextOperations {
	
	public static boolean isPalindrome(String text) {
	    String withoutWhiteSpace = text.replaceAll("\\s+", "").toLowerCase();
	    int length = withoutWhiteSpace.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = withoutWhiteSpace.charAt(forward++);
	        char backwardChar = withoutWhiteSpace.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}
	
	public static String concatenateTwoWords(String firstWord, String secondWord) {
		return firstWord+" "+secondWord;
	}
}
