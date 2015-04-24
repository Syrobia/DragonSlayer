public class Armor extends Item
{
  private int protection;
  private String class;
  
  public Armor (String name)
  {
    super(name);
    effect();
  }
  
  public void effect()
  {
    //lolcats
    String name = super.returnName();
    if (name.indexOf("helm") >= 0)
    {
      protection = 10;
      class = "Helmet";
    }
    else if (name.indexOf("chest") >= 0)
    { 
      protection = 25;
      class = "Chestplate";
    }
    else if (name.indexOf("leg") >= 0)
    {
      protection = 15;
      class = "Leggings";
    }
    else (name.indexOf("boot") >= 0)
    {
      protection = 5;
      class = "Boots";
    }
  }
  
  public int getProtection()
  {
    return protection;
  }
  
  public String getClass()
  {
    return class;
  }
  
  public String toString()
  {
    return super.returnName() + "\nProtection Level: " + protection + "\nClass: " + class;
  }
}
      
