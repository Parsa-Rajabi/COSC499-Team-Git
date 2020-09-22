package tests;

import static org.junit.jupiter.api.Assertions.*;
import fileAnalysis.CountVowels;
import org.junit.jupiter.api.Test;

class CountVowelsTest {

    @Test
	public void countVowelsShouldReturnZeroWhenTextIsEmpty() {
		
		// Expected result
		int expectedResult = 0;
		
		// Given text
		String emptyText = "";
		
		// When the input string is empty text
		int wordCount = CountVowels.countVowels(emptyText);

		// Then
		assertEquals(expectedResult, wordCount);
    }
    
}
