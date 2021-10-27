public class Demo{
  /* more methods can go here*/
  public static double distance(Point start, Point end){
    double xcord = end.getX() - start.getX();
    double ycord = end.getY() - start.getY();
    double joe = Math.pow(xcord, 2) + Math.pow(ycord, 2);
    return Math.sqrt(joe);
  }

  public static void main(String[] args) {
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(4, -18);
    Point P4 = new Point(-1, 0);
    Point P5 = new Point(-12, -19);
    Point P6 = new Point(1.0001, 1);
    System.out.println("Test Cases: (1- Static in Demo, 2- Static in Point, 3- Non-static in Point)");
    System.out.println("Test Case 1: P1 and P2: 1.4142135623730951");
    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    System.out.println("Test Case 2: P1 and P3: 19.235384061671343");
    System.out.println(  distance(P1,P3));
    System.out.println(  Point.distance(P1,P3));
    System.out.println(  P1.distanceTo(P3));
    System.out.println("Test Case 3: P2 and P4: 3.605551275463989");
    System.out.println(  distance(P2,P4));
    System.out.println(  Point.distance(P2,P4));
    System.out.println(  P2.distanceTo(P4));
    System.out.println("Test Case 4: P3 and P5: 16.0312195418814");
    System.out.println(  distance(P3,P5));
    System.out.println(  Point.distance(P3,P5));
    System.out.println(  P3.distanceTo(P5));
    System.out.println( "--------------------");
    Triangle T1 = new Triangle(new Point(1, 2), new Point(3, 4), new Point(1, 6));
    Triangle T2 = new Triangle(new Point(0, 0), new Point(3.0000001, 4), new Point(0.99999999, 6));
    System.out.println("First Test Case: Regular Triangle");
    System.out.println(T1);
    System.out.println(T1.getPerimeter());
    System.out.println(T1.getVertex(2));
    System.out.println(T1.getVertex(3));
    T1.setVertex(1, new Point(0, 0));
    System.out.println(T1);
    System.out.println(T1.getPerimeter());
    System.out.println(Point.closeEnough(-1.111, -1.1111));
    System.out.println(P1.equals(P6));
    System.out.println(T1.equals(T2));
    T1.setVertex(1, new Point(1, 2));
    System.out.println(T1.classify());
    System.out.println(T1.area());
  }
 }
