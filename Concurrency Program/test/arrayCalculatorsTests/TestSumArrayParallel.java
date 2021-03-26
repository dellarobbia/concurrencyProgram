package arrayCalculatorsTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import arrayCalculators.SumArrayParallel;

class TestSumArrayParallel {

	@Test
	//Test the length of the output arrays to ensure the correct number of integers are distributed
	void testSplitArrayOddLength() {
		ArrayList<Long> testArray = new ArrayList<Long>();
		testArray.add(1L);
		testArray.add(2L);
		testArray.add(3L);
		testArray.add(4L);
		testArray.add(5L);
		
		SumArrayParallel testSumArray = new SumArrayParallel(testArray);
		
		testSumArray.splitArray();
		
		int array1Length = 0;
		int array2Length = 0;
		
		array1Length = testSumArray.getParallelArray1().size();
		array2Length = testSumArray.getParallelArray2().size();
		
		if(array1Length == 3 && array2Length == 2) {
			assertTrue(true);
		}
		else {
			fail("Total array length: " + testSumArray.getCalcArray() + "\n" +
					"Array1 Length: " + array1Length + "\n" +
					"Array2 Length: " + array2Length);
		}
			
	}
	
	@Test
	//Test the length of the output arrays to ensure the correct number of integers are distributed
	void testSplitArrayEvenLength() {
		ArrayList<Long> testArray = new ArrayList<Long>();
		testArray.add(1L);
		testArray.add(2L);
		testArray.add(3L);
		testArray.add(4L);
		testArray.add(5L);
		testArray.add(6L);
		
		SumArrayParallel testSumArray = new SumArrayParallel(testArray);
		
		testSumArray.splitArray();
		
		int array1Length = 0;
		int array2Length = 0;
		
		array1Length = testSumArray.getParallelArray1().size();
		array2Length = testSumArray.getParallelArray2().size();
		
		if(array1Length == 3 && array2Length == 3) {
			assertTrue(true);
		}
		else {
			fail("Total array length: " + testSumArray.getCalcArray() + "\n" +
					"Array1 Length: " + array1Length + "\n" +
					"Array2 Length: " + array2Length);
		}
			
	}
}