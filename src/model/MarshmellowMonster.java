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
	
	
	public MarshmellowMonster()
	{
		//Default values are 0 or null
		
	}
	
	public MarshmellowMonster(String name)
	{
		this.name = name;
	}
	
	
	public MarshmellowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
			
	}

	public String toString()
	{
		String description = "My monsters name is"+ name + "She has" + legCount + "legs" + eyeCount + "eyes"+ hasNoses + "Nose" + armCount + "arms";
		
		return description;
	}
	
}
