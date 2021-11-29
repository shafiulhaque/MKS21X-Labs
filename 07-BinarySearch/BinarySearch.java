import java.util.*;

public class BinarySearch{
  public static int binarySearch(int[]data, int target){
    int min = 0;
    int max = data.length-1;
    int index = (min+max)/2;
    int joe = data[index];
    while (target != joe){
      if (target > joe){
        min = index + 1;
      } else {
        max = index - 1;
      }
      index = (min+max)/2;
      joe = data[index];
    }
    return index;
  }
  public static void main (String args[]){
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1
    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6
  }

}
