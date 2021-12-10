public class JoeTester{
  public static void main (String args[]){
    WordSearch joe = new WordSearch(6, 6);
    System.out.println("\n" + "FIRST TEST");
    System.out.println(joe);
    System.out.println(joe.addWordHorizontal("joe", 4, 3));
    System.out.println(joe);
    System.out.println(joe.addWordHorizontal("joe", 3, 4));
    System.out.println(joe);
    System.out.println(joe.addWordVertical("joe", 4, 3));
    System.out.println(joe);
    System.out.println(joe.addWordVertical("joe", 3, 4));
    System.out.println(joe);

    System.out.println("\n" + "NEXT TEST");
    WordSearch no = new WordSearch(4, 6);
    System.out.println(no);
    System.out.println(no.addWordHorizontal("joe", 3, 2));
    System.out.println(no);
    System.out.println(no.addWordHorizontal("joe", 2, 3));
    System.out.println(no);
    System.out.println(no.addWordVertical("joe", 3, 2));
    System.out.println(no);
    System.out.println(no.addWordVertical("joe", 1, 4));
    System.out.println(no);
    System.out.println("\n");
    System.out.println(no.addWordDiagonal("joe", 1, 3));
    System.out.println(no);

    System.out.println("\n" + "addWord TEST");
    WordSearch awt = new WordSearch(5, 7);
    System.out.println(awt);
    System.out.println(awt.addWord(1, 2, "joe", -1, 1));
    System.out.println(awt);



  }
}
