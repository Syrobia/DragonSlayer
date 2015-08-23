//Syrobia
//package com.github.syrobia.dragonslayer.attributes;

//DECLARED INACTIVE FOR INITIAL RELEASE (WORK ON IT LATER)

public class Attributes{
    
  private String attribute = "";
  private String[] attributeList = {"Fire", "Ice", "Water", "Lightning", "Swag", "Syrobia"};
  
  public Attribute(int index)
  {
    attribute = attributeList[index];
  }
  
  public static int getIndex(String attr)
  {
    int index = 0;
    boolean found = false;
    
    for (int i = 0; i < attributeList.length && found != true; i++)
    {
      if (attr == attributeList[i])
      {
        index = i;
        found = true;
      }
    }
    
    if (found = false)
    {
      System.out.println ("That's not an attribute!");
      return -1;
    }
    
    return index;
  }
}
