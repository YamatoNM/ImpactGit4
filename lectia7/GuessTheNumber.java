package BotanicaDuminica1.lectia7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;

        int secretNumber = random.nextInt(0, 100) + 1;//Numere de la 1 la 100
        int tries = 0;


        while (guess != secretNumber){
            System.out.println("Introdu un numar de la 1 la 100");
            System.out.print("guess= ");
            guess = input.nextInt();
            tries++;

            if( guess < 1 || guess > 100){
                System.out.println("Nu corespunde cerintei (1-100)🤡");
            }
            else if (guess > secretNumber){
                System.out.println("Numarul este prea mare!");
            }
            else if(guess < secretNumber){
                System.out.println("Numarul este prea mic");
            }

            else{
                System.out.println("Mega Harosh! Numarul a fost "+ secretNumber);
                System.out.println("Ai ghicit in doar " + tries + " incercari");
            }


        }


    }
}
