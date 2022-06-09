package com.itprogect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = sk.nextLine();
        System.out.print("Enter your username: ");
        String name2 = sk.nextLine();
        System.out.print("Enter the age: ");
        int name3 = sk.nextInt();
        sk.nextLine();
        System.out.print("Enter hobbies separated by commas: ");
        String[] name4 = sk.nextLine().split(",");
        System.out.println("User: " + name1 + " with login: " + name2 + " His age: " + name3 + " And " + "hobby: ");
        for (int i = 0; i < name4.length; i++) {
            System.out.println(name4[i]);
        }
    }
}