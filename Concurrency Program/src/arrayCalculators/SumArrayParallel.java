package arrayCalculators;

import java.util.ArrayList;

public class SumArrayParallel extends SumArray implements ArrayCalculators {

	private ArrayList<Long> parallelArray1;
	private ArrayList<Long> parallelArray2;
	
	public SumArrayParallel(ArrayList<Long> calcArray) {
		super(calcArray);
		setParallelArray1(new ArrayList<Long>());
		setParallelArray2(new ArrayList<Long>());
	}
	
	public ArrayList<Long> getParallelArray1() {
		return parallelArray1;
	}
	public void setParallelArray1(ArrayList<Long> parallelArray1) {
		this.parallelArray1 = parallelArray1;
	}
	
	public ArrayList<Long> getParallelArray2() {
		return parallelArray2;
	}
	public void setParallelArray2(ArrayList<Long> parallelArray2) {
		this.parallelArray2 = parallelArray2;
	}
	
	public void calculate() {
		sumArray();
	}
	
	public void sumArray() {
		//Create two arrays to hold the numbers in parallel
		splitArray();
	}
	
	public void splitArray() {
		//Distribute the Integers in the main array to the new parallel arrays
				long counter = 0;
				long arrayPosition = 0;
				
				for(counter = 0; counter < getCalcArray().size(); counter++) {
					arrayPosition = getCalcArray().get((int)counter);
					parallelArray1.add(arrayPosition);
					counter++;
					
					if(counter < getCalcArray().size()) {
						arrayPosition = getCalcArray().get((int)counter);
						parallelArray2.add(arrayPosition);
					}
				}
	}
}
