import java.util.*;
import java.io.*;

public class Wrapping{
  public static String[] getNums(String joe){
    String[] ok = joe.split("x");
    return ok;
  }

  public static int getWrap(String[] joe){
    int a = Integer.parseInt(joe[0]);
    int b = Integer.parseInt(joe[1]);
    int c = Integer.parseInt(joe[2]);
    int joe1 = a*b;
    int joe2 = a*c;
    int joe3 = c*b;
    int smol = 0;
    if (joe1 < joe2 && joe1 < joe3){
      smol = joe1;
    } else if (joe2 < joe3){
      smol = joe2;
    } else {
      smol = joe3;
    }
    int wrap = 2*a*b + 2*b*c + 2*c*a + smol;
    return wrap;
  }

  public static int getRib(String[] joe){
    int a = Integer.parseInt(joe[0]);
    int b = Integer.parseInt(joe[1]);
    int c = Integer.parseInt(joe[2]);
    int smallOne, smallTwo;
    if (a > b && a > c){
      smallOne = b;
      smallTwo = c;
    } else if (b > c){
      smallOne = c;
      smallTwo = a;
    } else {
      smallOne = a;
      smallTwo = b;
    }
    int rib = a*b*c + 2*smallOne + 2*smallTwo;
    return rib;
  }

public static void main(String[] args){
  try {
    String file = args[0];
    int number = Integer.parseInt(args[1]);
    File theFile = new File(file);
    Scanner input = new Scanner(theFile);
    int totalWrapping = 0;
    int totalRibbon = 0;
    while (input.hasNextLine()){
      String[] ok = getNums(input.nextLine());
      totalWrapping += getWrap(ok);
      totalRibbon += getRib(ok);
    }
    if (number == 1) System.out.println(totalWrapping);
    if (number == 2) System.out.println(totalRibbon);
    input.close();
  } catch (FileNotFoundException e) {
    System.out.println("Exception: Cannot find file (RIP)");
    e.printStackTrace();
  }
}
}
