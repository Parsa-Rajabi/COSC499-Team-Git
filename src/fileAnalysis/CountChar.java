package fileAnalysis;

public class CountChar {
	 public static int countChar(String s) {
		 int count = 0;

		 //Counts each character except space
		 for(int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) != ' ')
				 count++;
		 }

		 //return the number of characters without whitespace
		return count;
	 }
}