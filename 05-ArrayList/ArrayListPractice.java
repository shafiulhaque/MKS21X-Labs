import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    //return an new ArrayList that has all of the values of the original ArrayList except
    //that all empty strings are replaced with the word "Empty".
    for (int i = 0; i < data.size(); i++){
      if (data.get(i).equals("")){
        data.set(i, "Empty");
      }
    }
    return data;
}
  public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
  ArrayList<String> newData = new ArrayList<String>();
  for (int i = data.size()-1; i >= 0; i--){
    newData.add(data.get(i));
  }
  return newData;
}
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
  int total, dec, lastTotal;
  ArrayList<String> newData = new ArrayList<String>();
  if (a.size()>b.size()){
    total = b.size();
    lastTotal = a.size();
    dec = a.size() - b.size();
  } else {
    total = a.size();
    lastTotal = b.size();
    dec = b.size() - a.size();
  }
  for (int i = 0; i < total; i++){
    newData.add(a.get(i));
    newData.add(b.get(i));
  }

  for (int i = dec; i < lastTotal; i++){
    newData.add(b.get(i));
  }
  return newData;
}
  public static void main(String[] args) {
    ArrayList<String> data1 = new ArrayList<String>(250000);
    for(int i = 0; i < 300000; i++){
      data1.add(""+i);
    }
    System.out.println(data1.size());
  }
}
