//Ammad Hashmi(Syrobot) www.github.com/Syrobot
//package com.dragonslayer.syrobia.github

/** TODO:
  * Create Difficulty Levels
  * Possible JPanel
  * Start to implement the object classes created
  */

//Java Needed Utilities
import java.util.Scanner;
import java.util.Random;

//Java Needed Exception Catchers
import java.util.InputMismatchException;

public class DragonSlayer {
   public static void main (String[] args) {
   
   Random r = new Random();
   Scanner scan = new Scanner(System.in);
   
    int health = 100; //health of player
    int defEffect = 0; //Effect on Health
    int atkEffect = 0; //Effect on attack
    int damage = 10 + atkEffect; //Extra damage 
    int dragonAttack = r.nextInt(26); //Randomized Dragon Attack
    int dragonHealth = 100; //Health of dragon
    int potion = r.nextInt(50); //Used to increase player health (changes per tern)
    final int MAX_HEALTH = 100; //Max health of player
   
   String fight= new String(); //Used in Script
   //Layout of Game to User 
   System.out.println("King: Hello Knight!");
   scan.nextLine(); //Just for fun, more player interaction
   System.out.println("Unknown: ROAAAAAAAAAAR!!!!!");
   scan.nextLine();
   System.out.println("King: What was that?");
   scan.nextLine();
   System.out.println("Squire: SIR! It's here! It has come for us!");
   scan.nextLine();
   System.out.println("King: No.. the legends... can't be true...");
   scan.nextLine();
   System.out.println("Squire: Yes sir, SKYRIM IS HERE! Will you, Knight, defeat the dragon for us? (Yes/No)");
   fight = scan.nextLine(); 
   System.out.println("King: " + fight + " you say? Go and fight it you noob, here -- choose a weapon and some armor.");
   
   int weapon = 0; //Used in weapon selection
   // The following try/catch will be trying to make sure an int is entered and not anything else
   do{
       System.out.println("Pick a number from 1 to 3.");
       if(scan.hasNextInt()){
           weapon = scan.nextInt();
           break;
       }else{
           System.out.println("Enter an integer only");
           scan.nextLine();
       }
   }while(true);
   
   if(weapon == 1) { //choosing 1 will increase attack by 10
      atkEffect = 10;
      damage = damage + atkEffect;
      System.out.println("You have chosen the Fire Sword (Atk Increased by 10)");
      }else if(weapon == 2){ //choosing 2 will decrease dragon attack (aka Player Defense)
         defEffect = 15;
         dragonAttack = dragonAttack - defEffect;
         System.out.println("You have chosen the Ice Sword (Def Increased by 15)");
         }else{ //Choosing 3 will result in to added effect
      System.out.println("You have chosen a dull sword, I hope you know what you're doing");
         }
      
      //Battle
   int action; //Represents action taken, either attack, use potion, etc.
      
   System.out.println("*You are now out fighting the legendary SKYRIM, a dragon from the depths of Mordor, born in Hogwarts.");
   while(dragonHealth > 0 && health > 0) { //While both entities are alive
      System.out.println("Attack (for " + damage + " damage) or use potion (for " + potion + ") more health points? (1 for attack; 2 for potion, anything else for nothing)");
      action = scan.nextInt();
         for(int i = 0; i < 1; i++){ //This for loop will aid in the randomizing of potion effet and dragonAttack
             potion = r.nextInt(21); 
             dragonAttack = r.nextInt(46);}

      if(action == 1){ //If attack
         dragonHealth = dragonHealth - damage;
         health = health - dragonAttack;
         System.out.println("Dragon health: " + dragonHealth);
         System.out.println("SKYRIM attacks!");
         System.out.println("Your health: " + health);
         } else if (action == 2 && health + potion > MAX_HEALTH){ //if potion used, and use of potion will result in health above (MAX_HEALTH)
            health = 100;
            System.out.println("Your health: " + health);
            health = health - (dragonAttack + 5);
            System.out.println("Dragon attacks, Your health: " + health);
            System.out.println("Dragon health: " + dragonHealth);
            } else if (action == 2 && health + potion < MAX_HEALTH) { //if potion used, and won't result in health above MAX_HEALTH
               health = health + potion;
               System.out.println("Your health: " + health);
               health = health - (dragonAttack + 5);
               System.out.println("SKYRIM attacks!");
               System.out.println("Your health: " + health);
               System.out.println("Dragon health: " + dragonHealth); 
               } else { //If action 1 or 2 isn't chosen, idle...
                System.out.println("You stood there like a buffoon...");
               }
               
      
      if(health <= 0) //If player dies...
         System.out.println("You can't fight with a sword, you dimwit...YOU LOSE");
      if(dragonHealth <= 0) //If dragon dies...
         System.out.println("You have saved the kindgom from SKYRIM! HOORAH! Now back to work...");
     } 
   }
}
