import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random randomGenerator = new Random();
		int x_1 = randomGenerator.nextInt(9) + 1;
		int x_2 = randomGenerator.nextInt(9) + 1;
		int x_3 = randomGenerator.nextInt(9) + 1;
		int x_4 = randomGenerator.nextInt(9) + 1;
		int y_1 = 0;
		int y_2 = 0;
		int y_3 = 0;
		int y_4 = 0;
		int z_1 = 0;
		int a_1 = 1;
		int a_2 = 1;
		int a_3 = 1;
		int a_4 = 1;

		// explain game

		System.out.println("Input 4 integers (1-9) as a guess and see how many you can get right");

		// user inputs the values (first time)

		System.out.println("Enter Integer 1");
		y_1 = input.nextInt();

		System.out.println("Enter Integer 2");
		y_2 = input.nextInt();

		System.out.println("Enter Integer 3");
		y_3 = input.nextInt();

		System.out.println("Enter Integer 4");
		y_4 = input.nextInt();

		// loop

		while (z_1 != 4) {

			// computer interprets the values

			// Integer 1

			if (x_1 == y_1) {
				if (a_1 == 1) {
					z_1 += 1;
					a_1 += 1;
					System.out.println("Integer 1 is correct");
				}
			} else if (x_2 == y_1 || x_3 == y_1 || x_4 == y_1) {

				System.out.println("1st Number inputted is not in the right place, try again");
				System.out.println("Enter Integer 1");
				y_1 = input.nextInt();
			} else {

				System.out.println("1st Number inputted is completely wrong");
				System.out.println("Enter Integer 1");
				y_1 = input.nextInt();
			}

			// Integer 2

			if (x_2 == y_2) {
				if (a_2 == 1) {
					z_1 += 1;
					a_2 += 1;
					System.out.println("Integer 2 is correct");
				}
			} else if (x_1 == y_2 || x_3 == y_2 || x_4 == y_2) {

				System.out.println("2nd Number inputted is not in the right place, try again");
				System.out.println("Enter Integer 2");
				y_2 = input.nextInt();
			} else {

				System.out.println("2nd Number inputted is completely wrong");
				System.out.println("Enter Integer 2");
				y_2 = input.nextInt();
			}

			// Integer 3

			if (x_3 == y_3) {
				if (a_3 == 1) {
					z_1 += 1;
					a_3 += 1;
					System.out.println("Integer 3 is correct");
				}
			} else if (x_1 == y_3 || x_2 == y_3 || x_4 == y_3) {

				System.out.println("3rd Number inputted is not in the right place, try again");
				System.out.println("Enter Integer 3");
				y_3 = input.nextInt();
			} else {

				System.out.println("3rd Number inputted is completely wrong");
				System.out.println("Enter Integer 3");
				y_3 = input.nextInt();
			}

			// Integer 4

			if (x_4 == y_4) {
				if (a_4 == 1) {
					z_1 += 1;
					a_4 += 1;
					System.out.println("Integer 4 is correct");
				}
			} else if (x_1 == y_4 || x_2 == y_4 || x_3 == y_4) {

				System.out.println("4th Number inputted is not in the right place, try again");
				System.out.println("Enter Integer 4");
				y_4 = input.nextInt();
			} else {

				System.out.println("4th Number inputted is completely wrong");
				System.out.println("Enter Integer 4");
				y_4 = input.nextInt();
			}

			// after game finished

			if (z_1 == 4) {

				System.out.println("Congratulations! You win");
				System.out.println("Number: " + x_1 + x_2 + x_3 + x_4);

			}
		}

		input.close();

	}
}
