//package com.github.syrobia.dragonslayer.inventory;

/*TODO
 *Create Armor Class
 */
public class Inventory
{
  Item[][] all = new Item[3][4];
  
  public void addArmor(String armor)
  {
    if (armor.indexOf("helm") != -1)
    {
      all[0][0] = armor;
    }
    else if (armor.indexOf("chest") != -1)
    {
      all[0][1] = armor;
    }
    else if (armor.indexOf("leg") != -1)
    {
      all[0][2] = armor;
    }
    else if (armor.indexOf("boot") != -1)
    {
      all[0][3] = armor;
    }
    else
    {
      System.out.println ("That's not armor!");
    }
  }
}
