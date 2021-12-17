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
      int index = super.size();
      for (int i = 0; i < super.size(); i++){
        if (value.compareTo(super.get(i)) < 0){
          index = i;
          break;
        }
      }
      return index;
  }

  public boolean add(T value){
    int index = whereToPlace(value);
    super.add(index, value);
    return true;
  }

  public void add(int index, T value){
    super.add(value);
  }

  public T set(int index, T value){
    T element = super.remove(index);
    add(value);
    return element;
  }

}
