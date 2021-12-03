import java.util.*;
import java.io.*;

public class Non{
  public static int niceString(String joe){
    if (vowelCheck(joe) && twiceRep(joe) && noString(joe)) return 1;
    return 0;
  }

  public static int newNice(String joe){
    if (pairTwo(joe) && oneRepeat(joe)) return 1;
    return 0;
  }

  public static boolean vowelCheck(String joe){
    int counter = 0;
    for (int i = 0; i < joe.length(); i++){
      if (joe.charAt(i) == 'a' || joe.charAt(i) == 'e' || joe.charAt(i) == 'i' || joe.charAt(i) == 'o' || joe.charAt(i) == 'u'){
        counter++;
      }
    }
    return (counter >= 3);
  }

  public static boolean twiceRep(String joe){
    for (int i = 0; i < joe.length()-1; i++){
      if (joe.charAt(i) == joe.charAt(i+1)){
        return true;
      }
    }
    return false;
  }

  public static boolean noString(String joe){
    for (int i = 0; i < joe.length()-1; i++){
      if (joe.substring(i, i+2).equals("ab") || joe.substring(i, i+2).equals("cd") || joe.substring(i, i+2).equals("pq") || joe.substring(i, i+2).equals("xy")){
        return false;
      }
    }
    return true;
  }

  public static boolean pairTwo(String joe){
    for (int i = 0; i < joe.length()-1; i++){
      String check = joe.substring(i, i+2);
      String other = joe.substring(i+2);
      if (other.indexOf(check) >= 0){
        return true;
      }
    }
    return false;
  }

  public static boolean oneRepeat(String joe){
    for (int i = 1; i < joe.length()-1; i++){
      if (joe.charAt(i-1) == joe.charAt(i+1)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    try {
      String file = args[0];
      int number = Integer.parseInt(args[1]);
      File theFile = new File(file);
      Scanner input = new Scanner(theFile);
      int totalNice = 0;
      int totalNewNice = 0;
      while (input.hasNextLine()){
        String ok = input.nextLine();
        totalNice += niceString(ok);
        totalNewNice += newNice(ok);
        System.out.println(ok);
        System.out.println(totalNewNice);
      }
      if (number == 1) System.out.println(totalNice);
      if (number == 2) System.out.println(totalNewNice);
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("Exception: Cannot find file (RIP)");
      e.printStackTrace();
    }
  }
}
