public class Wizard extends Adventurer {
  private int mana;
  private String warcry;
  private int manaMax;

  public Wizard(){
    this("Garfield");
  }

  public Wizard(String name){
     this(name, "FIREBALLL!!!!", 15);
  }

  public Wizard(String name, String warcry, int mana){
    super(name, 50+(int)(Math.random()*50));
    setWarcry(warcry);
    setMana(mana);
    setmaxHP(100);
    this.manaMax = 20;
  }

  // wizard Methods

  public void attack(Damageable other){
      int damage = (int)(Math.random()*8)+1;
      other.applyDamage(damage);
      setMana(getMana() + 1);
      System.out.println(Text.colorize(this +
          " attacked " + other + " for " +
          damage + " damage!", Text.BOLD, Text.WHITE));
  }

  public void specialAttack(Damageable other){
     if(getMana() >= 5){
       double number = Math.random();
       int multiplier = 1;
       if (number > 0.5) multiplier *=2;
          int damage = (int)(Math.random()*16*multiplier)+1;
          other.applyDamage(damage);
          System.out.println(Text.colorize(this + " unleashes his magical powers upon "
           + other + " for " + damage + " damage! "+warcry, Text.BOLD, Text.WHITE));
          setMana(getMana() - 5);
    }else{
        System.out.println(Text.colorize("Not enough mana! (Get stronger my guy)", Text.BOLD, Text.WHITE));
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

  public String getSpecialName(){
          return "Mana";
        }

  public int getSpecialMax(){
          return manaMax;
  }
  public int getSpecial(){
          return mana;
  }

}
