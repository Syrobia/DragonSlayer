//Ammad Hashmi(Syrobot) www.github.com/Syrobot
//package com.dragonslayer.syrobia.github

/** TODO:
  * Create Difficulty Levels
  * Fix try/catch statement for weapon selection (InputMismatchException)
  * Possible JPanel
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
   
    int health = 100;
    int defEffect = 0;
    int atkEffect = 0;
    int damage = 10 + atkEffect;
    int dragonAttack = r.nextInt(26);
    int dragonHealth = 100;
    int potion = r.nextInt(50);
   
   String fight= new String();
   //Layout of Game to User
   System.out.println("King: Hello Knight!");
   scan.nextLine();
   System.out.println("Unknown: ROAAAAAAAAAAR!!!!!");
   scan.nextLine();
   System.out.println("King: What was that?");
   scan.nextLine();
   System.out.println("Squire: SIR! It is it, it has come for us!");
   scan.nextLine();
   System.out.println("King: No.. the legends... can't be true...");
   scan.nextLine();
   System.out.println("Squire: Yes sir, SKYRIM IS HERE! Will you Knight defeat the dragon for us? (Yes/No)");
   fight = scan.nextLine();
   System.out.println("King: " + fight + " you say? Go and fight it you noob, here choose a weapon and some armor.");
   
   int weapon = 0; 
   //boolean select = true; 
   //Choose weapon
   //while(select) {
   //try {
      System.out.println("Pick number 1, 2, or 3.");
      weapon = scan.nextInt(); 
   //} catch (InputMismatchException e) { 
    //  System.out.println("Error!"); weapon = scan.nextInt();
     // }
    //  select = false;
    //  }
   
   
   while (weapon < 1 || weapon > 3) {
       System.out.println("That's not an option. (Type: 1, 2, or 3)");
       weapon = scan.nextInt();
       }
   if(weapon == 1) {
      atkEffect = 10;
      damage = damage + atkEffect;
      System.out.println("You have chosen the Fire Sword (Atk Increased by 10)");}
   else if(weapon == 2){
      defEffect = 15;
      dragonAttack = dragonAttack - defEffect;
      System.out.println("You have chosen the Ice Sword (Def Increased by 15)");}
   else{
      System.out.println("You have chosen a dull sword, I hope you know what your doing");}
      
      //Battle
   int action;
      
   System.out.println("*You are now out fighting the legendary SKYRIM, a dragon from the depths of Mordor, born in Hogwarts.");
   while(dragonHealth > 0 && health > 0) {
      System.out.println("Attack (for " + damage + " damage) or use potion (for " + potion + ") more health points? (1 for attack; 2 for potion, anything else for nothing)");
      action = scan.nextInt();
      int i = 0;
         for(i = i; i < 1; i++){
             potion = r.nextInt(14); 
             dragonAttack = r.nextInt(46);}

      if(action == 1){
         dragonHealth = dragonHealth - damage;
         health = health - dragonAttack;
         System.out.println("Dragon health: " + dragonHealth);
         System.out.println("SKYRIM attacks!");
         System.out.println("Your health: " + health);
         } else if (health + potion > 100){
            health = 100;
            System.out.println("Your health: " + health);
            health = health - (dragonAttack + 5);
            System.out.println("Dragon attacks, Your health: " + health);
            System.out.println("Dragon health: " + dragonHealth);
            } else {
               health = health + potion;
               System.out.println("Your health: " + health);
               health = health - (dragonAttack + 5);
               System.out.println("SKYRIM attacks!");
               System.out.println("Your health: " + health);
               System.out.println("Dragon health: " + dragonHealth); 
               }
               
      i = 0;
      if(health <= 0)
         System.out.println("You can't fight with a sword you dimwit...YOU LOSE");
      if(dragonHealth <= 0)
         System.out.println("You have saved the kindgom from SKYRIM! HOORAH! Now back to work...");
     } 
   }
}
