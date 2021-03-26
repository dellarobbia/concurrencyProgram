package arrayCalculators;

import java.util.ArrayList;

public class SumArrayParallel extends SumArray implements ArrayCalculators {

	private ArrayList<Integer> parallelArray1;
	private ArrayList<Integer> parallelArray2;
	
	public SumArrayParallel(ArrayList<Integer> calcArray) {
		super(calcArray);
		setParallelArray1(new ArrayList<Integer>());
		setParallelArray2(new ArrayList<Integer>());
	}
	
	public ArrayList<Integer> getParallelArray1() {
		return parallelArray1;
	}
	public void setParallelArray1(ArrayList<Integer> parallelArray1) {
		this.parallelArray1 = parallelArray1;
	}
	
	public ArrayList<Integer> getParallelArray2() {
		return parallelArray2;
	}
	public void setParallelArray2(ArrayList<Integer> parallelArray2) {
		this.parallelArray2 = parallelArray2;
	}
	
	public void calculate() {
		getCalcTimer().startTimer();
		sumArray();
		getCalcTimer().endTimer();
	}
	
	public void sumArray() {
		//Create two arrays to hold the numbers in parallel
		splitArray();
		
		SumArray calcArray1 = new SumArray(parallelArray1);
		SumArray calcArray2 = new SumArray(parallelArray2);
		
		Thread calcThread1 = new Thread(calcArray1);
		Thread calcThread2 = new Thread(calcArray2);
		
		calcThread1.start();
		calcThread2.start();
		try {
			calcThread1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			calcThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResult(calcArray1.getResult() + calcArray2.getResult());
	}
	
	public void splitArray() {
		//Distribute the Integers in the main array to the new parallel arrays
		long counter = 0;
		int arrayPosition = 0;
		
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
