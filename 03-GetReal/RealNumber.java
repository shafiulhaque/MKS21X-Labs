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

     return getValue() + other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return getValue() * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return getValue()/other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return getValue() - other.getValue();
  }

  public int compareTo(RealNumber other){
    double joe = getValue() - other.getValue();
    if (joe >= 1) return 2;
    if (joe > 0 && joe < 1) return 1;
    if (joe == 0) return 0;
    return -1;
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
