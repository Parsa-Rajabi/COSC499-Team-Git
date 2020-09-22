package tests;
import fileAnalysis.*;
import static org.junit.jupiter.api.Assertions.*;


public class charCountTest {
    
    @Test
	public void countWordsShouldReturnZeroWhenTextIsEmpty() {
		
		// Expected result
		int expectedResult = 0;
		
		// Given text
		String emptyText = "";
		
		// When the input string is empty text
		int numChars = charCount.countChar(emptyText);

		// Then
		assertEquals(expectedResult, numChars);
	}

}
