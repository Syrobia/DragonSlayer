public class Armor extends Item
{
  private int protection;
  private String clase;
  
  public Armor (String name)
  {
    super(name);
    effect();
  }
  
  public void effect()
  {
    //lolcats
    String name = super.returnName().toLowerCase();
    if (name.indexOf("helm") >= 0)
    {
      protection = 10;
      clase = "Helmet";
    }
    else if (name.indexOf("chest") >= 0)
    { 
      protection = 25;
      clase = "Chestplate";
    }
    else if (name.indexOf("leg") >= 0)
    {
      protection = 15;
      clase = "Leggings";
    }
    else if (name.indexOf("boot") >= 0)
    {
      protection = 5;
      clase = "Boots";
    }
    
    else
    {
      protection = 0;
    }
    
    if (name.indexOf("syrobia")
    {
      protection = 420;
      clase = "#BLAZEIT";
    }
  }
  
  public int getProtection()
  {
    return protection;
  }
  
  public String getClass()
  {
    return clase;
  }
  
  public String toString()
  {
    return super.returnName() + "\nProtection Level: " + protection + "\nClass: " + clase;
  }
}
      
