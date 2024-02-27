//author: Sara Russert
//date: 26 February 2024
//file: FibArray.java

import java.util.Scanner;

public class FibArray {
   public static void main(String[] args) {
   
   // declare var to hold int from user for how many fibs
   int howManyFibs;
   
   // create Scanner object
   Scanner keyboard = new Scanner(System.in);
   
   // get user input for howManyFibs
   System.out.print("Enter the number of fibs you wish to generate:  ");
   howManyFibs = keyboard.nextInt();
   
   //call populateFibs method to create the array
   int[] fibsArray = populateFibs(howManyFibs);
   
   System.out.println("After initializing, fibs contains:");
   displayArray(fibsArray, "fibs"); 
   }
   
   
   // method to display an array
   // params: array of ints, name
   public static void displayArray(int[] arr, String name) {
      // use a for loop to access all elements of the array
      for (int i = 0; i < arr.length; i++) {
         System.out.println(name + "[ " + i + " ] == " + arr[i]);
      }
   }
   
   
   // method to populate fib array
   // params: single int representing number of fibs to generate
   // return: array of ints
   public static int[] populateFibs(int numFibs) {
      // declare an array with numFibs elements
      int[] fibs = new int[numFibs];
      
      // display the current state of the array
      System.out.println("Before initializing, fibs contains:");
      displayArray(fibs, "fibs");
      
      // put ints in each index
      for (int i = 0; i < numFibs; i++) {
         if (i == 0) 
            fibs[i] = 0;
         else if (i == 1)
            fibs[i] = 1;
         else
            fibs[i] = fibs[i - 1] + fibs[i - 2];
      }
      
      return fibs;
   }
}