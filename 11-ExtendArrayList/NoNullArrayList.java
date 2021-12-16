import java.util.*;
import java.io.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(T startingCapacity){

  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("unable to set a null");
    }
    super.set(index, element);
    }

  public T add(T element){
    if (element == null){
      throw new IllegalArgumentException("unable to add a null");
    }
    super.add(element);
  }
  
  public T add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("unable to add a null");
    }
    super.add(index, element);
  }
}
