public class Game2{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    Adventurer c = new Wizard("Generic Name","Aaaaaaaar!",20);
    Adventurer d = new Wizard("Joe","Donuts?",0);
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");
    a.attack(c);
    b.attack(d);
    System.out.println(c+" ("+a.getHP()+"HP)");
    System.out.println(d+" ("+b.getHP()+"HP)");
    a.specialAttack(c);
    b.specialAttack(d);
    System.out.println(c+" ("+a.getHP()+"HP)");
    System.out.println(d+" ("+b.getHP()+"HP)");
    }

}
