//package com.github.syrobia.dragonslayer.inventory;

/*TODO
 * add addWeapon method
 */
public class Inventory
{
   Weapon wpn = new Weapon();
   Armor[] amr = new Armor[4];
   Potion[] pot = new Potion[3];
  
   public void addArmor(Armor armor) 
   {
      if (armor.getType() == Armor.HELM){
         amr[HELM] = armor;
      } 
      else if (armor.getType() == Armor.CHEST){
         amr[CHEST] = armor;
      } 
      else if (armor.getType() == Armor.LEG){
         amr[LEG] = armor;
      } 
      else if (armor.getType() == Armor.BOOT){
         amr[BOOT] = armor;
      } 
   }
  
   public void addPotion(Potion potion)
   {
      for (int k = 0; k < pot.length; k++)
      {
         if (pot[k] != null)
         {
            pot[k] = potion;
            k = pot.length; //a cheap way of exiting the loop
         }
      }
   }
  
   public int getPotNum ()
   {
      int count;
      
      for (int k = 0; k < pot.length; k++)
      {
         if(pot[k] != null)
         {
            count++
         }
      }
      
      return count;
   }
  
   public void addWeapon(Weapon weapon)
   {
      wpn = Weapon;
   }
  
   public String toString()
   {
      //TODO
   }
}
