public class Tester{
  public static void main(String[] args) {

    System.out.println("Phase One Test Cases");
    SuperArray joe = new SuperArray();
    String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for (int i = 0; i < numbers.length; i++){
      System.out.println(joe.add(numbers[i]));
    }
    System.out.println(joe);
    System.out.println(joe.toStringDebug());
    System.out.println(joe.get(8));
    System.out.println();


    System.out.println("Phase Two Test Cases: Get");
    for(int i = 0; i < joe.size(); i++){
      System.out.println(joe.get(i));
    }
    System.out.println();

    System.out.println("Phase Two Test Cases: Change Values");
    String name = "jo";
    for(int i = 0; i < joe.size(); i++){
      System.out.println(joe.set(i, name));
      name += "e";
    }
    System.out.println(joe);
    System.out.println();

    System.out.println("Phase Two Test Cases: Remove");
    System.out.println(joe);
    for(int i = 0; i < joe.size() - 1; i++){
      joe.set(i, joe.get(i+1));
      System.out.println(joe);
    }
    joe.set(joe.size()-1, "NOPE!");
    System.out.println(joe);
    System.out.println();


    System.out.println("Phase Three Test Cases");
    SuperArray yessir = new SuperArray(4);
    int numOfItems = 5;
    System.out.println("I want to add 5 OKs, which means it has to resize after reaching cap of 4.");
    for(int i = 0; i < numOfItems; i++){
      System.out.println(yessir.add("OK"));
    }
    System.out.println(yessir.toStringDebug());
    System.out.println("It works, as you can see there are 9 spaces (because 4*2 + 1 = 9).");
    System.out.println();

    System.out.println("Let's try adding some more values and changing stuff.");
    numOfItems = 9;
    int numOfItemsLeft = numOfItems - yessir.size();
    for(int i = 0; i < numOfItemsLeft; i++){
      System.out.println(yessir.add("NAH"));
    }
    System.out.println(yessir.toStringDebug());
    System.out.println("This shows you can still add a few more values after you resize.");
    System.out.println();

    System.out.println("Looping over all the values:");
    for(int i = 0; i < yessir.size(); i++){
      System.out.println(yessir.get(i));
    }
    System.out.println(yessir);
    System.out.println();

    System.out.println("Phase Four Test Cases");
    System.out.println(yessir.remove(2));
    System.out.println(yessir.remove(4));
    System.out.println(yessir.remove(6));
    System.out.println(yessir);
    System.out.println(yessir.toStringDebug());
    System.out.println();

    SuperArray joemama2 = new SuperArray(11);
    numOfItems = 10;
    for (int i = 0; i < numOfItems; i++){
      String n = "" + i;
      System.out.println(joemama2.add(n));
    }
    System.out.println(joemama2);
    System.out.println(joemama2.set(7, "1"));
    System.out.println(joemama2);
    System.out.println(joemama2.indexOf("1"));
    System.out.println(joemama2.lastIndexOf("1"));
    System.out.println(joemama2.size());
    joemama2.add(2, "joe");
    System.out.println(joemama2);
    System.out.println(joemama2.remove(4));
    System.out.println(joemama2);
    System.out.println(joemama2.remove("ok"));
    System.out.println(joemama2);
    System.out.println(joemama2.toStringDebug());
    System.out.println(joemama2.remove(0));
    System.out.println(joemama2);
  }
}
