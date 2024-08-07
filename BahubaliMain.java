package com;

public class BahubaliMain {

	public static void main(String[] args) {
		
		Bahubali2 b1 = new Bahubali2 ();
		b1.setHero("Prabhas");
		b1.setDirector("Rajamouli");
		int todaycollections = b1.totalCollections(200, 100, 50);
		
		Cinema cinema1 = new Cinema();
		cinema1.setName("Bahubali");
		cinema1.setYear(2015);
		
		
		System.out.println("Director is " + b1.getDirector() );
		System.out.println("Hero is "+ b1.getHero() );
		System.out.println("TodayCollections of movie is " +todaycollections + " cr ");
		System.out.println("The movie is " + cinema1.getName() + " and it is released in the year " + cinema1.getYear());
	}

}
