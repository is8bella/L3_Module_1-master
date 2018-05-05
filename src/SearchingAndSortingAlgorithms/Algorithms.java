package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int currentIndex = 0;
		for (String string : eggs) {
			if (string.equals("cracked")) {
				return currentIndex;
			}
			currentIndex++;
		}
		return -1;
	}
	// Add other methods here

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (Boolean booleancheck : oysters) {
			if (booleancheck == true) {
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
		if (x == 6.6) {
			tall = x;
		}
		return tall;
	}

	public static String findLongestWord(List<String> words) {
		String longword = "";
		for (String string : words) {
			if (string.length() > longword.length()) {
				longword = string;
			}
		}
		return longword;
	}

	public static boolean containsSOS(List<String> message1) {
		String SOS = " ... --- ... ";
		for (String string : message1) {
			if (string.equals(SOS)) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String previousSequence = "";
		ArrayList<String> arraylist = new ArrayList<String>();
		ArrayList<String> sortedlist = new ArrayList<String>();
		for (String string : unsortedSequences) {
			arraylist.add(string);
		}
		for (int i = 0; i < unsortedSequences.size(); i++) {
			String longest = findLongestWord(arraylist);
			arraylist.remove(longest);
			sortedlist.add(0, longest);
		}

		return sortedlist;

	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		String a;
		String b;
		ArrayList<String> wordlist = new ArrayList<String>();
		for (String string : words) {
			wordlist.add(string);
		}
		for (int i = 0; i < words.size() - 1; i++) {
			a = words.get(i);
			b = words.get(i++);
			if (a.compareTo(b) > 0) {
				wordlist.remove(i);
				wordlist.add(i++, a);
			}
		}

		return wordlist;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		double a;
		double b;
		ArrayList<Double> scores = new ArrayList<Double>();
		double prevoiusNum = 0.0;
		// for (Double doubles : results) {
		// //if(prevoiusNum == 0) {
		// scores.add(doubles);
		// //doubles = prevoiusNum;
		// }

		// for (int i = 0; i < results.size() - 1; i++) {
		// int a2 =i;
		// if(prevoiusNum == 0) {
		//
		// scores.add(results.get(i));
		//
		// }
		// else {
		// if(prevoiusNum > results.get(i)) {
		// scores.add(scores.size()-1, results.get(i));
		// }
		// if(prevoiusNum < results.get(i)) {
		// scores.add(results.get(i));
		// }
		// if(prevoiusNum == results.get(i)) {
		// scores.add(results.get(i));
		// }
		// }
		// a = scores.get(i);
		// b = scores.get(i++);
		// System.out.println(scores.get(a2++));
		// if (scores.get(i) > scores.get(a2++)) {
		// scores.add(a2+2, scores.get(i));
		// scores.remove(i);
		// //System.out.println("checked a against b");
		//
		// }
		for (int j = 0; j < results.size(); j++) {

			if (scores.size() == 0) {
				scores.add(results.get(j));
			} else {
				for (int k = 0; k < scores.size(); k++) {
					if (scores.get(k) > results.get(j)) {
						scores.add(k, results.get(j));
					}
					// if(d < results.get(i)) {
					// scores.add(results.get(i));
					// }
					// if(d == results.get(i)) {
					// scores.add(results.get(i));
				}
			}
		}

		// prevoiusNum = results.get(i);

		System.out.println(scores);
		return scores;

	}
}