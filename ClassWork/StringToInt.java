public class StringToInt{
  public static int stringToInt(String s){
     //return the value of Integer.parseInt(s) but do it yourself!
     //Do not use any built in parse methods.
     return 0;
   }
   public static int valueOfDigit(char c){
     return c - '0';
   }
   public static void main(String args[]){
     System.out.println(stringToInt("23232"));
     System.out.println(stringToInt("111"));
     System.out.println(stringToInt("31415"));
     System.out.println(stringToInt("28"));
     System.out.println(stringToInt("-99"));
     System.out.println(stringToInt("-279"));
     System.out.println(stringToInt("0"));
     System.out.println(stringToInt("-961"));
   }
}
