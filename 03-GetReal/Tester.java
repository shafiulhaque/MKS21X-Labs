public class Tester{
  public static void main(String[] args) {
    RealNumber t1 = new RealNumber(43);
    RealNumber t2 = new RealNumber(34);
    System.out.println("TEST CASES FOR REAL NUMBER:");
    System.out.println(t1.getValue());
    System.out.println(t1.add(t2));
    System.out.println(t1.multiply(t2));
    System.out.println(t1.subtract(t2));
    System.out.println(t1.divide(t2));
    System.out.println(t1.getValue());
    System.out.println(t1);
    System.out.println("TEST CASES FOR RATIONAL NUMBER:");
    RationalNumber t3 = new RationalNumber(8,6);
    RationalNumber t4 = new RationalNumber(16, 12);
    RationalNumber t5 = new RationalNumber(21, 4);
    System.out.println(t3.getValue());
    System.out.println(t4.getValue());
    System.out.println(t3.getNumerator());
    System.out.println(t4.getNumerator());
    System.out.println(t3.getDenominator());
    System.out.println(t4.getDenominator());
    System.out.println(t3.reciprocal());
    System.out.println(t4.reciprocal());
    System.out.println(t3.equals(t4));
    System.out.println(t3.multiply(t4));
    System.out.println(t3.divide(t4));
    System.out.println(t3.add(t4));
    System.out.println(t3.subtract(t4));
    t3 = new RationalNumber(8,6);
    System.out.println("---------------------");
    System.out.println(t3.getValue());
    System.out.println(t5.getValue());
    System.out.println(t3.getNumerator());
    System.out.println(t5.getNumerator());
    System.out.println(t3.getDenominator());
    System.out.println(t5.getDenominator());
    System.out.println(t3.reciprocal());
    System.out.println(t5.reciprocal());
    System.out.println(t3.equals(t5));
    System.out.println(t3.multiply(t5));
    System.out.println(t3.divide(t5));
    System.out.println(t3.add(t5));
    System.out.println(t3.subtract(t5));
  }
}
