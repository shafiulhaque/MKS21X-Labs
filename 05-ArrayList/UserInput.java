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
    int total = numbers.get(0);
    int min = numbers.get(0);
    int max = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++){
      if (numbers.get(i) < min) min = numbers.get(i);
      if (numbers.get(i) > max) max = numbers.get(i);
      total += numbers.get(i);
    }
    System.out.println("You entered: " + numbers);
    System.out.println("Mean: " + (double)total/numbers.size());
    System.out.println("Min value: " + min);
    System.out.println("Max value: " + max);
  }
}
