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
    try{
      System.out.println("Index Out Of Bounds Won't Work: " + joe.get(-5));
    }catch(IndexOutOfBoundsException e){
      System.out.println("Index Out Of Bounds Won't Work");
    }
    System.out.println();

    System.out.println("Phase Two Test Cases: Change Values");
    String name = "jo";
    for(int i = 0; i < joe.size(); i++){
      System.out.println(joe.set(i, name));
      name += "e";
    }
    try{
      System.out.println("Index Out Of Bounds Won't Work: " + joe.set(23423, "joemama"));
    }catch(IndexOutOfBoundsException e){
      System.out.println("Index Out Of Bounds Won't Work");
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

    System.out.println("Phase Four Part Two Test Cases");
    SuperArray joemama2 = new SuperArray(10);
    String[] mrk = {"Mr", "K", "Cannot", "Beat", "Me", "At", "A", "Typing", "Race"};
    for (int i = 0; i < mrk.length; i++){
      System.out.println(joemama2.add(mrk[i]));
    }

    System.out.println(joemama2);
    System.out.println("Replacing " + joemama2.set(7, "Beat") + " with Beat");
    System.out.println(joemama2);
    System.out.println("Where is the first one (Beat)?: Index " + joemama2.indexOf("Beat"));
    System.out.println("Where is the last one (Beat)?: Index " + joemama2.lastIndexOf("Beat"));
    System.out.println("Size: " + joemama2.size());
    joemama2.add(3, "Even");
    System.out.println(joemama2.toStringDebug());
    System.out.println(joemama2.remove(8));
    System.out.println(joemama2);
    System.out.println("Trying to remove a string not in it: " + joemama2.remove("ok"));
    System.out.println(joemama2);
    System.out.println("Removing string at index: " + joemama2.remove(0));
    System.out.println(joemama2);
    System.out.println(joemama2.toStringDebug());
  }
}
