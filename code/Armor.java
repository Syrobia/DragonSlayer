public class Armor extends Item
{
   private int protection;
   private byte type;
   
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
         type = 0;
      }
      else if (name.indexOf("chest") >= 0)
      { 
         protection = 25;
         type = 1;
      }
      else if (name.indexOf("leg") >= 0)
      {
         protection = 15;
         type = 2
      }
      else if (name.indexOf("boot") >= 0)
      {
         protection = 5;
         type = 3;
      }
      else
      {
         protection = 5;
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
      
