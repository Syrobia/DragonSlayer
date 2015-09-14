//started by Steven Porterfield (Syrobia) syrobia.github.io
//package com.github.syrobia.dragon
  
import java.util.Random;

public class Dragon extends Character
{
   private final int MAX_HEALTH = 750;
  
   private String name;
 
   public Dragon(String dragonName){
      name = dragonName;
      
      generateHealth();
      generateAttack();
      generateDefense();
   }
 
   public int generateHealth(){
      Random generator = new Random();
      setHp(generator.nextInt(4)+1);
      setHp(hp()*200)
      if (hp() > MAX_HEALTH)
        setHp(MAX_HEALTH);
      return hp();
   }
 
   public int generateAttack(){
      Random generator = new Random();
      attack = generator.nextInt(3)+1;
      attack = attack * 7;
      return attack;
   }
   
   public int generateArmor(){
      Random generator = new Random();
      defense = generator.nextInt(3)+1;
      defense = defense * 2;
      return defense;
   }
   
   public int getHealth()
   {
     return health;
   }
   
   public int getAttack()
   {
     return attack;
   }
   
   public int getDefense()
   {
     return defense;
   }
 
   public String toString()
   {
     String dragonStats = "";
     dragonStats = "Name: " + name + "\n";
     dragonStats = "Attack: " + getAttack() + "\n";
     dragonStats = "Defense: " + getDefense() + "\n";
     
     return dragonStats;
   }
}
