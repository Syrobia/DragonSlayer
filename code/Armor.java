public class Armor extends Item
{
   public static final int HELM = 0;
   public static final int CHEST = 1;
   public static final int LEG = 2;
   public static final int BOOT = 3;
   
   private int protection;
   private int type;
   
   public Armor (String name)
   {
      super(name);
      effect();
   }
   
   public void effect()
   {
      String name = super.returnName().toLowerCase();
      if (name.indexOf("helm") >= 0)
      {
         protection = 10;
         type = HELM;
      }
      else if (name.indexOf("chest") >= 0)
      { 
         protection = 25;
         type = CHEST;
      }
      else if (name.indexOf("leg") >= 0)
      {
         protection = 15;
         type = LEG;
      }
      else if (name.indexOf("boot") >= 0)
      {
         protection = 5;
         type = BOOT;
      }
      else
      {
         protection = 10;
         type = (int) (Math.random() * 4); //int from 0 to 3
      }
   }
   
   public int getProt()
   {
      return protection;
   }
   
   public int getType()
   {
      return type;
   }
   
   public String toString()
   {
      return super.returnName() + "\nProtection Level: " + protection + "\ntype: " + type;
   }
}
      
