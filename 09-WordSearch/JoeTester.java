public class JoeTester{
  public static void main (String args[]){
    WordSearch joe = new WordSearch(6, 6);
    System.out.println(joe);
    System.out.println(joe.addWordHorizontal("joe", 4, 4));
    System.out.println(joe.addWordVertical("joe", 3, 4));
  }
}
