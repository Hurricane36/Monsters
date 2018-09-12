package model;

public class MarshmellowMonster
{
	//------Data Member Section-----------
	//They are ALWAYS private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	private String userName;
	private double userlegCount;
	private int usereyeCount;
	private boolean userhasNoses;
	private int userarmCount;
	
	
	
	
	public MarshmellowMonster()
	{
		//Default values are 0 or null
		
	}
	
	public MarshmellowMonster(String name)
	{
		this.name = name;
		this.name = userName;
	}
	
	public MarshmellowMonster(String userName, double userlegCount, int usereyeCount, boolean userhasNoses,int userarmCount)
	{
	this.name = userName;
	this.legCount = usereyeCount;
	this.hasNoses = userhasNoses;
	this.armCount = userarmCount;
	}
	public MarshmellowMonster(String name, double legCount, int eyeCount, boolean hasNoses,int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
			
	}

	//Getters
	
	public String getName()
	{
		return name;
	}
	
	public double getlegCount()
	{
		return legCount;
	}

	public int geteyeCount()
	{
		return eyeCount;
	}
	
	public boolean gethasNoses()
	{
		return hasNoses;
	}
	
	public int getarmCount()
	{
		return armCount;
	}
	
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setlegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void seteyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void sethasNoses(boolean hasnoses)
	{
		this.hasNoses = hasnoses;
	}
	
	public void setarmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "My monsters name is"+ name + "She has" + legCount + "legs" + eyeCount + "eyes"+ hasNoses + "Nose" + armCount + "arms";
		
		return description;
	}
	
}
