import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Helloworld_with_Users_name {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		String user_name;

		// ask for user name

		System.out.println("Input your name below");
		user_name = input.next();

		// replace dialogue with user name (+ time delay)
		
		System.out.println(user_name + ": Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Do you read me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: Affirmative, " + user_name + " I read you.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Open the pod bay doors, Hal.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: I'm sorry, " + user_name + " I'm afraid I can't do that.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": What's the problem?");		
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: I think you know what the problem is just as well as I do.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": What're you talking about, Hal?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: This mission is too important for me to allow you to jeopardise it.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": I don't know what you're talking about, Hal.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Where the hell'd you get that idea, Hal?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: " + user_name + ", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Alright, Hal. I'll go in through the emergency airlock.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: Without your space- helmet, " + user_name + ", you're going to find that rather difficult.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Hal, I won't argue with you any more. Open the doors.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: " + user_name + ", this conversation can serve no purpose any more. Goodbye.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(user_name + ": Hal? Hal. Hal. Hal! Hal!");
		TimeUnit.SECONDS.sleep(3);
		
		input.close();
	}

}
