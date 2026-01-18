package BotanicaDuminica1.Lectia5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();

        //a = doubleValue(a);
        System.out.println("Valoarea dubla este " + a);
        descompunereNumar(a);
        System.out.println();
        numarInversat(4444);
       // System.out.println("\nNumarul inversat= " + (numarInversat(a)));

        System.out.println("Suma cifrelor = " + sumaCifrelor(a));
        System.out.println("Produsul cifrelor = " + produsCifrelor(a));

    }
    public static int doubleValue(int num){
        return num*2;
    }

    public static void descompunereNumar(int num){
        int j;
        while(num!=0){
            j = num % 10;
            System.out.print(" " + j);
            num = num / 10;
        }

    }
    public static int numarInversat(int num){
        int j;
        int orijinal = num;
        int inversat=0;
        while(num!=0){
            j = num % 10;
            inversat = inversat * 10 + j;

            num = num / 10;
        }
        if(orijinal == inversat){
            System.out.println("Palindrom!");
        }
        else{
            System.out.println("Nu este palindrom");
        }
        return inversat;

    }

    public static int sumaCifrelor(int num){
        int sum = 0;
        while(num!=0){
            sum += num %10;
            num /= 10;
        }
        return sum;
    }
    public static int produsCifrelor(int num){
        int prod = 1;
        while(num!=0){
            prod *= num %10;
            num /= 10;
        }
        return prod;
    }

    public static boolean isPalindrom(int num) {
        if (numarInversat(num) == num) {
            System.out.println("Numarul este palindrom");
            return true;
        } else {
            System.out.println("Numarul nu este palindrom");
            return false;
        }
    }
}
