import java.util.*;
public class Tester{
  public static void main(String[] args) {
    ArrayList<String> data1 = new ArrayList<String>(250000);
    for(int i = 0; i < 300000; i++){
      data1.add(""+i);
    }
    System.out.println(data1.size());
    ArrayList<String> data2 = new ArrayList<String>();
    data2.add("");
    data2.add("");
    data2.add("joe");
    data2.add("ok");
    data2.add("now");
    data2.add("");
    data2.add("");
    ArrayList<String> data3 = new ArrayList<String>(2);
    data3.add("sdf");
    data3.add("awe");
    data3.add("jo");
    data3.add("ok");
    data3.add("no");
    data3.add("ok");
    data3.add("ok");
    data3.add("ok");
    data3.add("ok");
    data3.add("ok");
    System.out.println(data2);
    System.out.println(data3);
    //System.out.println(ArrayListPractice.replaceEmpty(data2));
    //System.out.println(ArrayListPractice.makeReversedList(data2));
    System.out.println(ArrayListPractice.mixLists(data2, data3));
  }
}
