//package com.github.syrobia.dragonslayer.item;

/*TODO
 *Check Syntax-Make sure implementation works perfectly
 */

public abstract class Item
{
  private String name;
  
  public Item(String newName)
  {
    name = newName;
  }
  
  public String returnName()
  {
    return name;
  }
  
  abstract String effect();
}