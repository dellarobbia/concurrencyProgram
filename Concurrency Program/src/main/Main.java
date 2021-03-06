package main;

import arrayCalculators.SumArray;
import arrayCalculators.SumArrayParallel;
import randomizers.RandomArray;
import timers.Timer;

public class Main {

	public static void main(String[] args) {
		RandomArray randomArray = new RandomArray(200000000);
		
		SumArray singleThreadArray = new SumArray(randomArray.getRandomArray());
		SumArrayParallel parallelThreadArray = new SumArrayParallel(randomArray.getRandomArray());
		
		Timer calcTimer = new Timer();
		
		System.out.println("Calculating on single thread...");
		calcTimer.startTimer();
		singleThreadArray.calculate();
		calcTimer.endTimer();
		System.out.print(singleThreadArray.toString());
		System.out.print("Time: " + calcTimer.getResultTime() + " nanoseconds\n\n");
		
		calcTimer.restartTimer();
		
		System.out.println("Calculating on parallel threads...");
		calcTimer.startTimer();
		parallelThreadArray.calculate();
		calcTimer.endTimer();
		System.out.print(parallelThreadArray.toString());
		System.out.print("Time: " + calcTimer.getResultTime() + " nanoseconds\n\n");
	}

}
