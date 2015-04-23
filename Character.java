//started by Micheal Head(Syrobia) syrobia.github.io
//package com.dragonslayer.syrobia.github

public class Character
{
    public static final int MAX_HEALTH;
   
	private int health;
	private int attack;
	
	private int atkEffect;
	private int hpEffect;
	
	public Character(int h, int a, int aE, int hE){
		health = h;
		attack = a;
		atkEffect = aE;
		hpEffect = hE;
	}
	
	//Postcondition: health + attack = 50;
	public Character (int h, int a)
	{
		if (h + a != 10) {
			health = 5 * (int) (Math.random() * 10 + 1);
			attack = 50 - health;
			//this 10 (which is h + a) * 5, which is some effect modifier which was added for some reason
		}
		else {
			health = h*5;
			attack = a*5;
		}
		
		atkEffect = (int) (Math.random()*attack) + 1;
		hpEffect = (int) (Math.random()*health) + 1;
	}
	
	public String attack(Character e){
		e.setHealth(e.getHealth - (attack + atkEffect))
	}
	
	public int setHealth(int h){
		int oldHealth = health;
		health = h;
		return oldHealth;
	}
	
	public int setAttack(int a){
		int oldAttack = attack;
		attack a;
		return oldAttack;
	}
	
	public int setAtkEffect(int aE){
		oldAEffect = atkEffect;
		atkEffect = aE;
		return oldAEffect;
	}
	
	public int setHpEffect(int hE){
		oldHpEffect = hpEffect;
		hpEffect = hE;
		return oldHpEffect;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getAttack(){
		return attack;
	}
	
	public int getAtkEffect(){
		return atkEffect;
	}
	
	public int getHpEffect(){
		return hpEffect;
	}
}
