/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        int people = 0;
        int pizzas = 0;
        int slices = 0;

        System.out.println("How many people?");
        people = jb.nextInt();

        System.out.println("How many pizzas do you have?");
        pizzas = jb.nextInt();

        System.out.println("How many slices per pizza?");
        slices = jb.nextInt();

        while(slices % 2 != 0){
            System.out.println("How many slices per pizza?");
            slices = jb.nextInt() * pizzas;
        }

        System.out.println(people + " people with " + pizzas + " pizzas ( " + slices * pizzas + " slices)");
        System.out.println("Each person gets " + ((slices*pizzas)/people) + " pieces of pizza.");
        System.out.println("There are " + (slices%people) + " leftovers.");
    }
}
