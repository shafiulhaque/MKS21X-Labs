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
}
