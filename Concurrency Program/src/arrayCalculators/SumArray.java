package arrayCalculators;

import java.util.ArrayList;

import timers.Timer;

public class SumArray implements ArrayCalculators, Runnable {
	private ArrayList<Integer> calcArray;
	private long result;
	private Timer calcTimer;
	private boolean calcDone;
	
	public SumArray(ArrayList<Integer> calcArray) {
		setCalcArray(calcArray);
		setResult(0);
		setCalcTimer(new Timer());
		setCalcDone(false);
	}
	
	public ArrayList<Integer> getCalcArray() {
		return calcArray;
	}
	public void setCalcArray(ArrayList<Integer> calcArray) {
		this.calcArray = calcArray;
	}
	
	public long getResult() {
		return result;
	}
	public void setResult(long result) {
		this.result = result;
	}
	
	public Timer getCalcTimer() {
		return calcTimer;
	}
	public void setCalcTimer(Timer calcTimer) {
		this.calcTimer = calcTimer;
	}
	
	public boolean isCalcDone() {
		return calcDone;
	}
	public void setCalcDone(boolean calcDone) {
		this.calcDone = calcDone;
	}

	@Override
	public void run() {
		calculate();
	}
	
	@Override
	public void calculate() {
		calcTimer.startTimer();
		sumArray();
		calcTimer.endTimer();
		setCalcDone(true);
	}
	
	public void sumArray() {
		for(long arrayInt : calcArray) {
			result += arrayInt;
		}
			
	}
	
	public String toString() {
		String displayMessage = 
				"Sum: " + result + "\n" +
				"Time: " + calcTimer.getResultTime() + " nanoseconds\n";
		return displayMessage;
	}
}
