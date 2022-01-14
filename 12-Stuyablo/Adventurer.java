import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;
    private int maxHP;

    //Abstract methods are meant to be implemented in child classes.
    public abstract void attack(Damageable other);
    public abstract void specialAttack(Damageable other);
    public abstract String getSpecialName();
    public abstract int getSpecial();
    public abstract int getSpecialMax();

    public Adventurer(){
  	   this("Lester");
    }

    public Adventurer(String name){
  	   this(name, 10);
    }

    public Adventurer(String name, int hp){
       this.name = name;
       this.HP = hp;
    }

    //toString method
    public String toString(){
    	return this.getName();
    }

    //Get Methods
    public String getName(){
    	return name;
    }

    public int getHP(){
	     return HP;
    }

    public int getmaxHP(){
            return maxHP;
          }

    public void setmaxHP(int newMax){
      maxHP = newMax;
    }

    public void applyDamage(int amount){
      this.HP -= amount;
    }

    //Set Methods
    public void setHP(int health){
	     this.HP = health;
    }

    public void setName(String s){
	     this.name = s;
    }


}
