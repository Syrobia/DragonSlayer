public class Potion extends Item
{
  /*TODO
   *Throwable potions aswell?
   *
   */
  private int healAmt;
  
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
      healAmt = 10;
      clase = "Normal";
    }
    else if (name.indexOf("strong") >= 0)
    { 
      healAmt = 25;
      clase = "Strong";
    }
    else
    {
      health = (int) (Math.random() * 21 + 5) //int from 5 to 25, i think
    }
  }
  
  public int getHealAmt()
  {
    return healAmt;
  }
  
  public String toString()
  {
    return super.returnName() + "\nHeal Amount: " + healthEffect;
  } 
}
