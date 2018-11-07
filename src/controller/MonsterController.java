package controller;
import java.util.Scanner;
import model.MarshmellowMonster;
import javax.swing.JOptionPane;
public class MonsterController
{
	//Data member Section
	private MarshmellowMonster myMonster;
	
	//Constructor section
	public MonsterController()
	{
		//Job 1: initialize data members!
		//myMonster = new MarshmellowMonster("TheFailure" ,3.75 ,3, false ,3);
		//userMonster = new MarshmellowMonster();
		MarshmellowMonster userMonster;
		
		
	}
	
	//method section
	public void start()
	{
		
	}
	public void questions()
	{
		JOptionPane.showMessageDialog(null,"What is your monster's Name?");
		
		
		
		
		//use this method instead of"System.println("")
		
		
		//System.out.println(myMonster);
		JOptionPane.showMessageDialog(null,myMonster);
		myMonster.setarmCount(666);
		//System.out.println("My monster has this many arms:" + myMonster.getarmCount());
	
		//Make a new monster and customize from user input!

		//Scanner inputScanner = new Scanner(System.in);
		//System.out.println("What is your monsters name?");
		//String answer = inputScanner.nextLine();
		
		
		
		
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"You show type a integer value");
		}
		return isValid;
	}
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"This requires a double value aka something with a .>");
		}
		return isValid;
	}
{
	
		
	}
	
}
