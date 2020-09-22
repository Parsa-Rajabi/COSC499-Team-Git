package tests;

import static org.junit.jupiter.api.Assertions.*;

import fileAnalysis.CountWords;

import org.junit.jupiter.api.Test;

class CountWordsTest {

	@Test
	public void countWordsShouldReturnZeroWhenTextIsEmpty() {
		
		// Expected result
		int expectedResult = 0;
		
		// Given text
		String emptyText = "";
		
		// When the input string is empty text
		int wordCount = CountWords.countWords(emptyText);

		// Then
		assertEquals(expectedResult, wordCount);
	}
	
	@Test
	public void countWordsShouldReturnZeroWhenTextIsNull() {
		// Expected result
		int expectedResult = 0;
				
		// Given text
		String nullText = null;
			
		// When the input string is null
		int wordCount = CountWords.countWords(nullText);

		// Then
		assertEquals(expectedResult, wordCount);
	}
	
	@Test
	public void countWordsShouldReturnTheCorrectNumbersOfTextWhenTextIsGiven() {
		
		// Expected result
		int expectedResult = 5;
				
		// Given text
		String givenText = "haha lol wut is that ";
				
		// When the input string is given
		int wordCount = CountWords.countWords(givenText);

		// Then
		assertEquals(expectedResult, wordCount);
	}

}
