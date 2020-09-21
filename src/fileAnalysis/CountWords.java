package fileAnalysis;

public class CountWords {
	
	 public static int countWords(String s) {
		 if (s == null || s.isEmpty()) return 0;  // Handle with corner cases.

		 return s.trim().split("\\s+").length; // Return the number of words for the input string.
	 }
}
