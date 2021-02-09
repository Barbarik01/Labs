package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(1, "Zhylko", "Tetyana", "xxx", "Santa Barbara", 11112222, 100),
                new Customer(2, "Faryna", "Iryna", "xxx", "Ivana Franka", 11111132, -7),
                new Customer(3, "Ivanez", "Volodymyr", "xxx", "Marka Vovchka", 50000, -9),
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username to compare:");
        String name = input.nextLine();
        for (int i = 0; i < customers.length; i++) {
            //якщо у поточного користувача ім'я еквівалентне потрібному
            if (customers[i].getUsername().equals(name))
                System.out.println(customers[i]);
        }
        System.out.println("Enter first number in interval:");
        int a = input.nextInt();
        System.out.println("Enter last number in interval:");
        int b = input.nextInt();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getNumCard() > a && customers[i].getNumCard() < b)
                System.out.println(customers[i]);
        }
        System.out.println("Oweres:");
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getBalance() < 0){
                System.out.println(customers[i]);
            count += 1;
            }
        }
        System.out.println("Count of oweres:");
        System.out.println(count);
    }
}
