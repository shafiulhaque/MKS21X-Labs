import java.util.Random;
  public class DemoRandom{
    public static void main(String[]args){

      //here no seed is provided, so it uses the clock as a seed
      //this can be used to produce a random seed for a different Random object!
      Random rng = new Random();
      int seed = rng.nextInt();

      System.out.println("The seed: "+seed);
      rng = new Random(-1044212732);
      for(int i =  0; i < 10; i++ ){
        System.out.println(rng.nextInt() % 1000);
      }
    }
  }
