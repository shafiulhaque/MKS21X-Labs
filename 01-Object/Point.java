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
  // Three accessor (non-static) methods:
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
    double ycord = end.getX() - start.getX();
    double joe = Math.pow(xcord, 2) + Math.pow(ycord, 2);
    return Math.sqrt(joe);
  }
}
