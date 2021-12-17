import java.util.*;
import java.io.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int whereToPlace(T value){
      /*return the index that the value should be placed
      when inserting into the OrderedArrayList .*/
      return 0;
    }
}
