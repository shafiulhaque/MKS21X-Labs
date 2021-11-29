import java.util.*;

public class BinarySearch{
  public static int binarySearch(int[]data, int target){
    if (data.length < 1){
      return -1;
    }
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
      if (min > max){
        return -1;
      }
      index = (min+max)/2;
      joe = data[index];
    }
    return index;
  }
  public static void main (String args[]){
    int result;
    System.out.println("TEST CASES PART ONE");
    result = binarySearch(new int[]{0, 0, 0, 0, 0, 0, 0}, 0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0, 0, 0, 0, 0, 0, 0}, 1);
    System.out.println(result);//should be -1
    result = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 0);
    System.out.println(result);//should be 0
    result = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 6);
    System.out.println(result);//should be 6
    result = binarySearch(new int[]{32}, 32);
    System.out.println(result);//should be 0
    result = binarySearch(new int[]{}, 1);
    System.out.println(result);//should be -1
    result = binarySearch(new int[]{2, 4, 6, 9, 10, 11, 12, 13}, 11);
    System.out.println(result);//should be 5
    result = binarySearch(new int[]{1, 3, 5, 6, 7}, 3);
    System.out.println(result);//should be 1
    System.out.println("\n");

    System.out.println("TEST CASES PART TWO");
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++){
      int joemama = (int)(Math.random()*(20-2+1))+2;
      arr[i] = joemama;
    }
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    result = binarySearch(arr, 10);
    System.out.println(result);//result varies depending on the numbers
  }

}
