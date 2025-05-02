package exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	/**
	 * Returns true if the two strings are anagrams of each other.
	 */
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false; // sind nicht gleich lang
		}
		// Speichert Anzahl der Buchstaben
		int[] y = countLetters(a);
		int[] z = countLetters(b);

		// Vergleicht die beiden Arrays
		if (Arrays.equals(y, z)) {
			return true;
		} else {
			return false;
		}

		// TODO: implement using countLetters ()

	}

	/**
	 * Helper method to count how many times each letter (a-z) appears.
	 */
	public static int[] countLetters(String s) {
		int[] counts = new int[26];
		String a = s.toLowerCase(); // macht alle Buchstaben klein

		// Geht durch den String
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c >= 'a' && c <= 'z') { // Prüft wo der Buchstabe zwischen a und z ist, anhand seines ASCII Wert
				int index = c - 'a';
				counts[index]++; // Die Zahl des jeweiligen Indexes wird erhöht
			}
		}
		// TODO: fill array with letter frequencies
		return counts;
	}

	/**
	 * Print only letters that appear in the string with their counts.
	 */
	public static void printLetterCounts(String s) {
		// TODO: implement nicely formatted output
		int[] a = countLetters(s);
		for (int i = 0; i < 26; i++) {
			if (a[i] != 0) { // Überprüfen ob Index einen Wert hat
				char buchstabe = (char) ('a' + i);
				System.out.println(buchstabe + ":" + a[i]);
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Get two strings from the user
		System.out.print(" Enter the first string: ");
		String word1 = scanner.nextLine();
		System.out.print(" Enter the second string: ");
		String word2 = scanner.nextLine();

		// TODO: Process the strings here (ignore spaces , case)
		word1.trim().toLowerCase();
		word2.trim().toLowerCase();

		System.out.println(" Are they anagrams? " + isAnagram(word1, word2));
		printLetterCounts(word1);

		// Comparing Strings 1.== checks whether two Strings share the same reference
		// while equals() tests whether the to given Arrays share the same content
       // Code snippet is true because they have the same reference
		// It should not print true because you created a whole new object with a new reference 
	}
}
