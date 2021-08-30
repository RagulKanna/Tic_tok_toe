package com.workshop;

import java.util.Scanner;

public class Tiktoktoe {
    public static char ip;
    public static char[] b=new char[10];
    public static Scanner sc=new Scanner(System.in);
    public static void initializeboard(){
        b[0]=' ';
        b[1]=' ';
        b[2]=' ';
        b[3]=' ';
        b[4]=' ';
        b[5]=' ';
        b[6]=' ';
        b[7]=' ';
        b[8]=' ';
        b[9]=' ';
    }
    public static void input() {
        System.out.println("\nEnter the 'X' or 'O' what you needed:");
        ip = sc.next().charAt(0);
        if (ip == 'X' || ip == 'O' || ip == 'x' || ip == 'o') {
            System.out.println("You chose " + ip+" \n");

        } else {
            System.out.println("You chose wrong one!!!");
            input();
        }
    }
    public static void showboard()
    {
        System.out.println("\n Initially the board is empty \n");
        System.out.println("|-----------|");
        System.out.println("| " + b[0] + " | "+ b[1] + " | " + b[2]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[3] + " | "+ b[4] + " | " + b[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[6] + " | " + b[7] + " | " + b[8] + " |");
        System.out.println("|-----------|");
    }

    public static void main(String[] args) {
        initializeboard();
        input();
        showboard();

    }

}
