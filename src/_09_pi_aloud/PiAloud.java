package _09_pi_aloud;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
		String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948";

		// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
		System.out.print(pi.charAt(0));
		System.out.print(pi.charAt(1));
		System.out.print(pi.charAt(2));
		System.out.print(pi.charAt(3));
		System.out.println("");

		// 4. Print ALL the digits of of Pi (hint: use a loop)
		for(int i = 0; i < pi.length(); i++) {
			System.out.print(pi.charAt(i));
		}
		System.out.println("");

		// 5. Use the speak() method to speak all the digits of Pi.
		for(int i = 0; i < 10; i++) {
			speak(pi.charAt(i));
		}

		// [ADVANCED]
		
		for(int i = 0; i < 10; i++) {
			// *6. Get a character from the user using the getInputFromUser() method
			char userChar = getInputFromUser();
			
			// *7. Compare the users' char to the next digit of Pi
			// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
			if(userChar == pi.charAt(i)) {
				System.out.println("Correct!");
			} else {
				System.err.println("Incorrect.");
			}
		}
		
	}

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


