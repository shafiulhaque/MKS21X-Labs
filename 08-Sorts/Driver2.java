import java.util.Arrays;
public class Driver2{
  public static void main(String[]artie){

    int[] randish = new int[Integer.parseInt(artie[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*200000-100000);
    }

    long start = System.currentTimeMillis();
    if(artie[1].equals("selection")){
      Sorts.selectionSort(randish);
    }
    if(artie[1].equals("bubble")){
      Sorts.bubbleSort(randish);
    }
    if(artie[1].equals("insertion")){
      Sorts.insertionSort(randish);
    }
    long end = System.currentTimeMillis();
    System.out.println(end-start);
  }
}
