
//scanner to take user input
import java.util.Scanner;

public class Demo {
	// static method that don't return anything
	static void describeApplication() {
		System.out.println("This program will ask for a radius and will calculate”\r\n"
				+ "“the circumference or the area of a circle with that radius, \r\n"
				+ "based on your selection.” “Then it will repeat the process”");
	}

	public static void main(String[] args) {
		// local variable
		char answer;
		char option;
		// scanner input
		Scanner input = new Scanner(System.in);
		// loop starts over here
		do {
			int radius;
			describeApplication();// method call

			System.out.println("Enter the radius of circle:");
			radius = input.nextInt();
			// creating an object
			Circle calculation = new Circle(radius);

			// user input chice and stores result in option
			System.out.println("What do you like to calculate press (a) for area and (c) for circumference:");
			option = input.next().toLowerCase().charAt(0);

			// if condition starts here gives result if meets the following condition
			if (option == 'a') {
				System.out.println(calculation.getArea());
			}
			// goes through the condition if its true
			else if (option == 'c') {
				System.out.println(calculation.getCircumference());
			} else {
				System.out.println("Not the valid option");
			}
			// take user input and holds that to answer variable
			System.out.println("Do you want to continue (y/n):");
			// takes answer as the result
			answer = input.next().toLowerCase().charAt(0);

		}
//loop continue if answer is y
		while (answer != 'n');
		input.close();
		System.out.println("Thank you for your time");
	}
}
