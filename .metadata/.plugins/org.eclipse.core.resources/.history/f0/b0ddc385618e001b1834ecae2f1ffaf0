package arrayCalculators;

import java.util.ArrayList;

public class SumArray implements ArrayCalculators {
	private ArrayList<Long> calcArray;
	private long result;
	
	public SumArray(ArrayList<Long> calcArray) {
		setCalcArray(calcArray);
		setResult(0);
	}
	
	public ArrayList<Long> getCalcArray() {
		return calcArray;
	}
	public void setCalcArray(ArrayList<Long> calcArray) {
		this.calcArray = calcArray;
	}
	
	public long getResult() {
		return result;
	}
	public void setResult(long result) {
		this.result = result;
	}
	
	@Override
	public void calculate() {
		sumArray();
	}
	
	public void sumArray() {
		for(long arrayInt : calcArray) {
			result += arrayInt;
		}
			
	}
}
