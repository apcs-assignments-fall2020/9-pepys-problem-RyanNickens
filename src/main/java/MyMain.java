import java.util.Scanner;
//import java.util.Math;
import java.util.stream.*;
import java.util.Arrays;

public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
      //setting variables
      int rounds = 10000;
      int tsix = 0;

      for (int i = 0; i < rounds; i++) {
          //local boolean variable
        boolean success = false;
        for (int k = 0; k < 6; k++) {
          if ((int)(Math.random() * 6) + 1 == 6) {
            //using boolean, makes less complicated
            success = true;
          }
        }      
        if (success)
            tsix++;
        }
      //w is the decimal value of the probability
      double w = (double)tsix / rounds; 
      //making it into percent format
      double percent = (double) w * 100;
      return percent;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
    //slight variation of code above, except no boolean use
      //setting variables
      int rounds = 10000;
      int tsix = 0;
      
      for (int i = 0; i < rounds; i++) {
        //made local varible for the for loop
        int total = 0;
        for (int k = 0; k < 12; k++) {
          if ((int)(Math.random() * 6) + 1 == 6) {
            total++;
          }
        }    
        if (total >= 2)
            tsix++;
        }
      //w is the decimal value of the probability
      double w = (double)tsix / rounds; 
      //making it(w) into percent format
      double percent = (double) w * 100;
      return percent;
         
    }
    
    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
    //slight variation of code above
      //making variables
      int rounds = 10000;
      int tsix = 0;

      for (int i = 0; i < rounds; i++) {
        //same local variable style as method above
        int total = 0;
        for (int k = 0; k < 18; k++) {
          if ((int)(Math.random() * 6) + 1 == 6) {
            total++;
          }
        }     
        if (total >= 3)
            tsix++;
        }
      //w is the decimal value of the probability
      double w = (double)tsix / rounds; 
      //making it(w) into percent format
      double percent = (double) w * 100;
      return percent;
    }


    public static void main(String[] args) {
        //no need for scanner, user doesnt input anything
      System.out.println("numbers vary slightly each round");
      System.out.println(" ");
      System.out.println("probability: " + probabilityOneSix());
      System.out.println("probability: " + probabilityTwoSixes());
      System.out.println("probability: " + probabilityThreeSixes());
        
    }
}