public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

     return this.value + other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return this.value * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return this.value/other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return this.value - other.getValue();
  }

  public int compareTo(RealNumber other){
    return (int)(other.getValue() - getValue());
  }

  public boolean equals(RealNumber other){
    return (other.getValue() == getValue());
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
}
