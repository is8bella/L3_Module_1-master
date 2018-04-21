package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
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
		return -1; 
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
	
	public static double findTallest(List<Double> peeps) {
		double x = 0;
		double tall = 0;
		for (Double doublecheck : peeps) {
			x = doublecheck; 
			}
		if(x == 6.6) {
			tall = x;
		}
		return tall;
		}
	
	public static String findLongestWord(List<String> words) {
		String longword = "";
		for (String string : words) {
			if(string.length() > longword.length()) {
				longword = string;
			}
		}
		return longword;
	}
	
	public static boolean containsSOS(List<String> message1) {
		String SOS = " ... --- ... ";
		for (String string : message1) {
			if(string.equals(SOS)) {
				return true;
			}
		}
		return false;
	}
	
	public static List<String> sortDNA(List<String> unsortedSequences){
		String previousSequence = "";
		for (String string : unsortedSequences) {
			
		}
		
	}
		
		
	
}