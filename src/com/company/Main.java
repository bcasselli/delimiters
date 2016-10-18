package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        // Separates text that was given to a scanner when it detects a certain character
        // that is defined by the user.
        Scanner sc = new Scanner("red fish/blue fish");
        sc.useDelimiter("/");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }


    }
}
