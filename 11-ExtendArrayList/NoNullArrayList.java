import java.util.*;
import java.io.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  @Override
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("unable to set a null element");
    }
    return super.set(index, element);
    }

  @Override
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("unable to add a null element");
    }
    return super.add(element);
  }

  @Override
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("unable to add a null element");
    }
    super.add(index, element);
  }
}
