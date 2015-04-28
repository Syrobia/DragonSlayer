//started by Steven Porterfield (Syrobia) syrobia.github.io
//package com.github.syrobia.dragon
  
import java.util.Random;

public class Dragon
{
   private final int MAX_HEALTH = 750;
  
   private String typeOfDragon;
   private String name;
   private int health, attack, defense;
 
   public Dragon(String dragonName){
      name = dragonName;
   }
 
   public int generateHealth(){
      Random generator = new Random();
      health = generator.nextInt(4)+1;
      health = health * 200;
      if (health > MAX_HEALTH)
        health = MAX_HEALTH;
      return health;
   }
 
   public int generateAttack(){
      Random generator = new Random();
      attack = generator.nextInt(3)+1;
      attack = attack * 50;
      return attack;
   }
   
   public int generateArmor(){
      Random generator = new Random();
      defense = generator.nextInt(3)+1;
      defense = defense * 25;
      return defense;
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
         typeOfDragon = "tejaswagmasta#360noscopestomahacks";
      else
         typeOfDragon = "normal";
   
      return typeOfDragon;
   }
 
   public int getAddedAttack(){
      if (typeOfDragon.equals("fire"))
        attack = attack + 25;
      if (typeOfDragon.equals("lightning"))
        attack = attack + 50;
      if (typeOfDragon.equals("tejaswagmasta#360noscopestomahacks"))
        attack = attack + 100;
      
      return attack;
   }
   
   public int getAddedDefense(){
      if (typeOfDragon.equals("ice"))
        defense = defense + 50;
      if (typeOfDragon.equals("rock"))
        defense = defense + 100;
        
      return defense;
   }
 
   public String toString()
   {
     String dragonStats = "";
     dragonStats = "Name: " + name + "\n";
     dragonStats = "The dragon has the elemental power of " + typeOfDragon() + "\n";
     dragonStats = "Attack: " + getAddedAttack() + "\n";
     dragonStats = "Defense: " + getAddedDefense() + "\n";
     
     return dragonStats;
   }
}
