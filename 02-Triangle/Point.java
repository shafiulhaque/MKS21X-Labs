public class Point{
  // One field (instance variable:
  private double x,y;

  // Two constructors:
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  // Three accessor (non-static) methods (10/25):
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double distanceTo(Point other){
    double xcord = x - other.getX();
    double ycord = y - other.getY();
    double joe = Math.pow(xcord, 2) + Math.pow(ycord, 2);
    return Math.sqrt(joe);
  }
  // One accessor (static) method:
  public static double distance(Point start, Point end){
    double xcord = end.getX() - start.getX();
    double ycord = end.getY() - start.getY();
    double joe = Math.pow(xcord, 2) + Math.pow(ycord, 2);
    return Math.sqrt(joe);
  }
  // To string method
  public String toString(){
    return "{" + x + ", " + y + "}";
  }
  // MAIN CLOSE ENOUGH FUNCTION
  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0){
      if ((a == 0 && b != 0) || (b == 0 && a != 0)){
        return false;
      } else {
        return true;
      }
    }
    double joe = (a - b)/a;
    return (Math.abs(joe) < 0.001);
  }
  /*Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *To avoid issues: If one is 0.0, the other must be exactly 0.0.
  */
  public boolean equals(Point other){
    return (closeEnough(x, other.getX()) && closeEnough(y, other.getY()));
  }
}
