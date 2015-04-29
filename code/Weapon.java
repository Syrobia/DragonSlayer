public class Weapon extends Item
{
   private int damage;
   private int attributeNumber;
   
   /*To Do:
     Add a way to add attributes.
   */
   
   public Weapon(String name)
   {
      super(name);
      effect();
   }
   
   public void effect()
   {
      String name = getName().toLowerCase();
      if (name.equals("syrobia"))
      {
         damage = 1337;
         attributeNumber = 3;
      }
      else if (name.indexOf("sword") >= 0)
      {
         damage = 100;
         attributeNumber = 1;
      }
      else if (name.indexOf("club") >= 0)
      {
         damage = 50;
         attributeNumber = 2;
      }
      else if (name.indexOf("staff") >= 0)
      {
         damage = 25;
         attributeNumber = 3;
      }
      else
      {
         damage = (int) (Math.random() * 100) + 1;
         attributeNumber = (int) (Math.random() * 3) + 1;
      }
   }
   
   public int getDamage()
   {
      return damage;
   }
   
   public int getAttributeSlots()
   {
      return attributeNumber;
   }
   
   public String toString()
   {
      return getName() + "\nDamage: " + damage + "\nAttribute Slots: " + attributeNumber;
   }
}