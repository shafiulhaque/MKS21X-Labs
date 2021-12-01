import java.util.*;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length-1; i++){
      for (int j = 0; j < data.length - 1; j++){
        if (data[j] > data[j+1]){
          int joe = data[j];
          int joe2 = data[j+1];
          data[j] = joe2;
          data[j+1] = joe;
        }
      }
    }
  }

  public static void main (String[] args){
    System.out.println("TEST CASES PART TWO");
    int[] result = new int[]{3, 5, 2, 1};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{2, 0, 4, 8};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{5, 8, 423, 1, -6, -23, 5};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{3, 1, 4, -1, 5, -6, 2, -5, 432, -2132, 43232};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{0};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));

    System.out.println("TEST CASES PART TWO");
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++){
      int joemama = (int)(Math.random()*(27+3+1))+3;
      arr[i] = joemama;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Let's fix this:");
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));



  }
}
