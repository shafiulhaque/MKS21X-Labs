import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception

/*Lab9: Word Search generator
*/

public class WordSearch{
// INSTANCE VARIABLES
    private char[][]data;
    //the random seed used to produce this WordSearch
    private int seed;
    //a random Object to unify your random calls
    private Random randgen;
    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String> wordsAdded;


// CONSTRUCTORS

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows, int cols, String fileName, int mode){
      this.wordsAdded = new ArrayList<String>();
      this.randgen = new Random();
      this.seed = randgen.nextInt();
      this.randgen = new Random(seed);
      this.data = new char[rows][cols];
      clear();
      addAllWords(fileName);
      if (mode == 0){
        jumbleUp();
      }
    }

    /*New Constructors:  Both will read in the word text file, then run addAllWords().
     *Do not fill in random letters after.*/
    public WordSearch(int rows, int cols, String fileName, int mode, int seed){
      this.wordsAdded = new ArrayList<String>();
      this.seed = seed;
      this.randgen = new Random(seed);
      this.data = new char[rows][cols];
      clear();
      addAllWords(fileName);
      if (mode == 0){
        jumbleUp();
      }
    }


// ALL THE ADD WORD METHODS

    /**Attempts to add a given word to the specified position of the WordGrid.
    *The word is added in the direction rowIncrement,colIncrement
    *Words must have a corresponding letter to match any letters that it overlaps.
    *
    *@param word is any text to be added to the word grid.
    *@param row is the vertical locaiton of where you want the word to start.
    *@param col is the horizontal location of where you want the word to start.
    *@param rowInc is -1,0, or 1 and represents the displacement of each letter in the row direction
    *@param colInc is -1,0, or 1 and represents the displacement of each letter in the col direction
    *@return true when: the word is added successfully.
    *        false (and do not change the board at all) when any of the following happen:
    *        a) rowInc and colInc are both 0,
    *        b) the word doesn't fit,
    *        c) there are overlapping letters that do not match
    */
      //precondition word grids are rectangular
      private boolean inBounds(int r, int c){
        return r >= 0 && r < data.length && c >= 0 && c < data[0].length;
      }
      public boolean addWord(String word,int row, int col, int dr, int dc){
        //make sure there is some non 0 vector for direction
        if(dr == 0 && dc == 0){
          return false;
        }
        //check endpoints of word
        if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
          return false;
        }
        //check for conflicting letters
        for(int i = 0; i < word.length(); i++){
          char c = data[row + i * dr][col + i * dc];
          if(c != '_' && c != word.charAt(i)){
            return false;
          }
        }
        //change
        for(int i = 0; i < word.length(); i++){
          data[row + i * dr][col + i * dc] = word.charAt(i);
        }
        wordsAdded.add(word);
        return true;
      }

    /*Attempt to add all of the words from the file of words list using the algorithm described above
     *Suggestion: read your file into an ArrayList of Strings. */
    public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }

    private void addAllWords(String fileName) {
      ArrayList<String> wordsToBeAdded = loadWordsFromFile(fileName);
       // System.out.println(wordsToBeAdded);
       int len = wordsToBeAdded.size();
       for (int i = 0; i < len; i++){
         int tries = 0;
         int[] dir = {-1, 0, 1};
         int row, col, rowInc, colInc;
         boolean addedWord = false;
         String str = wordsToBeAdded.remove(randgen.nextInt(wordsToBeAdded.size()));
         while (tries < 100 && !addedWord){
           // System.out.println(joe);
           rowInc = dir[randgen.nextInt(dir.length)];
           colInc = dir[randgen.nextInt(dir.length)];
           row = randgen.nextInt(data.length);
           col = randgen.nextInt(data[0].length);
           if (addWord(str, row, col, rowInc, colInc)){
             addedWord = true;
           }
           tries++;
         }
       }
    }

    private void jumbleUp(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[0].length; j++){
          if (data[i][j] == '_'){
            data[i][j] = (char)(randgen.nextInt(26) + 'A');
          }
        }
      }
    }

// OTHER IMPORTANT METHODS

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[0].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String str = "";
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[0].length; j++){
          str += data[i][j] + " ";
        }
        str += "\n";
      }
      str += "\n" + "Words: ";
      for (int i = 0; i < wordsAdded.size() - 1; i++){
        str += wordsAdded.get(i) + ", ";
      }
      if (wordsAdded.size() > 0){
        str += wordsAdded.get(wordsAdded.size() - 1);
      }
      str += "\n" + "Seed: " + this.seed;
      return str;
    }

    public static void main (String args[]){
      int row = Integer.parseInt(args[0]);
      int col = Integer.parseInt(args[1]);
      String txt = args[2];
      int mode = Integer.parseInt(args[3]);
      if (args.length < 5){
        WordSearch os = new WordSearch(row, col, txt, mode);
        System.out.println(os);
      } else{
        int seed = Integer.parseInt(args[4]);
        WordSearch os = new WordSearch(row, col, txt, mode, seed);
        System.out.println(os);
      }
    }
}
