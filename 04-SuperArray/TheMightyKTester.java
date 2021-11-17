import java.util.ArrayList;
public class TheMightyKTester{
  public static boolean DEBUG = false;

  public static void println(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }


  public static boolean compare(SuperArray a, ArrayList<String> b){
    if(a.size() != b.size()){
      return false;
    }
    for(int i = 0; i < a.size(); i++){
      if(!a.get(i).equals(b.get(i))){
        return false;
      }
    }

    return true;
  }




  public static void main(String[]args){
    SuperArray words;
    ArrayList<String>result;

    String TEST_NAME;
    int score = 5;//5 points for compiling!



    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "Create Empty";
    try{
      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }





    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }

      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }


    TEST_NAME = "set return value test";
    boolean matching = true;
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        matching = matching && words.set(i,"").equals(result.set(i,""));
      }

      if( matching ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end by index";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(words.size(),""+d);
        result.add(result.size(),""+d);
      }

      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }






    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add many to end";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }



    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to front";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(0,""+d);
        result.add(0,""+d);
      }
      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add many to front";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(0,""+d);
        result.add(0,""+d);
      }

      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add many to random index (not end)";
    try{
      for(int i = 0; i < 5000; i++){
        int ind = (int)(Math.random()*(result.size()));
        words.add(ind,""+i);
        result.add(ind,""+i);
      }

      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end then remove from front";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      words.remove(0);
      result.remove(0);
      words.remove(0);
      result.remove(0);
      words.remove(0);
      result.remove(0);


      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end then remove from end";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      words.remove(words.size()-1);
      result.remove(result.size()-1);
      words.remove(words.size()-1);
      result.remove(result.size()-1);
      words.remove(words.size()-1);
      result.remove(result.size()-1);


      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }

    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add large amount to end then remove from front";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
        if(i%10 == 0){
          words.remove(0);
          result.remove(0);
        }
      }


      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add large amount to front then remove from end";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
        if(i%10 == 0){
          words.remove(words.size()-1);
          result.remove(result.size()-1);
        }
      }
      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }
    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }




    words = new SuperArray();
    result = new ArrayList<String>();
    TEST_NAME = "add many to random index (not end) remove from random index";
    try{
      for(int i = 0; i < 5000; i++){
        int ind = (int)(Math.random()*(result.size()));
        words.add(ind,""+i);
        result.add(ind,""+i);
        if(i%10==0){
          ind = (int)(Math.random()*(result.size()));
          words.remove(ind);
          result.remove(ind);
        }
      }

      if( compare(words,result) ) {
        score += 5;
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }



    words = new SuperArray();
    TEST_NAME= "indexOf";
    try{
      for(int i = 50; i >= 0; i--){
        words.add(""+i);
        words.add(0,""+i);
      }

      if( words.indexOf("0")==0 && words.indexOf("5")==5){
        score += 3;
      }else{
        println("Failed "+TEST_NAME);      
	println(words.indexOf("0") +" , "+ words.indexOf("5"));

	
      }
    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();

    }


    words = new SuperArray();
    TEST_NAME= "lastindexOf";
    try{
      for(int i = 50; i >= 0; i--){
        words.add(""+i);
        words.add(0,""+i);
      }

      if( words.lastIndexOf("0")==101 && words.lastIndexOf("5")==96){
        score += 2;
      }else{
        println("Failed "+TEST_NAME);
	println(words.lastIndexOf("0") +" , "+ words.lastIndexOf("5"));

      }
    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }





    TEST_NAME = "create with negative size";
    try{
      words=new SuperArray(-50);
    }catch(IllegalArgumentException e){
      score += 5;
    }catch(NegativeArraySizeException e){
      println("Failed "+TEST_NAME+ " NegativeArraySizeException should be IllegalArgumentException");
      score += 2;
    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }



    try{
      words=new SuperArray();
      for(int i = 0; i < 25; i++){
        words.add(""+Math.random());
      }

      TEST_NAME = "get access out of bounds";
      try{
        int index = words.size();
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 1;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }



      TEST_NAME = "set access out of bounds";
      try{
        int index = words.size();
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 1;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }


      TEST_NAME = "remove access out of bounds";
      try{
        int index = words.size();
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }

      try{
        int index = -1;
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }

      try{
        int index = words.size()+10;
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 1;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }



      TEST_NAME = "add out of bounds";
      try{
        int index = words.size()+1;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 2;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
        score += 1;
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException");
          if(DEBUG)e.printStackTrace();
      }

    }catch(RuntimeException e){
        println("Failed creating super array for exception testing");
        if(DEBUG)e.printStackTrace();
    }





    System.out.println("Final Score: "+score/100.0*40.0);
  }
}
