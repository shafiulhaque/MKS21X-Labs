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
    result = new int[]{-2, -4, 12, 342, 2, -2, 0, 20, -62, 4, 7, 9, 29, -78};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{0};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    result = new int[]{};
    bubbleSort(result);
    System.out.println(Arrays.toString(result));

    System.out.println("TEST CASES PART TWO");
    System.out.println("Second Case");
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++){
      int joemama = (int)(Math.random()*(27+3+1))+3;
      arr[i] = joemama;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Let's fix this:");
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("Second Case");
    int[] arr2 = new int[25];
    for (int i = 0; i < 25; i++){
      int joemama = (int)(Math.random()*(30-3+1))+3;
      arr2[i] = joemama;
    }
    System.out.println(Arrays.toString(arr2));
    System.out.println("Let's fix this:");
    bubbleSort(arr2);
    System.out.println(Arrays.toString(arr2));



  }
}
