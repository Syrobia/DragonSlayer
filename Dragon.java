//started by Steven Porterfield (Syrobia) syrobia.github.io
//package com.github.syrobia.dragon

/*TODO
  * Set up attributes
  /*
  
import java.util.Random;

public class Dragon extends Character 
{
  private static final int MAX_HEALTH = 750;
  //change to public?
  
  private String typeOfDragon;
	
	public Dragon(int h, int a, int aE, int hE){
		super(h, a, aE, hE);
	}
	
	public int generateHealth{
	Random generator = new Random();
	super.setHealth(generator.nextInt(3)+1);
	super.setHealth(super.getHealth() * 200);
	return super.getHealth();
	}
	
	public int generateAttack(){
	Random generator = new Random();
	super.setAttack(generator.nextInt(3)+1);
	super.setAttack(super.getAttack() * 50);
	return super.getAttack();
	}
	
	public String typeOfDragon(){
	int temp;
	Random generator = new Random();
	temp = generator.nextInt(6)+1; 
	if (temp == 1)
		typeOfDragon = "fire";
	else if (temp == 2)
		typeOfDragon = "ice";
	else if (temp == 3)
		typeOfDragon = "rock";
	else if (temp == 4)
		typeOfDragon = "lightning";
	else if (temp == 5)
		typeOfDragon = "teja";
	else
		typeOfDragon = "normal";
	
	return typeOfDragon;
	}
	
	public int getEffect()
	int addedEffect;
	int negativeEffect;
	if (typeOfDragon.equals("fire"))
		addedEffect = super.getAttack() + 75;
		negativeEffect = super.getHealth() - 15;
		
	if (typeOfDragon.equals("lightning"))
		addedEffect = super.getAttack() + 225;
		negativeEffect = super.getHealth() - 25;
		
	if (typeOfDragon.equals("ice"))
		addedEffect = super.getHealth() + 75;
		negativeEffect = super.getAttack() - 15;
		
	if (typeOfDragon.equals("rock"))
		addedEffect = super.getHealth() + 225;
		negativeEffect = super.getAttack() - 220;
		
	if (typeOfDragon.equals("teja"))
		addedEffect = super.getAttack() + 360;
		negativeEffect = super.getHealth() + 100;
		
	if (addedEffect > MAX_HEALTH)
		addedEffect = MAX_HEALTH;
		
	return addedEffect;
	return negativeEffect;
	}
}
	
	
