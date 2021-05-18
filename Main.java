package com.TTS;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
       //Asks the user for 5 numbers
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = new Integer (userInput.next()); //I first put int number=input.next(); when it should be String number1 = userInput.nextLine();

        //System.out.printf("%s", number1);
        // Use this to test your user's input was actually store.Or you can do a breakpoint. Use the Debug put

        System.out.println("\nEnter a number:");
        int number2 = new Integer (userInput.next());

        System.out.println("Enter a number:");
        int number3 = new Integer (userInput.next());

        System.out.println("Enter a number:");
        int number4 = new Integer (userInput.next());

        System.out.println("Enter a number:");
        int number5 = new Integer (userInput.next());

/*
        int sum = number1 + number2 + number3 + number4 + number5;
        //This is the LONG way.
        int product = number1 * number2 * number3 * number4 * number5;
        //This is the LONG way.
*/

        //Stores user numbers in an array list
        //  ArrayList<int> inputNumbers = new ArrayList[number1, number2, number3, number4, number5];
        List <Integer> numberList = new ArrayList <Integer> ();
        numberList.add(number1);
        numberList.add(number2);
        numberList.add(number3);
        numberList.add(number4);
        numberList.add(number5);

        //More refined way to get sum, product, max, and min)
        int sum = 0;                               //initializing sum
        int i;
            for ( int number: numberList) {       // for (Integer number : myArrayName)
                sum += number;                    // sum += number;
            }

        int product = 1; //initializing product
        for ( int number: numberList) {           // for (Integer number : myArrayName)
                product = product * number;       //  product = product * number;
        }

        int largest = Collections.max (numberList);
        int smallest = Collections.min (numberList);

        // Finds the sum, product, largest, and smallest of those numbers
        System.out.println("List of numbers:" +numberList);
        System.out.println("Sum of these numbers: " +sum);
        System.out.println("Product of these numbers: " +product);
        System.out.println("Largest number of these numbers: " +largest);
        System.out.println("Smallest number of these numbers: " +smallest);


        //Some class notes
        //  ArrayList<int> inputNumbers = new ArrayList[number1, number2, number3, number4, number5];
      //  Integer sum = 0;
      //  Integer product = 1;
      //  Integer largest = 0;
      //  Integer smaller = 0;
       // for (Integer number : numbers) {
        //    sum += number;
          //  product *= number;

         //   if(largest > number) {
        //            continue;
        //    } else{
        //        largest = number;}}
  //      int sum = numbers.add(number1, number2, number3, number4, number5);
     //   int largest =
    //    int smallest =

        //The efficient/loop way
        //for (int i = 1; i <=5; i++){ }


    }
}
