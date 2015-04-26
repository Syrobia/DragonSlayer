public class Potion extends Item
{
  private int healthEffect;
  private String clase;
  
  public Potion (String name)
  {
    super(name);
    effect();
  }
  
  public void effect()
  {
    //lolcats
    String name = super.returnName().toLowerCase();
    if (name.indexOf("normal") >= 0)
    {
      healthEffect = 10;
      clase = "Normal";
    }
    else if (name.indexOf("strong") >= 0)
    { 
      healthEffect = 25;
      clase = "Strong";
    }
    else if (name.indexOf("fire") >= 0)
    {
      healthEffect = -15;
      clase = "Weak";
    }
    else if (name.indexOf("posion") >= 0)
    {
      healthEffect = -10;
      clase = "Posion";
    }
    
    else
    {
      healthEffect = 0;
    }
    
    if (name.indexOf("syrobia")
    {
      healthEffect = 420;
      clase = "#BLAZEIT";
    }
  }
  
  public int getHealthEffect()
  {
    return healthEffect;
  }
  
  public String getClass()
  {
    return clase;
  }
  
  public String toString()
  {
    return super.returnName() + "\nHealth Level: " + healthEffect + "\nClass: " + clase;
  }
}
