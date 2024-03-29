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
    RationalNumber joemama = new RationalNumber(denominator, numerator);
    return joemama;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    //other.reduce();
    //reduce();
    return (other.getNumerator() == getNumerator() && other.getDenominator() == getNumerator());
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
    while (b != 0){
      c = a%b;
      a = b;
      b = c;
    }
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    return a;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
    if (denominator < 0){                      // makes it look better
      denominator *= -1;
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
