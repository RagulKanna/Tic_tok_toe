package com.workshop;

import java.util.Scanner;

public class Tiktoktoe {

    public static Scanner sc=new Scanner(System.in);
    public static void initializeboard(){
        char[] b=new char[10];
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

    public static void main(String[] args) {
        initializeboard();

    }

}
