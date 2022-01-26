public class fact{
  public static int factorial(int joe){
    if (joe > 1){
      return joe*factorial(joe-1);
    } else {
      return 1;
    }
  }
  public static void main(String args[]){
    System.out.println(factorial(1));
    System.out.println(factorial(5));
    System.out.println(factorial(10));
  }
}
