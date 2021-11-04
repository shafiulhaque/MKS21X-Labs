public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    if (numerator == 0) return 0.0;
    if (denominator == 0) return numerator;
    return (double)numerator/(double)denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    if (numerator == 0){
      return this;
    }
    RationalNumber joemama = new RationalNumber(denominator, numerator);
    return joemama;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    //other.reduce();
    //reduce();
    return (other.getNumerator() == this.numerator && other.getDenominator() == this.denominator);
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int c = -1;
    int low = 0;
    int high = 0;
    if (a > b){
      high = a;
      low = b;
    } else{
      high = b;
      low = a;
    }
    while (c != 0){
      c = high%low;
      high = low;
      low = c;
    }
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    return high;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int excep = 0;
    if (numerator == 0){
      excep = 1;
    } else {
      excep = numerator;
    }
    if (denominator == 0) denominator = 1;
    int gcd = gcd(excep, denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
    if (denominator < 0){
      denominator = Math.abs(denominator);
      numerator *= -1;
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber joe = new RationalNumber(other.getNumerator()*this.numerator, other.getDenominator()*this.denominator);
    joe.reduce();
    return joe;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber joe = new RationalNumber(other.getDenominator()*this.numerator, other.getNumerator()*this.denominator);
    joe.reduce();
    return joe;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber joe = new RationalNumber(other.getNumerator()*this.denominator + other.getDenominator()*this.numerator, other.getDenominator()*this.denominator);
    joe.reduce();
    return joe;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber joe = new RationalNumber(other.getDenominator()*this.numerator - other.getNumerator()*this.denominator , other.getDenominator()*this.denominator);
    joe.reduce();
    return joe;
  }
}
