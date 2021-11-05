public class SuperArray{
  // fields
  private String[] data;
  private int size;

  // constructors
  public SuperArray(){
    data = new String[10];
    size = 0;
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
    return data[index];
  }

  public String set(int index, String element){
    String x = data[index];
    if (x == null){
      System.out.println("Error: index is null");
    } else {
      data[index] = element;
    }
    return x;
  }

  // mutator methods
  public boolean add(String joe){
    data[size] = joe;
    size++;
    return true;
  }
  public void remove(int joe){
    for (int i = joe; i < data.length - 1; i++){
      data[i] = data[i+1];
    }
    size--;
  }

}
