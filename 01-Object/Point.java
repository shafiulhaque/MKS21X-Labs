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
  // Two accessor methods:
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}
