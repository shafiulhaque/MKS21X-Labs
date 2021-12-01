public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    
  }

  public static void main (String[] args){
    int[] result = new int[]{3, 5, 2, 1};
    bubbleSort(result);
    System.out.println(result);
    result = new int[]{2, 0, 4, 8};
    bubbleSort(result);
    System.out.println(result);
    result = new int[]{5, 8, 423, 1, -6, -23, 5};
    bubbleSort(result);
    System.out.println(result);
  }
}
