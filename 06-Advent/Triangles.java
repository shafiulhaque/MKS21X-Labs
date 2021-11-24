import java.util.*;
import java.io.*;

public class Triangles{
  public static int partOne(int a, int b, int c){
    int max, other;
    if (a > b && a > c){
      max = a;
      other = b+c;
    } else if (b > c){
      max = b;
      other = a+c;
    } else {
      max = c;
      other = a+b;
    }
    if (max >= other){
      return 0;
    } else {
      return 1;
    }
  }
  public static int partTwo(int a, int b, int c, int d, int e, int f, int g, int h, int i){
    int total = 0;
    total += partOne(a, d, g);
    total += partOne(b, e, h);
    total += partOne(c, f, i);
    return total;
  }
  public static void main(String[] args) {
    try {
      String file = args[0];
      int number = Integer.parseInt(args[1]);
      File theFile = new File(file);
      Scanner input = new Scanner(theFile);
      int partOneTotal = 0;
      int partTwoTotal = 0;
      while (input.hasNextInt()){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();
        partOneTotal += partOne(a, b, c);
        partOneTotal += partOne(d, e, f);
        partOneTotal += partOne(g, h, i);
        partTwoTotal += partTwo(a, b, c, d, e, f, g, h, i);
      }
    if (number == 1) System.out.println("PART ONE ANSWER: " + partOneTotal);
    if (number == 2) System.out.println("PART TWO ANSWER: " + partTwoTotal);
    input.close();
  } catch (FileNotFoundException e) {
    System.out.println("Exception: Cannot find file (RIP)");
    e.printStackTrace();
  }
}
}
