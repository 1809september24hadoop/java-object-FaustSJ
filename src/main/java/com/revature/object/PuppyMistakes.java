package com.revature.object;

public interface PuppyMistakes {

	public void stealFood(Chihuahua doggo) throws StealFoodException;
	
	public void biteTooHard(String name) throws BitTooHardException;
	
	public String learnALesson(String lesson);
}
