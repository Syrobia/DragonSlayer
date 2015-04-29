//package com.github.syrobia.dragonslayer.inventory;

/*TODO
 * add addWeapon method
 */
public class Inventory
{
   Item[][] all = new Item[3][4];
   private int potionTotal = 0;
  
   public void addArmor(Armor armor) {
    
      if (armor.getClass() == "Helmet"){
         all[0][0] = armor;
      } 
      else if (armor.getClass() == "Chestplate"){
         all[0][1] = armor;
      } 
      else if (armor.getClass() == "Leggings"){
         all[0][2] = armor;
      } 
      else if (armor.getClass() == "Boots"){
         all[0][3] = armor;
      } 
      else {
         System.out.println ("That's not armor!");
      }
   }
  
   public void addPotion(Potion potion){
      if (potionTotal < 3)
      {
         all[1][potionTotal] = potion;
         potionTotal++;
      }
      else
      {
         System.out.println ("You can't hold any more potions!");
      }
   }
  
   public int getPotionAmount (){
      return potionTotal;
   }
  
   public void addWeapon(Weapon weapon)
      all[2][0] = weapon;
   
  
   public String toString()
   {
      for (Item[] items : all)
      {
         for (Item item : items)
         {
            System.out.print (item + " ");
         }
         System.out.println();
      }
   }
}
