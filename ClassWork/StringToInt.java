public class StringToInt{
  //return the value of Integer.parseInt(s) but do it yourself!
  //Do not use any built in parse methods.
  public static int stringToInt(String s){
    int stringInt = 0;
    boolean isNeg = false;
    if (s.charAt(0) == '-'){
      s = s.substring(1);
      isNeg = true;
    }
     for (int i = 0; i < s.length(); i++){
       char cr = s.charAt(i);
       stringInt *= 10;
       stringInt += valueOfDigit(cr);
     }
     if (isNeg) stringInt *= -1;
     return stringInt;
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
