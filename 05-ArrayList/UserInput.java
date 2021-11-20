import java.util.*;
public class UserInput{
  public static void main(String[] args) {
    ArrayList<Double> numbers = new ArrayList<Double>();
    double num = 0;
    Scanner in = new Scanner(System.in);
    while (num >= 0){
      System.out.print("Enter a non negative number. A negative number will end the program:");
      num = Double.parseDouble(in.nextLine());
      numbers.add(num);
    }
    in.close();
    double total = numbers.get(0);
    double min = numbers.get(0);
    double max = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++){
      if (numbers.get(i) < min) min = numbers.get(i);
      if (numbers.get(i) > max) max = numbers.get(i);
      total += numbers.get(i);
    }
    System.out.println("You entered: " + numbers);
    System.out.println("Mean: " + total/numbers.size());
    System.out.println("Min value: " + min);
    System.out.println("Max value: " + max);
  }
}
