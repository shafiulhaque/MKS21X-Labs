public class fact{
  public static int factorial(int joe){
    if (joe > 1){
      return joe*factorial(joe-1);
    } else {
      return 1;
    }
  }

  public static boolean isEven(int n){
    if (n > 2){
      return isEven(n-2);
    } else {
      if (n < 0) return isEven(n+2);
      if (n == 1) return false;
      return true;
    }
  }

  public static void main(String args[]){
    System.out.println(factorial(1));
    System.out.println(factorial(5));
    System.out.println(factorial(10));
    System.out.println(isEven(-232));
  }
}
