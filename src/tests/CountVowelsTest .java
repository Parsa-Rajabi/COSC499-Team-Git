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
		int vowelCount = CountVowels.countVowels(emptyText);

		// Then
		assertEquals(expectedResult, vowelCount);
    }

    @Test
	public void countVowelsShouldReturnZeroWhenTextIsNull() {
		// Expected result
		int expectedResult = 0;
				
		// Given text
		String nullText = null;
			
		// When the input string is null
		int vowelCount = CountVowels.countVowels(nullText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}
	
	@Test
	public void countVowelsShouldReturnNumberOfVowelsWhenTextWithLowercaseVowelsIsGiven() {
		
		// Expected result
		int expectedResult = 7;
				
		// Given text
		String givenText = "Whatever, this has vowels";
				
		// When the input string is given
		int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
    }

    @Test
	public void countVowelsShouldReturnZeroWhenTextWithoutVowelsIsGiven() {
		
		// Expected result
		int expectedResult = 0;
				
		// Given text
		String givenText = "Whtvr, ths hs n vwls bt y cn stll rd t";
				
		// When the input string is given
		int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
    }
    
    @Test
	public void countVowelsShouldReturnValuesWhenTextWithOnlyCapitalizedVowelsIsGiven() {
		
		// Expected result
		int expectedResult = 4;
				
		// Given text
		String givenText = "HI, WHY AM I YELLING";
				
		// When the input string is given
		int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
    }
    
    @Test
	public void countVowelsShouldReturnOneWhenTheOnlyVowelIsTheFirstChar() {
		
		// Expected result
		int expectedResult = 1;
				
		// Given text
		String givenText = "Awwwwwwwwwwwwwww, why?";
				
		// When the input string is given
		int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
    }
    @Test
	public void countVowelsShouldReturnOneWhenTheOnlyVowelIsTheLastChar() {
		
		// Expected result
		int expectedResult = 1;
				
		// Given text
		String givenText = "WHY?! No";
				
		// When the input string is given
		int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

    
}
