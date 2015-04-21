//started by Micheal Head(Syrobot) www.github.com/Syrobot
//package com.dragonslayer.syrobia.github

public class Character
{
    public static final int MAX_HEALTH;
   
	private int health;
	private int attack;
	
	private int atkEffect;
	private int hpEffect;
	
	public Character(int h, int a, int aE, int hE)
	{
		health = h;
		attack = a;
		atkEffect = aE;
		hpEffect = hE;
	}
}
