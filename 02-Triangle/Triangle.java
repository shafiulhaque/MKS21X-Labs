public class Triangle{
  // Two fields (instance variable):
  private Point v1, v2, v3;
  // Two constructors:
  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double a, double b, double c, double d, double e, double f){
    v1 = new Point(a, b);
    v2 = new Point(c, d);
    v3 = new Point(e, f);
  }
  // Four accessor (non-static) methods:
}
