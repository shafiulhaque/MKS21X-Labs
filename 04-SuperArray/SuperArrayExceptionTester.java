public class SuperArrayExceptionTester{
  public static SuperArray init(){
    SuperArray res = new SuperArray(4);
    String[]values = {"one","fish","two","fish","red","fish","blue","fish"};
    for(int i = 0; i < values.length; i++){
      res.add(values[i]);
    }
    return res;
  }

  public static void main(String[] args) {
    /*test ALL method calls that SHOULD throw an exception.*/
    int testNum = 0;
    String testName;
    SuperArray list;

    //Test1: get -1
    testNum++;
    testName = "get out of bounds -1";
    list = init();
    try{
        list.get(-1);
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }

    //Test2: get size
    testNum++;
    testName = "get out of bounds size()";
    list = init();
    try{
        list.get(list.size());
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }

    //Test3: set -1
    testNum++;
    testName = "set out of bounds -1";
    list = init();
    try{
        list.set(-1, "joe");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }

    //Test4: set size()
    testNum++;
    testName = "set out of bounds size()";
    list = init();
    try{
        list.set(list.size(), "JOEMAMA");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }

    //Test5: add(-1,value)
    testNum++;
    testName = "set size() something";
    list = init();
    try{
        list.set(list.size(), "JOEMAMA");
        System.out.println(testNum+". FAIL! No exception thrown "+testName);
    }catch(IndexOutOfBoundsException e){
      System.out.println(testNum+". PASS "+testName);
    }

    //Test6: add(size()+1,value)

    //Test7: constructor(-1 size)
    //BE CAREFUL! Which exception is expected?



  }
}
