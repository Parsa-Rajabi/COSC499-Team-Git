package tests;

import static org.junit.jupiter.api.Assertions.*;

import fileAnalysis.CountWords;

import org.junit.jupiter.api.Test;

class CountWordsTest {

	@Test
	public void testCountWords_Empty() {
		assertEquals(0, CountWords.countWords(""));
	}
	
	@Test
	public void testCountWords_Null() {
		assertEquals(0, CountWords.countWords(null));
	}
	
	@Test
	public void testCountWords_WithString() {
		assertEquals(5, CountWords.countWords("haha lol wut is that "));
	}

}
