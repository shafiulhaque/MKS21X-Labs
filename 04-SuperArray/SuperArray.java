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
    data = new String[initialCapacity];
    size = 0;
  }

  // accessor methods
  public int size(){
    return size;
  }

  private void resize(){
    if (size == data.length){
    String[] data2 = new String[size*2 + 1];
    for(int i = 0; i < size; i++){
      data2[i] = data[i];
    }
    data = data2;
  }
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
    if (index > -1 && index < size){
      return data[index];
    }
    System.out.println("Error: index is out of bounds");
    return null;
  }

  // mutator methods
  public boolean add(String joe){
    resize();
    data[size] = joe;
    size++;
    return true;
  }

  public String set(int index, String element){
    if (index > -1 && index < size){
      String x = data[index];
      data[index] = element;
      return x;
    }
    System.out.println("Error: index is out of bounds");
    return null;
  }

  public void remove(int joe){
    for (int i = joe; i < data.length - 1; i++){
      data[i] = data[i+1];
    }
    size--;
  }

}
