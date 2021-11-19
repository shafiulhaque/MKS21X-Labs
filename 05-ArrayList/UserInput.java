import java.util.*;
public class UserInput{
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int num = 0;
    Scanner in = new Scanner(System.in);
    while (num >= 0){
      System.out.print("Enter a non negative number. A negative number will end the program:");
      num = Integer.parseInt(in.nextLine());
      numbers.add(num);
        }
    in.close();
    System.out.println("You entered:" + numbers);
    System.out.println("Mean:" + )
    System.out.println("Min value: " + )
    System.out.println("Max value: " + )
  }
}
