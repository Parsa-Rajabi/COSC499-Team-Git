package tests;

import fileAnalysis.CountChar;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountCharTest {
    
    @Test
	public void countCharShouldReturnZeroWhenEmptyString() {
		
		// Expected result
		int expectedResult = 0;
		
		// Given text
		String emptyText = "";
		
		// When the input string is empty text
		int numChars = CountChar.countChar(emptyText);

		// Then
		assertEquals(expectedResult, numChars);
	}


	@Test
	public void countCharShouldReturnOneWhenExtraWhitespaceAdded() {

		// Expected result
		int expectedResult = 1;

		// Given text
		String givenText = "     p      ";

		// When the input string is empty text
		int numChars = CountChar.countChar(givenText);

		// Then
		assertEquals(expectedResult, numChars);
	}


	@Test
	public void countCharShouldReturnValueWhenStringHasMixUpperLowerCase() {

		// Expected result
		int expectedResult = 4;

		// Given text
		String givenText = "teSt";

		// When the input string is empty text
		int numChars = CountChar.countChar(givenText);

		// Then
		assertEquals(expectedResult, numChars);
	}

	@Test
	public void countCharShouldReturnValueWhenStringIsNumbers() {

		// Expected result
		int expectedResult = 6;

		// Given text
		String givenText = "450124";

		// When the input string is empty text
		int numChars = CountChar.countChar(givenText);

		// Then
		assertEquals(expectedResult, numChars);
	}
	@Test
	public void countCharShouldReturnValueWhenStringHasSpecialChar() {

		// Expected result
		int expectedResult = 23;

		// Given text
		String givenText = ">Welcome, to COSC 499!<";

		// When the input string is empty text
		int numChars = CountChar.countChar(givenText);

		// Then
		assertEquals(expectedResult, numChars);
	}

}
