import java.util.*;
import java.io.*;

public class daytwo21{
  public static int getVals(ArrayList<String> joe, ArrayList<String> joe1){
    int totalD = 0;
    int totalHP = 0;
    for (int i = 0; i < joe.size(); i++){
      if (joe.get(i).equals("forward")){
        totalHP += Integer.parseInt(joe1.get(i));
      }
      if (joe.get(i).equals("down")){
        totalD += Integer.parseInt(joe1.get(i));
      }
      if (joe.get(i).equals("up")){
        totalD -= Integer.parseInt(joe1.get(i));
      }
    }
    return totalD*totalHP;
  }

  public static int getVals2(ArrayList<String> joe, ArrayList<String> joe1){
    int totalD = 0;
    int totalHP = 0;
    int aim = 0;
    for (int i = 0; i < joe.size(); i++){
      if (joe.get(i).equals("forward")){
        totalHP += Integer.parseInt(joe1.get(i));
        totalD += aim*Integer.parseInt(joe1.get(i));
      }
      if (joe.get(i).equals("down")){
        aim += Integer.parseInt(joe1.get(i));
      }
      if (joe.get(i).equals("up")){
        aim -= Integer.parseInt(joe1.get(i));
      }
    }
    return totalD*totalHP;
  }

  public static void main (String args[]) throws Exception{
    Scanner joe = new Scanner(new File(args[0]));
    ArrayList<String> joe2 = new ArrayList<String>();
    ArrayList<String> joe3 = new ArrayList<String>();
    while (joe.hasNextLine()){
      String[] bob = joe.nextLine().split(" ");
      joe2.add(bob[0]);
      joe3.add(bob[1]);
    }
    System.out.println(getVals(joe2, joe3));
    System.out.println(getVals2(joe2, joe3));
    // System.out.println(joe2);
    // System.out.println(joe3);
  }
}
