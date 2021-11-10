public class SuperArrayTester{
  public static void main(String[] args) {

    int testNum = 1;
    String testName = "Empty List";
    /**************************************************
     *TEST CASE 1
     */
    try{
      /*Place test code here*/
      SuperArray list1 = new SuperArray();
      if(list1.toString().equals("[]") && list1.size()==0){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }


    /**************************************************
     *TEST CASE 2
     */
    testNum++;
    testName="Add a few values";
    try{
      /*Place test code here*/
      SuperArray list2 = new SuperArray(4);
      String[]values = {"one","fish","two","fish","red","fish","blue","fish"};
      for(int i = 0; i < values.length; i++){
        list2.add(values[i]);
      }

      boolean result = true;
      for(int i = 0; i < values.length; i++){
        if( ! list2.get(i).equals(values[i])){
          result = false;
          System.out.println(list2.get(i)+"!="+values[i]);
        }
      }

      if( !list2.toString().equals("[one, fish, two, fish, red, fish, blue, fish]")){
        System.out.println(list2.toString()+ "!= [one, fish, two, fish, red, fish, blue, fish]");
        result=false;
      }

      if(values.length != list2.size()){
        result=false;
        System.out.println("Size difference"+list2.size());
      }

      if(result){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }

    /**************************************************
     *TEST CASE 3
     */
    testNum++;
    testName="Add MANY values";
    try{
      /*Place test code here*/
      boolean result = true;
      SuperArray list2 = new SuperArray(4);
      String[]values = new String[2000];
      for(int i = 0; i < values.length; i++){
        values[i] = "0x"+i;
        list2.add(values[i]);
      }


      for(int i = 0; i < values.length; i++){
        if( ! list2.get(i).equals(values[i])){
          result = false;
          System.out.println(list2.get(i)+"!="+values[i]);
        }
      }

      if(values.length != list2.size()){
        result=false;
        System.out.println("Size difference"+list2.size());
      }

      if(result){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }


    /**************************************************
     *TEST CASE 4
     */
    testNum++;
    testName="Add values to front and middle, with resizing";
    try{
      /*Place test code here*/
      boolean result = true;
      SuperArray list2 = new SuperArray(2);
      list2.add("two");
      list2.add("fish");
      list2.add(0,"one");
      list2.add(1,"fish");
      list2.add(4,"fish");
      list2.add(4,"red");
      list2.add(5,"fish");
      list2.add(6,"blue");


      if( !list2.toString().equals("[one, fish, two, fish, red, fish, blue, fish]")){
        System.out.println(list2.toString()+ "!= [one, fish, two, fish, red, fish, blue, fish]");
        result=false;
      }
      if(list2.size() != 8){
        result=false;
        System.out.println("Size difference"+list2.size());
      }

      if(result){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }

    /**************************************************
     *TEST CASE 5
     */
    testNum++;
    testName="Add with resizing. Remove values to front end and middle.";
    try{
      /*Place test code here*/
      boolean result = true;
      SuperArray list2 = new SuperArray(2);
      String[]values = {"one","fish","two","fish","red","fish","blue","fish","one","fish","two","fish","red","fish","blue","fish","this","gets","old","please","make","it","staaaahp!","one","fish","two","fish","red","fish","blue","fish","one","one","one","eleven"};
      for(int i = 0; i < values.length; i++){
        list2.add(values[i]);
      }

      String ans;

      ans = list2.remove(0);
      if(!ans.equals("one")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }
      ans = list2.remove(1);
      if(!ans.equals("two")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }
      ans = list2.remove(0);
      if(!ans.equals("fish")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }
      ans = list2.remove(0);
      if(!ans.equals("fish")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }

      ans = list2.remove(list2.size()-1);
      if(!ans.equals("eleven")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }
      ans = list2.remove(list2.size()-1);
      if(!ans.equals("one")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }
      ans = list2.remove(list2.size()-3);
      if(!ans.equals("fish")){
        result=false;
        System.out.println("remove(0) got: "+ans);
      }

      if(list2.size() != 28){
        result=false;
        System.out.println("Size difference"+list2.size());
      }

      if(result){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }

    /**************************************************
     *TEST CASE 6
     */
    testNum++;
    testName="Test get/set";
    try{
      /*Place test code here*/
      boolean result = true;
      SuperArray list2 = new SuperArray(20);
      String[]values = {"one","fish","two","fish","red","fish","blue","fish"};
      for(int i = 0; i < values.length; i++){
        list2.add(values[i]);
      }

      //set using fixed values
      list2.set(0,"ONE");
      list2.set(2,"TWO");
      list2.set(4,"RED");
      list2.set(list2.size()-1,"FISH");
      if( !list2.toString().equals("[ONE, fish, TWO, fish, RED, fish, blue, FISH]")){
        System.out.println(list2.toString()+ "!= [ONE, fish, TWO, fish, RED, fish, blue, FISH]");
        result=false;
      }

      //set using get values
      list2.set(0,list2.get(1));
      list2.set(2,list2.get(4));

      if( !list2.toString().equals("[fish, fish, RED, fish, RED, fish, blue, FISH]")){
        System.out.println(list2.toString()+ "!= [ONE, fish, TWO, fish, RED, fish, blue, FISH]");
        result=false;
      }

      if(list2.size() != 8){
        result=false;
        System.out.println("Size difference"+list2.size());
      }

      if(result){
        System.out.println(testNum+". PASS "+testName);
      }else{
        System.out.println(testNum+". FAIL "+testName);
      }
    }catch(Exception e){
      System.out.println(testNum+". Exception "+testName);
      e.printStackTrace();
    }


  }
}
