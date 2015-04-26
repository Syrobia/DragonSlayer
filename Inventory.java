//package com.github.syrobia.dragonslayer.inventory;

/*TODO
 * add addWeapon method
 */
public class Inventory
{
  Item[][] all = new Item[3][4];
  
  public void addArmor(Armor armor) {
    
    if (armor.getClass() == "Helmet"){
        all[0][0] = armor;
    } else if { (armor.getClass() == "Chestplate")
        all[0][1] = armor;
    } else if { (armor.getClass() == "Leggings")
        all[0][2] = armor;
    } else if { (armor.getClass() == "Boots")
        all[0][3] = armor;
    } else {
      System.out.println ("That's not armor!");
    }
  }
  
  public void addPotion(Potion potion){
    
    if (potion.getClass() == "Normal") {
        all[2][0] = potion;
    } else if { (potion.getClass() == "Strong")
        all[2][1] = potion;
    } else if { (potion.getClass() == "Weak")
        all[2][2] = potion;
    } else if { (potion.getClass() == "Posion")
        all[2][3] = potion;
    } else {
      System.out.println ("That's not a potion!");
    }
  }
   
}
