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
  // Three accessor (non-static) methods:
  public double getPerimeter(){
    double l1 = Point.distance(v1, v2);
    double l2 = Point.distance(v2, v3);
    double l3 = Point.distance(v3, v1);
    double total = l1 + l2 + l3;
    return total;
  }
  public Point getVertex(int num){
    if (num == 1){
      return v1;
    } else if (num == 2){
      return v2;
    } else {
      return v3;
    }
  }
  public void setVertex(int num, Point a){
    if (num == 1){
      v1 = a;
    } else if (num == 2){
      v2 = a;
    } else {
      v3 = a;
    }
  }
  // To string method
  public String toString(){
    return "{" + v1 + ", " + v2 + ", " + v3 + "}";
  }
}
