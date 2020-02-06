package com.mycompany.app;

public class Sweets extends Dryfruits implements Milk
{  
	String sweetname;
	int weight;
	public String candiName()
	{
	return sweetname;
	}

	public int wgt()
	{
	return weight;
	}
	public String toString() 
	{
		return String.format(sweetname + " with weight " + weight + " grams");
	}
	public void mi()
	{
		System.out.println("Contains milk");
	}
	
}

