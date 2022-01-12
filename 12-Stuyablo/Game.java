import java.util.*;
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
    System.out.print(">");

    Scanner in = new Scanner(System.in);
    String joe = in.nextLine();
    while(!joe.equals("q") && !joe.equals("quit")){
      TerminalCodes.clear();
      if (joe == ""){
        TerminalCodes.inputNo(no);
        TerminalCodes.makeRow();
        TerminalCodes.go(31,1);
        System.out.print(">");
        joe = in.nextLine();
      } else {
        TerminalCodes.clear();
        no = new int[4];
        for(int i = 0; i < 4; i++){
          no[i] = (int)(Math.random()*99)+1;
        }
        TerminalCodes.inputNo(no);
        TerminalCodes.makeRow();
        TerminalCodes.go(31,1);
        System.out.print(">");
        joe = in.nextLine();
      }
    }
    in.close();
    TerminalCodes.reset();
    TerminalCodes.showCursor();
  }
}
