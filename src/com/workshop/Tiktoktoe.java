package com.workshop;


import java.util.Scanner;

public class Tiktoktoe {
    public static int box,choice,move,cplay,count,i;
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
        System.out.println("\nyour choice is allotted!!! \n");
            else {
            System.out.println("\nYou chose wrong one!!!");
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


    public static void showboardinitially()
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


    public static void showboard()
    {
        System.out.println("\n \n");
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

        for( i=0;count<18;i++) {

            if (choice == 1)
                move = i % 2;
            else
                move = (i + 1) % 2;

            switch (move) {
                case 0: {
                    System.out.println("\nYour Turn !!!!!");
                    PlayofYou();
                }
                break;
                case 1: {
                    System.out.println("\nYour computer's turn !!!!!");
                    PlayofComputer();
                } break;
            }
        }
    }

    public static void checkboxPlayer(){
        if (box >9 || box <1 ) {
            System.out.println("\nyou chose wrong box!!!");
            i--;
        }
        else if(b[box] !=' ') {
            System.out.println("\nThe box is Occupied already");
            i--;
        }
        else
            b[box]=Playerchoice;
        showboard();
        count++;
    }


    public static void checkboxcomputer(){
        if (box > 9 || box < 1 ) {
            System.out.println("\nyou chose wrong box!!!");
            i--;
        }
        else if(b[box] != ' ') {
            System.out.println("\nThe box is Occupied already");
            i--;

        }
        else
            b[box]=computerchoice;
        showboard();
        count++;

    }


    public static void choicetoplay()
    {
        choice=(int)(Math.random() * 2) ;
        if(choice == 1)
            System.out.println("player 1 is going to play first!!!");
        else
            System.out.println("Computer is going to play first");

    }


    public static void Checkwinner() {
        for (int j = 1; j <=9; j++) {


            switch (j) {
                case 1: {
                    if (b[1] == Playerchoice && b[2] == Playerchoice && b[3] == Playerchoice) {
                        System.out.println("Player 1 won!!!!");
                        count = 18;
                    } else if (b[1] == computerchoice && b[2] == computerchoice && b[3] == computerchoice) {
                        System.out.println("Computer Player won!!!!");
                        count = 18;
                    }

                }
                break;
                case 2: {
                    if (b[7] == Playerchoice && b[8] == Playerchoice && b[9] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[7] == computerchoice && b[8] == computerchoice && b[9] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 3: {
                    if (b[4] == Playerchoice && b[5] == Playerchoice && b[6] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[4] == computerchoice && b[5] == computerchoice && b[6] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 4: {
                    if (b[3] == Playerchoice && b[6] == Playerchoice && b[9] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[3] == computerchoice && b[6] == computerchoice && b[9] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }

                }
                break;
                case 5: {
                    if (b[1] == Playerchoice && b[4] == Playerchoice && b[7] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[1] == computerchoice && b[4] == computerchoice && b[7] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 6: {
                    if (b[2] == Playerchoice && b[5] == Playerchoice && b[8] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[2] == computerchoice && b[5] == computerchoice && b[8] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 7: {
                    if (b[1] == Playerchoice && b[5] == Playerchoice && b[9] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[1] == computerchoice && b[5] == computerchoice && b[9] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 8: {
                    if (b[3] == Playerchoice && b[5] == Playerchoice && b[7] == Playerchoice) {
                        System.out.println("\nPlayer 1 won!!!!");
                        count = 18;
                    } else if (b[3] == computerchoice && b[5] == computerchoice && b[7] == computerchoice) {
                        System.out.println("\nComputer Player won!!!!");
                        count = 18;
                    }
                }
                break;
                case 9: {
                    if (b[1] != ' ' && b[2] != ' ' && b[3] != ' ' && b[4] != ' ' && b[5] != ' ' && b[6] != ' ' && b[7] != ' ' && b[8] != ' ' && b[9] != ' ')
                    {
                        System.out.println("No Box are Empty!!!....The Game is Draw....");
                        count = 18;
                    }
                }
                break;
                }
            }
        }
public static void PlayofComputer()
{

    cplay = (int) (Math.floor(Math.random() * 9 % 10) + 1);
    box = cplay;
    checkboxcomputer();
    Checkwinner();
}
public static void PlayofYou()
{
    System.out.println("\nSelect box you need 1 to 9:");
    box = sc.nextInt();
    checkboxPlayer();
    Checkwinner();
}
    public static void main(String[] args) {
        initializeboard();
        input();
        showboardinitially();
        choicetoplay();
        selectbox();


    }

}
