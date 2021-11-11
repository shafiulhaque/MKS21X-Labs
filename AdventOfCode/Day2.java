import java.util.*;
import java.io.*;

public class Day2{
  public static String[] getNums(String joe){
    String[] ok = new String[3];
    ok[0] = joe.substring(0, joe.indexOf("x"));
    joe = joe.substring(joe.indexOf("x")+1, joe.length());
    ok[1] = joe.substring(0, joe.indexOf("x"));
    joe = joe.substring(joe.indexOf("x")+1, joe.length());
    ok[2] = joe;
    return ok;
  }

  public static int getVals(String[] joe){
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

public static void main(String[] args) throws Exception {
  Scanner joe = new Scanner(new FileReader ("Day2gift.txt"));
  int total = 0;
  while (joe.hasNextLine()){
    total += getVals(getNums(joe.nextLine()));
    System.out.println(total);
  }
}
}
