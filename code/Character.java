//started by Micheal Head(Syrobia) syrobia.github.io
//package com.dragonslayer.syrobia.github

public class Character
{
  //reference/object initiation
  private String name;  
  
  //constant initiation
  public final int MAX_HEALTH;
    
  //variable initiation
  private int health;
  private int attack;
  private int atkExtra; 
  private int hpExtra;
  
  public Character()
  {
  	MAX_HEALTH = 100;
  	name = "";
  	health = 100;
  	attack = 10;
  	atkExtra = 0;
  	hpExtra = 0;
  }
  
  public Character(String n, int h, int a, int aE, int hE, int maxH)
  {
  	MAX_HEALTH = maxH;
    name = n;
    health = h;
    attack = a;
    atkExtra = aE;
    hpExtra = hE;
    
    if (health > MAX_HEALTH)
    { 
    	//i'm not up for the program closing with an exception, and especially not up for dealing with try/catch
      //so for now, we'll just force an error message into the game screen
      
    	System.out.println("--------------------------------");
    	System.out.println("ERR:37: code/Character.java     ");
    	System.out.println("health greater than MAX_HEALTH"  );
    	System.out.println("health will be set to MAX_HEALTH");
    	System.out.println("--------------------------------");
    	
    	health = MAX_HEALTH;
    }
	}
 
  public void attack(Character e){
  e.setHealth(e.getHealth() - (attack + atkEffect));
  
 }
 
 public void setName(String n)
 {
  name = n;
 }
 
 public int setHp(int h){
  int oldHealth = health;
  health = h;
  return oldHealth;
 }
 
 public int setAtk(int a){
  int oldAttack = attack;
  attack = a;
  return oldAttack;
 }
 
 public int setAtkExt(int aE){
  int oldAEffect = atkEffect;
  atkEffect = aE;
  return oldAEffect;
 }
 
 public int setHpExt(int hE){
  int oldHpEffect = hpEffect;
  hpEffect = hE;
  return oldHpEffect;
 }
 
 public String name()
 {
  return name;
 }
 
 public int hp(){
  return health;
 }
 
 public int atk(){
  return attack;
 }
 
 public int atkExt(){
  return atkEffect;
 }
 
 public int hpExt(){
  return hpEffect;
 }
}
 
