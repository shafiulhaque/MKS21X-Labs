import java.util.*;
import java.io.*;

public class dayone21{
  public static int getVals(ArrayList<String> joe){
    int total = 0;
    for (int i = 1; i < joe.size(); i++){
      int j1 = Integer.parseInt(joe.get(i));
      int j2 = Integer.parseInt(joe.get(i-1));
      if (j2 < j1) total++;
    }
    return total;
  }

  public static int getWindow(ArrayList<String> joe){
    int total = 0;
    for (int i = 3; i < joe.size(); i++){
      int j1 = Integer.parseInt(joe.get(i));
      int j2 = Integer.parseInt(joe.get(i-1));
      int j3 = Integer.parseInt(joe.get(i-2));
      int j4 = Integer.parseInt(joe.get(i-3));
      if (j4+j3+j2 < j1+j2+j3) total++;
    }
    return total;
  }


  public static void main (String args[]) throws Exception{
    Scanner joe = new Scanner(new File(args[0]));
    ArrayList<String> joe2 = new ArrayList<String>();
    while (joe.hasNextLine()){
      joe2.add(joe.nextLine());
    }
    System.out.println(getVals(joe2));
    System.out.println(getWindow(joe2));
  }
}
