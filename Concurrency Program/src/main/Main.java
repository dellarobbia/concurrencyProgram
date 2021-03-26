package main;

import arrayCalculators.SumArray;
import arrayCalculators.SumArrayParallel;
import randomizers.RandomArray;

public class Main {

	public static void main(String[] args) {
		RandomArray randomArray = new RandomArray(200000000);
		
		SumArray singleThreadArray = new SumArray(randomArray.getRandomArray());
		SumArrayParallel parallelThreadArray = new SumArrayParallel(randomArray.getRandomArray());
		
		System.out.println("Calculating on single thread...");
		singleThreadArray.run();
		System.out.print(singleThreadArray.toString());
		
		System.out.println("Calculating on parallel threads...");
		parallelThreadArray.calculate();
		System.out.print(parallelThreadArray.toString());
	}

}