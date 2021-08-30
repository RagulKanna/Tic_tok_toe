package com.workshop;

import javax.swing.*;
import java.util.Scanner;

public class Tiktoktoe {
    public static int box,choice,move,cplay;
    public static char Playerchoice,computerchoice;
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
        Playerchoice = sc.next().charAt(0);
        if (Playerchoice == 'X' || Playerchoice == 'O' || Playerchoice == 'x' || Playerchoice == 'o')
        System.out.println("your choice is allocated!!! \n");
            else {
            System.out.println("You chose wrong one!!!");
            input();
        }
        if(Playerchoice == 'x' )
            computerchoice= 'o';
        else if(Playerchoice == 'X')
            computerchoice = 'O';
        else if(Playerchoice == 'o' )
            computerchoice= 'x';
        else
            computerchoice = 'X';
        System.out.println("You chose " + Playerchoice+" \n");
        System.out.println("Another player chose " + computerchoice+" \n");
    }
    public static void showboard()
    {
        System.out.println("\n Initially the board is empty \n");
        System.out.println("|-----------|");
        System.out.println("| " + b[1] + " | "+ b[2] + " | " + b[3]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[4] + " | "+ b[5] + " | " + b[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[7] + " | " + b[8] + " | " + b[9] + " |");
        System.out.println("|-----------|");
    }

    public static void selectbox()
    {
        choicetoplay();
        for(int i=0;i<9;i++) {

            if (choice == 1)
                move = i % 2;
            else
                move = (i + 1) % 2;

            switch (move) {
                case 0: {
                    System.out.println("Select box you need 1 to 9:");
                    box = sc.nextInt();
                    checkboxPlayer();
                    showboard();
                }
                break;
                case 1: {
                    cplay = (int) (Math.floor(Math.random() * 9 % 10) + 1);
                    box = cplay;
                    checkboxcomputer();
                    showboard();
                } break;
            }
        }
    }

    public static void checkboxPlayer(){
        if (box >9 || box <1 ) {
            System.out.println("you chose wrong box!!!");
            selectbox();
        }
        else if(b[box] !=' ') {
            System.out.println("The box is Occupied already");
            selectbox();
        }
        else
            b[box]=Playerchoice;
    }
    public static void checkboxcomputer(){
        if (box >9 || box <1 ) {
            System.out.println("you chose wrong box!!!");
            selectbox();
        }
        else if(b[box] !=' ') {
            System.out.println("The box is Occupied already");
            selectbox();
        }
        else
            b[box]=computerchoice;
        showboard();
    }

    public static void choicetoplay()
    {
        choice=(int)(Math.random() * 2) ;
        if(choice == 1)
            System.out.println("player 1 is going to play first!!!");
        else
            System.out.println("Computer is going to play first");

    }

    public static void main(String[] args) {
        initializeboard();
        input();
        showboard();
        selectbox();

    }

}
