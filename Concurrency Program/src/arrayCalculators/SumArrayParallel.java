package arrayCalculators;

import java.util.ArrayList;

public class SumArrayParallel extends SumArray implements ArrayCalculators {

	private ArrayList<Integer> parallelArray1;
	private ArrayList<Integer> parallelArray2;
	
	private Thread calcThread1;
	private Thread calcThread2;
	
	private SumArray calcArray1;
	private SumArray calcArray2;
	
	public SumArrayParallel(ArrayList<Integer> calcArray) {
		super(calcArray);
		setParallelArray1(new ArrayList<Integer>());
		setParallelArray2(new ArrayList<Integer>());
		splitArray();
		makeThreads();
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
		sumArray();
	}
	
	public void sumArray() {
		//Create two arrays to hold the numbers in parallel
//		splitArray();
		
//		SumArray calcArray1 = new SumArray(parallelArray1);
//		SumArray calcArray2 = new SumArray(parallelArray2);
		
//		calcThread1 = new Thread(calcArray1);
//		calcThread2 = new Thread(calcArray2);
//		
//		calcThread1.setDaemon(false);
//		calcThread2.setDaemon(false);
		
		boolean calcIsDone = false;
		
		calcThread1.start();
		calcThread2.start();
		
		while(calcIsDone == false) {
			if(calcArray1.isCalcDone() == true && calcArray2.isCalcDone() == true) {
				calcIsDone = true;
			}
		}
		
		setResult(calcArray1.getResult() + calcArray2.getResult());
	}
	
	private void makeThreads() {
		calcArray1 = new SumArray(parallelArray1);
		calcArray2 = new SumArray(parallelArray2);
		
		calcThread1 = new Thread(calcArray1);
		calcThread2 = new Thread(calcArray2);
		
		calcThread1.setDaemon(false);
		calcThread2.setDaemon(false);
		
//		boolean calcIsDone = false;
		
//		calcThread1.start();
//		calcThread2.start();
	}
	
	private void splitArray() {
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
