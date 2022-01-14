public class Warrior extends Adventurer {
    private int rage;
    private String warcry;
    private int rageMax;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
    }

    public Warrior(String name, String warcry, int rage){
      super(name,30+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      setmaxHP(100);
      this.rageMax = 20;
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getRage() + 1);
  	    return Text.colorize(this +
            " attacked " + other + " for " +
            damage + " damage!",Text.BOLD, Text.WHITE);
    }

    public String specialAttack(Damageable other){
	     if(getRage() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            setRage(getRage() - 10);
            return Text.colorize(this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+warcry,Text.BOLD, Text.WHITE);
	    }else{
			   // System.out.println("Not enough rage! ");
          return attack(other);
	    }
    }

    //get methods

    public int getRage(){
	     return rage;
    }

    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }

    public String getSpecialName(){
            return "Rage";
          }

    public int getSpecialMax(){
            return rageMax;
    }
    public int getSpecial(){
            return rage;
    }


}
