public class Wizard extends Adventurer {
  private int mana;
  private String warcry;

  public Wizard(){
    this("Garfield");
  }

  public Wizard(String name){
     this(name, "FIREBALLL!!!!", 22);
  }

  public Wizard(String name, String warcry, int mana){
    super(name, 15+(int)(Math.random()*10));
    setWarcry(warcry);
    setMana(mana);
  }

  // wizard Methods

  public void attack(Damageable other){
      int damage = (int)(Math.random()*8)+1;
      other.applyDamage(damage);
      setMana(getMana() + 1);
      System.out.println(this +
          " attacked " + other + " for " +
          damage + " damage!");
  }

  public void specialAttack(Damageable other){
     if(getMana() >= 5){
          int damage = (int)(Math.random()*16)+1;
          other.applyDamage(damage);
          System.out.println(this + " unleashes his wrath upon "
           + other + " for " + damage + " damage! "+warcry);
          setMana(getMana() - 5);
    }else{
        System.out.println("Not enough rage! ");
        attack(other);
    }
  }

  //get methods

  public int getMana(){
     return mana;
  }

  //set methods
  public void setMana(int m){
     this.mana = m;
  }

  public void setWarcry(String warcry){
     this.warcry = warcry;
  }

}
