package arrayCalculatorsTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import arrayCalculators.SumArrayParallel;

class TestSumArrayParallel {

	@Test
	//Test the length of the output arrays to ensure the correct number of integers are distributed
	void testSplitArrayOddLength() {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		
		SumArrayParallel testSumArray = new SumArrayParallel(testArray);
		
//		testSumArray.splitArray();
		
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
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		testArray.add(6);
		
		SumArrayParallel testSumArray = new SumArrayParallel(testArray);
		
//		testSumArray.splitArray();
		
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
	
	@Test
	void testSumArray() {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		SumArrayParallel testSumArray = new SumArrayParallel(testArray);
		
		testSumArray.calculate();
		
		assertEquals(15, testSumArray.getResult());
	}
}
