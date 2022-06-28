package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        int pizza=1;
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int ppp = scan.nextInt();
        while (pizza*ppp%people !=0) {
            pizza++;
        }
        System.out.println(pizza);
    }
}
