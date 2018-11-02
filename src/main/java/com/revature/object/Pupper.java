package com.revature.object;

public class Pupper extends Chihuahua implements PuppyMistakes{
	
	String[] lessons = new String[2];
	String importantLesson;
	
	public Pupper(String name) {
		super(name);
	}
	
	public Pupper(String name, int ageInMonths) {
		//implicitly calls super()
		this.name=name;
		System.out.println("named "+ name + ".");
		setAgeInMonths(ageInMonths); 
	}
	
	@Override
	public void stealFood(Chihuahua doggo) throws StealFoodException{
		throw new StealFoodException(this.name + " started eating " + doggo.getName() + "\'s food!");
	}
	
	@Override
	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
		System.out.println(name + " was only " + this.ageInMonths + " months old.");
	}

	@Override
	public void biteTooHard(String name) throws BitTooHardException {
		throw new BitTooHardException(this.name + " bit " + name + " too hard!");
	}

	@Override
	public String learnALesson(String lesson) {
		System.out.println(name + "  learned a lesson that day:");
		
		if(this.lessons[0]==null) {
			lessons[0] = lesson;
		}else {
			lessons[1] = lesson;
		}
		
		return lesson;
	}
	
	@Override
	public void getScared() {
		System.out.println("and " + this.name + " got scared.");
		System.out.println(learnALesson("don't steal others' food or they will get angry."));
	}
	
	public String learnAnImportantLesson(String lesson) {
		System.out.println("That's when " + name + "  learned his third and most important lesson:");
		this.importantLesson = lesson;
		return this.importantLesson;
	}
}
