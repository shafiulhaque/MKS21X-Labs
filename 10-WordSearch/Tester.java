public class Tester{
  public static void main (String args[]){
    // WordSearch joe = new WordSearch(6, 6);
    // System.out.println("\n" + "FIRST TEST");
    // System.out.println(joe);
    // System.out.println(joe.addWordHorizontal("joe", 4, 3));
    // System.out.println(joe);
    // System.out.println(joe.addWordHorizontal("joe", 3, 4));
    // System.out.println(joe);
    // System.out.println(joe.addWordVertical("joe", 4, 3));
    // System.out.println(joe);
    // System.out.println(joe.addWordVertical("joe", 3, 4));
    // System.out.println(joe);

    // System.out.println("\n" + "NEXT TEST");
    // WordSearch no = new WordSearch(4, 6);
    // System.out.println(no);
    // System.out.println(no.addWordHorizontal("joe", 3, 2));
    // System.out.println(no);
    // System.out.println(no.addWordHorizontal("joe", 2, 3));
    // System.out.println(no);
    // System.out.println(no.addWordVertical("joe", 3, 2));
    // System.out.println(no);
    // System.out.println(no.addWordVertical("joe", 1, 4));
    // System.out.println(no);
    // System.out.println("\n");
    // System.out.println(no.addWordDiagonal("joe", 1, 3));
    // System.out.println(no);

    // System.out.println("\n" + "addWord TEST");
    // WordSearch awt = new WordSearch(10, 8, "JoeMama.txt");
    // System.out.println(awt);
    // // System.out.println(awt.addWord(0, 0, "underthere", 1, 0));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(0, 0, "utopian", 0, 1));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(0, 3, "phonetic", 1, 0));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(2, 0, "dinosaur", 0, 1));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(0, 3, "piano", 1, 1));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(2, 7, "roots", 1, 0));
    // // System.out.println(awt);
    // // System.out.println(awt.addWord(6, 4, "boosadfsdfsm", 1, 1));
    // // System.out.println(awt);
    System.out.println("FINALLY MADE A WORD SEARCH");
    int row = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[1]);
    String txt = args[2];
    if (args.length < 4){
      WordSearch os = new WordSearch(row, col, txt, mode);
      System.out.println(os);
    } else{
      int seed = Integer.parseInt(args[3]);
      WordSearch os = new WordSearch(row, col, txt, mode, seed);
      System.out.println(os);
    }
    //WordSearch s = new WordSearch(20, 10, "Soccer.txt");
    //System.out.println(s);

  }
}
