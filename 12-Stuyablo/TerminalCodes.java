import java.util.*;
public class TerminalCodes{
  /*Base colors*/
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;

  /*Text modifiers to be ADDED to a color*/
  public static final int BACKGROUND = 10;
  public static final int BRIGHT = 60;

  /*Text modifiers that are separate from color*/
  public static final int BOLD = 1;
  public static final int UNDERLINE = 4;
  public static final int INVERTED = 7;

  /*Reset colors*/
  public static void reset(){
    System.out.print("\u001b[0m");
  }


  public static void hideCursor(){
    System.out.print("\u001b[?25l");
  }

  public static void showCursor(){
    System.out.print("\u001b[?25h");
  }

  /*Move the cursor to a specified row/col on the terminal*/
  public static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }

  /*Erases all text on the terminal.*/
  public static void clear(){
    System.out.print("\u001b[2J");
  }

  /*Overloaded Colorize methods.
    c1,c2 and c3 are any color modifiers such as bold/color/background color etc.
  */
  public static String colorize(String text,int c1){
    return ("\u001b[" + c1 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2){
    return ("\u001b[" + c1 + ";" + c2 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2,int c3){
    return ("\u001b[" + c1 + ";" + c2 + ";" + c3 + "m"+text+"\u001b[0m");
  }

  public static void makeRow(){
    for(int i = 1; i < 80; i++){
      go(1,i);
      int nou = BLACK+(int)(Math.random()*6)+1;
      System.out.println(colorize(" ", nou+BACKGROUND));
    }
    for(int i = 1; i < 31; i++){
      go(i,1);
      int nou = BLACK+(int)(Math.random()*6)+1;
      System.out.println(colorize(" ", nou+BACKGROUND));
    }
    for(int i = 1; i < 81; i++){
      go(30,i);
      int nou = BLACK+(int)(Math.random()*6)+1;
      System.out.println(colorize(" ", nou+BACKGROUND));
    }
    for(int i = 1; i < 31; i++){
      go(i,80);
      int nou = BLACK+(int)(Math.random()*6)+1;
      System.out.println(colorize(" ", nou+BACKGROUND));
    }
  }

  public static void inputNo(int[] no){
        for(int i = 0; i < 4; i++){
          int main;
          go(2, 2+19*i);
          if(no[i] > 75){
            main = GREEN;
          } else if(no[i] < 25){
            main = RED;
          } else {
            main = WHITE;
          }
          System.out.println(colorize("" + no[i], BOLD, main));
        }
  }


  //Tested and working in:
  //git-bash (windows 10),    wsl (windows 10+11),   powershell windows 11
  public static void main(String[] args) {
    hideCursor();
    clear();
    int[] no = new int[4];

    for(int i = 0; i < 4; i++){
      no[i] = (int)(Math.random()*99)+1;
    }
    inputNo(no);
    makeRow();

     go(31,1);
     reset();
     showCursor();
  }
}
