package com.revature.object;

public class Driver {
	/**
	 * This is a free will assignment for you to have fun with what we have learned.
	 * 
	 * I want you to tell me a story using the following things:
	 * - Your own protagonist POJO.
	 * -- Provide three attributes to this POJO and two overloaded constructors besides the
	 * no args constructor.
	 * - Feel free to add more characters to your story.
	 * - An Interface and an Abstract Class which your POJO(s) will implement and/or extend.
	 * -- Add some fun methods in there.
	 * - Two custom exceptions, one extending from Exception and the other one extending
	 * from RuntimeException. These will be thrown in the story.
	 * 
	 * In the main method is where you tell the story. You can create as many instances
	 * (characters) as you need, but make you sure you present them into the console before
	 * starting the story.
	 * 
	 * Remember, I want you to have fun, BUT AS ALWAYS... Keep it professional.
	 * 
	 * P.S.: Don't forget to have this assignment under Java_Assignments folder.
	**/
	
	
	
	/*
	 * 1+ object as character
	 * 3+ field variables as attributes
	 * 1+ abstract class 
	 * 1+ interface class
	 * 1+ custom exception
	 * 1+ custom runtime exception
	 * 
	 * 
	 *	
	 */
	public static void main(String[] args) {
		System.out.println("Once upon a time there were two chihuahuas, ");
		Chihuahua myles = new Pupper("Myles");
		Pupper keelow = new Pupper("Keelow", 2);
		
		myles.setFavActivity("running in circles");
		System.out.println("while ");
		keelow.setFavActivity("following and pouncing at " + myles.getName() + ".");
		
		System.out.println("One day while they were playing- ");
		try {
			keelow.biteTooHard(myles.getName());
		} catch (BitTooHardException err){
			System.out.println("Oh no! " + err);
		}
		System.out.println(myles.getName() + " didn't want to play anymore.");
		System.out.println(keelow.learnALesson("don't bite too hard or your playmate will leave."));
		
		System.out.println("Eventually, ");
		System.out.println(myles.forgive(keelow));
		System.out.println("and they played together again.");
		System.out.println("The next day, they were eating dinner when- ");
		
		try {
			keelow.stealFood(myles);
		}catch(StealFoodException err) {
			System.out.println("Oh no! " + err);
		}
		
		myles.growlAt(keelow);
		System.out.println("Like before, ");
		System.out.println(myles.forgive(keelow));
		System.out.println("and they were best friends again.");
		System.out.println(
				keelow.learnAnImportantLesson(
						"as long as you learn from your mistakes, others will forgive you and continue to love you."));
		System.out.println("The End.");
	}
}
