/*
 * IS4010 Fall 2019
 * Assignment 05
 * Austin Miller
 * mille5au@mail.uc.edu
 */
package footballFun;

import java.util.Scanner;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		if (score == 2) {return "safety";} // Returns string 'safety' if score is 2
		if (score == 3) {return "field goal";} // Returns string 'field goal' if score is 3
		if (score == 6) {return "touchdown";} // Returns string 'touchdown' if score is 6
		if (score == 7) {return "touchdown and extra point";} // Returns string 'touchdown and extra point' if score is 7
		if (score == 8) {return "touchdown and 2-point conversion";} // Returns string 'touchdown and 2-point conversion' if score is 8
		if (score == -1) {return "";} // Returns empty string if score is -1
		if (score == 1) {return "invalid";} // Returns string 'invalid' if score is 1
		if (score == 10) {return "you must be playing Quidditch ";} // Returns string 'you must be playing Quidditch ' if score is 10
		else
		return "";
	}
}