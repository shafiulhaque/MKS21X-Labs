public class Tester{
  public static void main(String[] args) {
    System.out.println("Phase One Test Cases");
    SuperArray joe = new SuperArray();
    System.out.println(joe.add("one"));
    System.out.println(joe.add("two"));
    System.out.println(joe.add("three"));
    System.out.println(joe.add("four"));
    System.out.println(joe.add("five"));
    System.out.println(joe.add("six"));
    System.out.println(joe.add("seven"));
    System.out.println(joe.add("eight"));
    System.out.println(joe.add("nine"));
    System.out.println(joe.add("ten"));
    System.out.println(joe);
    System.out.println(joe.toStringDebug());
    System.out.println(joe.get(8));

    System.out.println("Phase Two Test Cases: Get");
    for(int i = 0; i < 10; i++){
      System.out.println(joe.get(i));
    }

    System.out.println("Phase Two Test Cases: Remove");
    for(int i = 1; i < 9; i++){
      joe.set(i, joe.get(i+1));
      joe.set(i-1, "NOPE!");
      System.out.println(joe);
    }

  }
}
