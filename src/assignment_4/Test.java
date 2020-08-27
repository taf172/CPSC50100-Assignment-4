package assignment_4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// Print assignment info
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Chris Leipold");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println();
		
		// Main loop
		Scanner scan = new Scanner(System.in);
		Boolean run = true;
		Set set = new Set();
		
		while (run) {
			
			// Parse command
			System.out.print("Enter command: ");
			String[] input = scan.nextLine().split(" ");
			
			try {
				String command = input[0];
				int num = Integer.parseInt(input[1]);
				
				switch(command) {
				case "add":
					set.add(num);
					System.out.println(set.toString());
					break;
				case "del":
					set.del(num);
					System.out.println(set.toString());
					break;
				case "exists":
					System.out.println(set.exists(num));
					break;
				case "quit":
					System.exit(0);
				default:
					System.out.println("Invalid command! Use quit 0 to exit.");
				}
				
				
			} catch (Exception e) {
				System.out.println("Invalid command! Use quit 0 to exit.");
			}
			
		}
		
		scan.close();

	}

}
