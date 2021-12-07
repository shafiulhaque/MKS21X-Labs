import java.util.*;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length - 1; i++){
      for (int j = 0; j < data.length - 1 - i; j++){
        if (data[j] > data[j+1]){
          int joe = data[j];
          int joe2 = data[j+1];
          data[j] = joe2;
          data[j+1] = joe;
        }
      }
    }
  }

  /*Selection sort
 */
 public static void selectionSort(int[] ary) {
   if (ary.length > 0){
     int min; //= ary[0];
     int minindex; //= 0;
     int swap;
   for (int i = 0; i < ary.length; i++){
     min = ary[i];
     minindex = i;
     for (int j = i; j < ary.length; j++){
       if (ary[j] < min){
         min = ary[j];
         minindex = j;
       }
     }
     swap = ary[i];
     ary[i] = min;
     ary[minindex] = swap;
   }
 }
 }

 public static void insertionSort(int[]data){
   if (data.length > 1){
     for (int i = 1; i < data.length; i++){
       int number = data[i];
       int changeIndex = i;
       if (data[i] < data[i - 1]){
         while (changeIndex > 0 && number < data[changeIndex-1]){
             data[changeIndex] = data[changeIndex - 1];
             changeIndex--;
            data[changeIndex] = number;
         }
       }
     }
   }
 }


  public static int[] makeRandom(int length, int min, int max){
    int[] arr = new int[length];
    for (int i = 0; i < length; i++){
//      arr[i] = Math.random()*(max-min+1) + min;
    }
    return arr;
  }

  public static boolean compareArray(int[] data){
    int[] data2 = new int[data.length];
    int[] data1 = new int[data.length];
    for (int i = 0; i < data.length; i++){
      data2[i] = data[i];
      data1[i] = data[i];
    }
    bubbleSort(data2);
    Arrays.sort(data1);
    for (int i = 0; i < data.length; i++){
      if (data1[i] != data2[i]){
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args){
    System.out.println("TEST CASES PART ONE: Basic Tests");
    System.out.println();

    System.out.println("Regular Case: int[]{3, 5, 2, 1};");
    int[] result = new int[]{3, 5, 2, 1};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Regular Case: int[]{2, 0, 4, 8};");
    result = new int[]{2, 0, 4, 8};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Regular Case: int[]{5, 8, 423, 1, -6, -23, 5};");
    result = new int[]{5, 8, 423, 1, -6, -23, 5};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Regular Case: int[]{3, 1, 4, -1, 5, -6, 2, -5, 432, -2132, 43232};");
    result = new int[]{3, 1, 4, -1, 5, -6, 2, -5, 432, -2132, 43232};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Regular Case: int[]{-2, -4, 12, 342, 2, -2, 0, 20, -62, 4, 7, 9, 29, -78};");
    result = new int[]{-2, -4, 12, 342, 2, -2, 0, 20, -62, 4, 7, 9, 29, -78};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Special Case: One Number");
    result = new int[]{0};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Special Case: Blank Array");
    result = new int[]{};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Special Case: All Same Value");
    result = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("Special Case: Reverse Sorted");
    result = new int[]{10, 7, 4, 2, 1, -3, -6, -12, -19};
    System.out.println(compareArray(result));
    selectionSort(result);
    System.out.println(Arrays.toString(result));
    bubbleSort(result);
    System.out.println(Arrays.toString(result));
    System.out.println();

    System.out.println("TEST CASES PART TWO: RANDOMIZED");
    System.out.println();

    System.out.println("Random Test Case");
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++){
      int joemama = (int)(Math.random()*(27+3+1))+3;
      arr[i] = joemama;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(compareArray(arr));
    System.out.println();
    System.out.println("Now Sorted:");
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

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
