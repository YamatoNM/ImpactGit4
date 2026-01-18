package BotanicaDuminica1.Lectia8;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(1, 2);
        while(true){
            System.out.println("Guess a number between  1 and 50!");
            int guess = input.nextInt();
            if(guess > randNumber)  System.out.println("Numarul este prea mare!");

            else if(guess < randNumber)  System.out.println("Numarul este prea mic");
            else{
                System.out.println("Ai ghicit numarul a fost " + randNumber);
                break;
            }
        }

        String word = "Baraban";
//        System.out.println(word.charAt(0));
//        System.out.println(word.charAt(6));//Utimul caracter
//        System.out.println(word.charAt(word.length()-1));//Utimul caracter

        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

        System.out.println("str1 = ");
        String str1 = input.next();
        System.out.println("str2 = ");
        String str2 = input.next();

        if(str1.equals(str2)){
            System.out.println("Siruri egale");
        }else if (str1.equalsIgnoreCase(str2)){
            System.out.println("Egale, dar scrise diferit");
        }
        else{
            System.out.println("Siruri diferite");
        }

    }
}
