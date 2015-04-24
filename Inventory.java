//package com.github.syrobia.dragonslayer.inventory;

/*TODO
 *Create Armor Class - Done
 *Create Potion Class
 */
public class Inventory
{
  Item[][] all = new Item[3][4];
  
  public void addArmor(Armor armor)
  {
    if (armor.getClass() == "Helmet")
    {
      all[0][0] = armor;
    }
    else if (armor.getClass() == "Chestplate")
    {
      all[0][1] = armor;
    }
    else if (armor.getClass() == "Leggings")
    {
      all[0][2] = armor;
    }
    else if (armor.getClass() == "Boots")
    {
      all[0][3] = armor;
    }
    else
    {
      System.out.println ("That's not armor!");
    }
  }
}
