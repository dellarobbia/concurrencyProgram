package randomizers;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
	private ArrayList<Integer> randomArray;
	
	public RandomArray (long arrayLength) {
		setRandomArray(arrayLength);
	}
	
	public ArrayList<Integer> getRandomArray() {
		return randomArray;
	}
	public void setRandomArray(ArrayList<Integer> randomArray) {
		this.randomArray = randomArray;
	}
	public void setRandomArray(long arrayLength) {
		this.randomArray = new ArrayList<Integer>();
		Random randomGen = new Random();
		
		for(long counter = 0; counter < arrayLength; counter++) {
			randomArray.add(randomGen.nextInt());
		}
	}
}
