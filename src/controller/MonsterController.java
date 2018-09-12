package controller;
import java.util.Scanner;
import model.MarshmellowMonster;

public class MonsterController
{
	//Data member Section
	private MarshmellowMonster myMonster;
	private MarshmellowMonster userMonster;
	//Constructor section
	public MonsterController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmellowMonster("TheFailure" ,3.75 ,3, false ,3);
		; 
		
		
	}
	
	//method section
	public void start()
	{
		System.out.println(myMonster);
		myMonster.setarmCount(666);
		System.out.println("My monster has this many arms:" + myMonster.getarmCount());
	
		//Make a new monster and customize from user input!
		userMonster = new MarshmellowMonster();
		MarshmellowMonster userMonster;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("What is your monsters name?");
		String answer = inputScanner.nextLine();
		
		
		
		
		
	}

	{
	
		
	}
	
}
