package com.revature.object;

public abstract class Chihuahua {
	
	//fields are set to "protected" so that the child class has direct access to them.
	protected String name;
	protected String favActivity;
	protected int ageInMonths;
	
	public Chihuahua() {
		System.out.println("and a puppy");
	}
	
	public Chihuahua(String name) {
		this.name = name;
		this.ageInMonths = 20;
		System.out.println("a 1-year-old named " + name);
	}
	
	abstract public void setAgeInMonths(int ageInMonths);
	
	public void setFavActivity(String favActivity) {
		this.favActivity = favActivity;
		System.out.println(name + "\'s favorite activity was " + this.favActivity);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String forgive(Chihuahua pup) {
		return new String(this.name + " forgave " + pup.getName());
	}
	
	public void growlAt(Chihuahua pup) {
		System.out.println(this.name + " growled at " + pup.getName());
		pup.getScared();
	}
	
	abstract public void getScared();
}
