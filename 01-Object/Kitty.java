public class Kitty {
  //Two fields (instance variables):
  private int age;
  private String name;

  //Two constructors:
  public Kitty(){
    name = "Mittens";
    age = 2;
  }
  public Kitty(String startName, int startAge) {
    age = startAge;
    name = startName;
  }

  // Three accessor methods:
  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }
  public String toString(){
    return "The amazing " + name + ".";
  }

  // Two mutator methods
  public void changeName(String newName) {
      name = newName;
  }

  public void makeOlder() {
      age++;
  }

}
