package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        //Clean Code Book Chapter#02 Meaningful Names
        for(int row=1; row<10;row++) {
            for (int coloumn=1;coloumn<10;coloumn++) {

                if(row == 1 || row == 2 || row ==5 || row ==6){
                    System.out.print("*");
                }
                else {
                    if(coloumn == 1 || coloumn == 2 || coloumn == 8 || coloumn == 9){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
            }

        //Floyd Triangle Puzzle
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter Number of Rows For Floyd Triangle :: ");
        int rows = input.nextInt();
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.print("\n");
        }

        //Checking Prime Number
        System.out.print("\nEnter Any Number To Check Prime Number Form 1 to :: ");
        int finalNumber = input.nextInt();
        if (finalNumber > 1) {
            for (int i=2;i<=finalNumber;i+=2) {
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }

        //Factorial Of Number
        System.out.print("\n\nEnter Any Number For Factorial :: ");
        int numberForFactorial = input.nextInt();
        System.out.println("Using Iteration :: " + iterativeFactorial(numberForFactorial));
        System.out.println("Using Recursion :: " + recursiveFactorial(numberForFactorial));

        //Insertion Algorithm
        int arrayToSort[] = {4,9,3,12,10};
        System.out.println("\nUnsorted Array : 4 9 3 12 10");
        for(int i=1;i<arrayToSort.length;i++){
            for(int j=i;j>0;j--){
                if(arrayToSort[j] < arrayToSort[j-1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j-1];
                    arrayToSort[j-1] = temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for (int i=0;i<arrayToSort.length;i++){
            System.out.print(arrayToSort[i] + " ");
        }

        //Checking Number if it is power of 2
        System.out.print("\n\nEnter Number To Check Power Of Two :: ");
        int numberToCheckPowerOfTwo = input.nextInt();
        int square = 1;
        boolean powerOfTwo = false;
        while(numberToCheckPowerOfTwo >= square){
            if(numberToCheckPowerOfTwo == square){
                powerOfTwo = true;
            }
            square *= 2;
        }
        System.out.print(numberToCheckPowerOfTwo + " is Power of 2 statement is " + powerOfTwo);
            
    }


    public static boolean isPrime(int number) {
        for(int i = 2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    public static String iterativeFactorial(int number){
        int factorialResult=1;
       while(number !=0 ) {
                factorialResult *= number--;
            }
        return String.valueOf(factorialResult);
    }
    public static int recursiveFactorial(int number){
        if(number == 0)
            return 1;
        else
            return number * recursiveFactorial(number-1);
    }
}


