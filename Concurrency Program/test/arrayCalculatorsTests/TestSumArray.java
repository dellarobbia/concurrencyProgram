package arrayCalculatorsTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import arrayCalculators.SumArray;

class TestSumArray {

	@Test
	void testSumArray() {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		SumArray testSumArray = new SumArray(testArray);
		
		testSumArray.calculate();
		
		assertEquals(15, testSumArray.getResult());
	}

}
