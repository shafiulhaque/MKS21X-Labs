public class Tester{
  public static void main(String[] args) {
    RealNumber joe = new RealNumber(43);
    RealNumber joe2 = new RealNumber(34);
    System.out.println(joe.getValue());
    System.out.println(joe.add(joe2));
    System.out.println(joe.multiply(joe2));
    System.out.println(joe.subtract(joe2));
    System.out.println(joe.divide(joe2));
    System.out.println(joe.getValue());
    System.out.println(joe);
  }
}
