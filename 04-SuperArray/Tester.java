public class Tester{
  public static void main(String[] args) {
    SuperArray joe = new SuperArray();
    joe.add("one");
    joe.add("two");
    joe.add("three");
    joe.add("four");
    joe.add("five");
    System.out.println(joe);
    joe.remove(2);
    System.out.println(joe);
  }
}
