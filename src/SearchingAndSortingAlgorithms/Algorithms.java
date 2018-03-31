package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		int currentIndex = 0;
		for (String string : eggs) {
			if(string.equals("cracked")) {
				return currentIndex;
			}
			currentIndex++;
		}
		return -1; //<- this needs changing
	}
	//Add other methods here
	
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (Boolean booleancheck : oysters) {
			if(booleancheck == true) {
				count++;
			}
		}
		return count;
	}
	
	public static int findTallest(List<Double> peeps) {
		double x = 0;
		for (Double doublecheck : peeps) {
			x = doublecheck;
		}
		if() {
			
		}
	}
	
}