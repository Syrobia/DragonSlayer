public class Weapon extends Item
{
   private int damage;
   
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
         damage = (int) (Math.random() * 100) + 1;
         attributeNumber = (int) (Math.random() * 3) + 1;
   }
   
   public int getDamage()
   {
      return damage;
   }
   
   public String toString()
   {
      return getName() + "\nDamage: " + damage;
   }
}
