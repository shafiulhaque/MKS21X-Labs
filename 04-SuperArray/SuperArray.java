public class SuperArray{
  // fields
  private String[] data;
  private int size;

  // constructors
  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity >= 0){
      data = new String[initialCapacity];
      size = 0;
    } else {
      throw new IllegalArgumentException("initialCapacity: " + initialCapacity + " is negative");
    }
  }

  // accessor methods
  public int size(){
    return size;
  }

  public String toString(){
    String joe = "[";
    for (int i = 0; i < size; i++){
      joe += data[i];
      if (i <= size - 2) joe += ", ";
    }
    return joe + "]";
  }

  public String toStringDebug(){
    String joe = "[";
    for (int i = 0; i < data.length; i++){
      joe += data[i];
      if (i <= data.length - 2) joe += ", ";
    }
    return joe + "]";
  }

  public String get(int index){
    if (index >= 0 && index < size){
      return data[index];
    } else {
      //System.out.println("Error: index is out of bounds for get (RIP)");
      //return null;
      throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds (invalid)");
    }
  }

  // mutator methods
  private void resize(){
    if (size == data.length){
    String[] data2 = new String[size];
    for(int i = 0; i < size; i++){
      data2[i] = data[i];
    }
    data = new String[size*2 + 1];
    for(int j = 0; j < data2.length; j++){
      data[j] = data2[j];
    }
  }
  }

  public boolean add(String joe){
    resize();
    data[size] = joe;
    size++;
    return true;
  }

  public String set(int index, String element){
    if (index >= 0 && index < size){
      String x = data[index];
      data[index] = element;
      return x;
    } else {
      //System.out.println("Error: index is out of bounds for set (RIP)");
      //return null;
      throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds (invalid)");
    }
  }

  // other accessor methods

  public int indexOf(String target){
    for (int i = 0; i < size; i++){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = size - 1; i >= 0; i--){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  // other mutator methods

  public void add(int index, String value){
    resize();
    if (index >= 0 && index <= size){
      String adding = "";
      size++;
      for (int i = index; i < data.length; i++){
        adding = data[i];
        data[i] = value;
        value = adding;
      }
    } else {
      //System.out.println("Error: index is out of bounds for add (RIP)");
      throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds (invalid)");
    }
  }

  public String remove(int index){
    if (index >= 0 && index < size){
      String removed = data[index];
      for (int i = index; i < size - 1; i++){
        data[i] = data[i+1];
      }
      set(size - 1, null);
      size--;
      return removed;
    } else {
      //System.out.println("Error: index is out of bounds for remove (RIP)");
      //return null;
      throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds (invalid)");
    }
  }

  public boolean remove(String target){
    int firstIndex = indexOf(target);
    if (firstIndex > 0){
      remove(firstIndex);
      return true;
    }
    return false;
  }

}
