package arrayCalculatorsTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import randomizers.RandomArray;

class TestRandomArray {

	@Test
	void testRandomArraySize() {
		RandomArray testRandomArray = new RandomArray(100);
		long arraySize = testRandomArray.getRandomArray().size();
		
		assertEquals(100, arraySize);
	}
	
	@Test
	void testRandomArrayNoNull() {
		RandomArray testRandomArray = new RandomArray(100);
		boolean pass = true;
		
		for(long counter = 0; counter < 100; counter++) {
			if(testRandomArray.getRandomArray().get((int) counter) == null)
				pass = false;
		}
		
		assertTrue(pass);
	}

}
