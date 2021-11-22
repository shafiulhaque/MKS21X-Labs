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
  public static void main(String[] args) {
    try {
      File theFile = new File("ReadFile.txt");
      Scanner input = new Scanner(theFile);
      int total = 0;
      while (input.hasNextInt()){
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        total += partOne(x, y, z);
      }
    System.out.println(total);
    input.close();
  } catch (FileNotFoundException e) {
  }
}
}
