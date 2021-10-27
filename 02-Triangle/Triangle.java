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
  // MAIN CLOSE ENOUGH FUNCTION
  public static boolean closeEnough(double a, double b){
    double joe = (a - b)/a;
    return (Math.abs(joe) < 0.001);
  }
  /*Return true when the Points of the triangles are all equal() to the corresponding points of the other Triangle.
  */
  public boolean equals(Triangle other){
    return (v1.equals(other.getVertex(1)) && v2.equals(other.getVertex(2)) && v3.equals(other.getVertex(3)));
  }
  /*Return "scalene", "isosceles", or "equilateral"
  *Make sure to use closeEnough() to determine if two sides are equal because of rounding!
  */
  public String classify(){
    double l1 = Point.distance(v1, v2);
    double l2 = Point.distance(v2, v3);
    double l3 = Point.distance(v3, v1);
    if (closeEnough(l1, l2) && closeEnough(l2, l3)){
      return "equilateral";
    } else if (closeEnough(l1, l2) || closeEnough(l2, l3) || closeEnough(l1, l3)){
      return "isosceles";
    } else {
      return "scalene";
    }
  }
  /*Return the area of the triangle
  *Make sure to use the formula: Area = sqrt ( s(s-a)(s-b)(s-c) )
  *where s= perimeter/2 , and a,b,c are the side lengths.
  */
  public double area(){
    double s = getPerimeter()*0.5;
    double l1 = Point.distance(v1, v2);
    double l2 = Point.distance(v2, v3);
    double l3 = Point.distance(v3, v1);
    double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
    return area;
  }
}
