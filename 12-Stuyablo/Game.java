public class Game{
  public static void main(String[] args) {
    TerminalCodes.hideCursor();
    TerminalCodes.clear();
    int[] no = new int[4];

    for(int i = 0; i < 4; i++){
      no[i] = (int)(Math.random()*99)+1;
    }
    TerminalCodes.inputNo(no);
    TerminalCodes.makeRow();

     TerminalCodes.go(31,1);
     TerminalCodes.reset();
     TerminalCodes.showCursor();
  }
}
