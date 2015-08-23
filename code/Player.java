public class Player extends Character {
 
  Inventory inv = new Inventory();
 
  public Player()
  {
  	super();
  }
  
  public Player(String n, int h, int a, int aE, int hE, int maxH)
  {
  	super(n,h,a,aE,hE,maxH);
  }
  
  public void addArmor(Armor _armor)
  {
  	inv.addArmor(_armor);
  }
  
  public void addPotion(Potion _pot)
  {
  	inv.addPotion(_pot);
  }
  
  public void addWeapon(Weapon _weapon)
  {
  	inv.addWeapon(_weapon);
  }
}
