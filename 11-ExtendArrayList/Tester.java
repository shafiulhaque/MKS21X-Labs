import java.util.*;
import java.io.*;

public class Tester {
   public static void main(String[] args) {
     System.out.println("NO NULL ARRAY LIST TEST CASES");
     try {
       NoNullArrayList<String> nonullreg = new NoNullArrayList<String>();
       nonullreg.add("christmas");
       System.out.println(nonullreg);
       nonullreg.add("tree");
       System.out.println(nonullreg);
       nonullreg.add(1, "star");
       System.out.println(nonullreg);
       nonullreg.add(0, "light");
       System.out.println(nonullreg);
       nonullreg.set(0,"no");
       System.out.println(nonullreg);
       nonullreg.set(0,null);
       System.out.println(nonullreg);
     }
     catch (IllegalArgumentException e){
       System.out.println(e);
     }

     try {
       NoNullArrayList<Integer> nonullint = new NoNullArrayList<Integer>(10);
       nonullint.add(4);
       System.out.println(nonullint);
       nonullint.add(0,33);
       System.out.println(nonullint);
       nonullint.add(42);
       System.out.println(nonullint);
       nonullint.add(-11);
       System.out.println(nonullint);
       nonullint.set(1, -323);
       System.out.println(nonullint);
       nonullint.set(0, null);
       System.out.println(nonullint);
     } catch (IllegalArgumentException e){
       System.out.println(e);
     }
     System.out.println();


     System.out.println("ORDERED ARRAY LIST TEST CASES");
     try {
       OrderedArrayList<String> ordarstr = new OrderedArrayList<String>();
       ordarstr.add("christmas");
       System.out.println(ordarstr);
       ordarstr.add(3, "tree");
       System.out.println(ordarstr);
       ordarstr.add("jolly");
       System.out.println(ordarstr);
       ordarstr.add(-1, "merry");
       System.out.println(ordarstr);
       ordarstr.add(-1, null);
       System.out.println(ordarstr);
       ordarstr.add(22, "reindeer");
       System.out.println(ordarstr);


     } catch (IllegalArgumentException e){
       System.out.println(e);
     }



     }
   }
