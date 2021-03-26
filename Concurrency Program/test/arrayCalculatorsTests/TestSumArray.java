package arrayCalculatorsTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import arrayCalculators.SumArray;

class TestSumArray {

	@Test
	void testSumArray() {
		ArrayList<Long> testArray = new ArrayList<Long>();
		testArray.add(1L);
		testArray.add(2L);
		testArray.add(3L);
		testArray.add(4L);
		testArray.add(5L);
		SumArray testSumArray = new SumArray(testArray);
		
		testSumArray.calculate();
		
		assertEquals(15, testSumArray.getResult());
	}

}
