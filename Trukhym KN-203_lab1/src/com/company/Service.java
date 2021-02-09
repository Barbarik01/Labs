package com.company;

import java.util.Scanner;

public class Service {
    public static void printEvenAndOddNumbers(/*int a, int b*/) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number in interval:");
        int a = input.nextInt();
        System.out.println("Enter last number in interval:");
        int b = input.nextInt();
        if(a > b){
            int tmp = b;
            b = a;
            a = tmp;
        }
        int firstOdd, endEven;
        int sumOdd = 0, sumEven = 0;
        if (a % 2 != 0)
            firstOdd = a;
        else firstOdd = a + 1;
        System.out.println("Odd elements:");
        for (int i = firstOdd; i <= b; i += 2) {
            System.out.println(i);
            sumOdd += i;
        }
        if (b % 2 == 0)
            endEven = b;
        else endEven = b - 1;
        System.out.println("Even elements:");
        for (int i = endEven; i >= a; i -= 2) {
            System.out.println(i);
            sumEven += i;

        }
        System.out.println("sum odd = " + sumOdd);
        System.out.println("sum even = " + sumEven);
        System.out.println("Enter count of numbers in fibonachi:");
        int count  = input.nextInt();
        fibonachi(count, b); //викликаємо ф-цію
    }
        public static void fibonachi(int count, int b){
        int maxOdd, maxEven;
            if(b%2==0){
                maxEven=b;
                maxOdd=b-1;
            }
            else {
                maxEven = b-1;
                maxOdd = b;
            }
            System.out.println("Fibonachi: " + "\n" + maxOdd + "\n" + maxEven);
            int countOfOddNumbers = 1, countOfEvenNumbers = 1;
            printFibonachi(maxOdd, maxEven, count-2, countOfOddNumbers, countOfEvenNumbers);//звертаємось до рекурсивної ф-ції

        }
        public static void printFibonachi(int firstNumber, int secondNumber, int count,int countOfOddNumbers, int countOfEvenNumbers){

            int nextNumber = firstNumber + secondNumber;
            if(nextNumber%2 == 0){
                countOfEvenNumbers++;
            }
            else countOfOddNumbers++;
            System.out.println(nextNumber);
            --count;
            if(count >0)
                printFibonachi(secondNumber, nextNumber, count,countOfOddNumbers,countOfEvenNumbers);
            else {
                double percentOfEvenNumbers = Double.valueOf(countOfEvenNumbers)*100/(countOfEvenNumbers + countOfOddNumbers);
                System.out.println("percent of even numbers: "+ percentOfEvenNumbers  + "%");
                double percentOfOddNumbers = Double.valueOf(countOfOddNumbers)*100/(countOfEvenNumbers + countOfOddNumbers);
                System.out.println("countOfOddNumbers: " + percentOfOddNumbers + "%");
            }

        }


}
