import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    for(int i = 0; i < party.size(); i++){
      int main;
      Text.go(startRow, 2+19*i+1);
      System.out.println(Text.colorize(party.get(i).getName(), Text.BOLD));

      Text.go(startRow+1, 2+19*i+1);
      System.out.println(Text.colorize(party.get(i).getSpecialName() + ":" + party.get(i).getSpecial() + "/" + party.get(i).getSpecialMax(), Text.BOLD));

      Text.go(startRow+2, 2+19*i+1);
      int no = party.get(i).getHP();
      int no1 = party.get(i).getmaxHP();
      if(no >= no1*3/4){
        main = Text.GREEN;
      } else if(no <= no1/4){
        main = Text.RED;
      } else {
        main = Text.WHITE;
      }
      System.out.println(Text.colorize("HP:", Text.BOLD, Text.WHITE) + Text.colorize(no + "/" + party.get(i).getmaxHP(), Text.BOLD, main));
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    Text.go(startRow, 3);
    System.out.println(Text.colorize(s, Text.BOLD, Text.WHITE));
  }

  public static void drawScreen(){
    for(int i = 2; i < 79; i++){
      Text.go(1,i);
      System.out.println(Text.colorize("-", Text.BLUE+Text.BACKGROUND));
      Text.go(5,i);
      System.out.println(Text.colorize("-", Text.BLUE+Text.BACKGROUND));
      Text.go(24,i);
      System.out.println(Text.colorize("-", Text.BLUE+Text.BACKGROUND));
      Text.go(30,i);
      System.out.println(Text.colorize("-", Text.BLUE+Text.BACKGROUND));
    }
    for(int i = 1; i < 31; i++){
      Text.go(i,1);
      System.out.println(Text.colorize(" ", Text.BLACK+Text.BACKGROUND));
      Text.go(i,80);
      System.out.println(Text.colorize(" ", Text.BLACK+Text.BACKGROUND));
    }
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    Adventurer enemy = new Wizard("Mr. K");
    enemies.add(enemy);

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer adv1 = new Wizard("Alvin");
    Adventurer adv2 = new Wizard("Taee");
    Adventurer adv3 = new Warrior("Craig");
    party.add(adv1);
    party.add(adv2);
    party.add(adv3);


    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          Text.clear();
          Text.go(HEIGHT/2-5,3);
          System.out.println(party.get(whichPlayer).attack(enemies.get(0)));
          Text.go(32,2);
        }
        else if(input.equals("special")){
          Text.clear();
          Text.go(HEIGHT/2-5,3);
          System.out.println(party.get(whichPlayer).specialAttack(enemies.get(0)));
          Text.go(32,2);
        }
        whichPlayer++;

        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("Press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          drawText("Enter command for "+enemies.get(0)+
                   ": attack/special/quit",HEIGHT/2);
          //Enemy action choices go here!
          Text.go(HEIGHT/2-5,3);
          int index = (int)(Math.random()*party.size());
          System.out.println(enemies.get(0).attack(party.get(index)));
          Text.go(32,2);
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);
      drawScreen();

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
