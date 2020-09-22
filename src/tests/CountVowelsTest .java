package tests;

import static org.junit.jupiter.api.Assertions.*;
import fileAnalysis.CountVowels;
import org.junit.jupiter.api.Test;

class CountVowelsTest {

    @Test
	public void countVowelsShouldReturnZeroWhenTextIsEmpty() {
		
		// Expected result
		final int expectedResult = 0;

		// Given text
		final String emptyText = "";

		// When the input string is empty text
		final int vowelCount = CountVowels.countVowels(emptyText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnZeroWhenTextIsNull() {
		// Expected result
		final int expectedResult = 0;

		// Given text
		final String nullText = null;

		// When the input string is null
		final int vowelCount = CountVowels.countVowels(nullText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnNumberOfVowelsWhenTextWithLowercaseVowelsIsGiven() {

		// Expected result
		final int expectedResult = 6;

		// Given text
		final String givenText = "Sure, this has vowels";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnZeroWhenTextWithoutVowelsIsGiven() {

		// Expected result
		final int expectedResult = 0;

		// Given text
		final String givenText = "Hw ds ths hs n vwls bt y cn stll rd t";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnValueWhenTextWithOnlyCapitalizedVowelsIsGiven() {

		// Expected result
		final int expectedResult = 5;

		// Given text
		final String givenText = "HI, WHY AM I YELLING";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnValueWhenTextWithBothUpperAndLowercaseVowelsIsGiven() {

		// Expected result
		final int expectedResult = 13;

		// Given text
		final String givenText = "A bird ate my sandwich, so I need another.";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnOneWhenTheOnlyVowelIsTheFirstChar() {

		// Expected result
		final int expectedResult = 1;

		// Given text
		final String givenText = "Awwwwwwwwwwwwwww, why?";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnOneWhenTheOnlyVowelIsTheLastChar() {

		// Expected result
		final int expectedResult = 1;

		// Given text
		final String givenText = "WHY?! No";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnTwoWhenTheOnlyVowelsAreTheFirstAndLastChars() {

		// Expected result
		final int expectedResult = 2;

		// Given text
		final String givenText = "Oh no";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}

	@Test
	public void countVowelsShouldReturnZeroWhenTheTextIsAllBasicNumbersAndSymbols() {

		// Expected result
		final int expectedResult = 0;

		// Given text
		final String givenText = "234%#&*%^$#+==";

		// When the input string is given
		final int vowelCount = CountVowels.countVowels(givenText);

		// Then
		assertEquals(expectedResult, vowelCount);
	}
    
}
