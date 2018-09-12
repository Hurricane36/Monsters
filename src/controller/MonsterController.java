package controller;

import model.MarshmellowMonster;

public class MonsterController
{
	//Data member Section
	private MarshmellowMonster myMonster;
	
	//Constructor section
	public MonsterController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmellowMonster("TheFailure" ,3.75 ,3, false ,3);
	}
	
	//method section
	public void start()
	{
		System.out.println(myMonster);
		
		
	}

}
