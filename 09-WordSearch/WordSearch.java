/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      clear();
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[1].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String joe = "";
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[1].length; j++){
          joe += data[i][j] + " ";
        }
        joe += "\n";
      }
      return joe;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word, int row, int col){
      int wordLength = word.length();
      if (wordLength > data[1].length - col){
        System.out.println("Word cannot fit in wordsearch (RIP)");
        return false;
      }
      for (int i = 0; i < wordLength; i++){
        if (data[row][col+i] != '_' && data[row][col+i] != word.charAt(i)){
          System.out.println("Word overlapps with other letters (RIP)");
          return false;
        }
      }
      for (int i = 0; i < wordLength; i++){
       data[row][col+i] = word.charAt(i);
     }
      return true;
    }



   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word, int row, int col){
      int wordLength = word.length();
      if (wordLength > data.length - row){
        System.out.println("Word cannot fit in wordsearch (RIP)");
        return false;
      }
      for (int i = 0; i < wordLength; i++){
        if (data[row+i][col] != '_' && data[row+i][col] != word.charAt(i)){
          System.out.println("Word overlapps with other letters (RIP)");
          return false;
        }
      }
      for (int i = 0; i < wordLength; i++){
        data[row+i][col] = word.charAt(i);
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word, int row, int col){
      int wordLength = word.length();
      if (data.length - row < wordLength || data[1].length - col < wordLength){
        System.out.println("Word cannot fit in wordsearch (RIP)");
        return false;
      }
      for (int i = 0; i < wordLength; i++){
        if (data[row+i][col+i] != '_' && data[row+i][col+i] != word.charAt(i)){
          System.out.println("Word overlapps with other letters (RIP)");
          return false;
        }
      }
      for (int i = 0; i < wordLength; i++){
        data[row+i][col+i] = word.charAt(i);
      }
      return true;
    }

    public boolean addWord(int row, int col, String word, int rowInc, int colInc){
      int wordLen = word.length();
      // if (data.length - row < rowInc*wordLen || data[1].length - col < colInc*wordLen){
      //   return false;
      // }
      // if (row+rowInc*(wordLen-1) < 0 || col+colInc*(wordLen-1) < 0){
      //   return false;
      // }
      try {
        for (int i = 0; i < wordLen; i++){
          if (data[row+rowInc*i][col+colInc*i] != '_' && data[row+rowInc*i][col+colInc*i] != word.charAt(i)){
            System.out.println("Word overlapps with other letters (RIP)");
            return false;
          }
        }
      } catch(IndexOutOfBoundsException e){
        System.out.println("Index is out of bounds (RIP)");
        return false;
      }
      for (int i = 0; i < wordLen; i++){
        data[row+rowInc*i][col+colInc*i] = word.charAt(i);
      }
      return true;
    }
}
