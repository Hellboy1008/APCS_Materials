import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float integer_1;
		String mathoperator;
		float integer_2;
		float final_ans;

		// input integer

		System.out.println("Enter Integer");
		integer_1 = input.nextFloat();

		// input mathematical function

		System.out.println("Enter Mathematical Operator");
		mathoperator = input.next();
		System.out.println("Operator Chosen = " + mathoperator);

		// input second integer

		System.out.println("Enter Second Integer");
		integer_2 = input.nextFloat();

		// Final Answer

		if (mathoperator.equals("/")) {

			final_ans = integer_1 / integer_2;
			System.out.println(final_ans);
		} 
		else if (mathoperator.equals("+")) {

			final_ans = integer_1 + integer_2;
			System.out.println(final_ans);
		} 
		else if (mathoperator.equals("-")) {

			final_ans = integer_1 - integer_2;
			System.out.println(final_ans);
		} 
		else if (mathoperator.equals("*")) {

			final_ans = integer_1 * integer_2;
			System.out.println(final_ans);
		}
		input.close();
	}

}
