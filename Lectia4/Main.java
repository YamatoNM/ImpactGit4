package BotanicaDuminica1.Lectia4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for(int i=10; i>0; i--){
            System.out.print(i + " ");
        }


        System.out.println();
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i+=2;
        }

        System.out.println();
        int x = 0;
        do{
            System.out.println(x + " ");
            x++;
        }while (x < 5);

        Scanner scanner = new Scanner(System.in);


//        int varsta  = scanner.nextInt();
//
//        if(varsta<18){
//            System.out.println("🔞🔞🔞🔞🔞🔞");
//            return;
//        }
//        System.out.println("Welcome to the club, buddy!🤌👯👯👯");
//
//        System.out.println("Introdu un numar, por favore: ");







        for(int y = 0; y<=10; y++){

            if(y == 5){
                continue;
            }
            System.out.println(y);
            System.out.println(y*y);

        }


        int k = 0;

        while(k<5){

            k++;
            if (k==2){

                continue;
            }
            System.out.println(k);

        }
        System.out.println("Introdu varsta");


        while(true){
            System.out.println("1. Numar par/Impar");
            System.out.println("2. Numar Pozitiv/Negativ");
            System.out.println("3. Introdu parola");
            System.out.println("4. Alfa cate cifre are numarul");
            System.out.println("0. Exit");

            System.out.println("\t Alege optiunea dorita");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("introdu un numar:");
                    x = scanner.nextInt();
                    if (x % 2 == 0) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                    break;
                case 2:
                    System.out.println("introdu un numar:");
                    x = scanner.nextInt();
                    if (x > 0) {
                        System.out.println("Pozitiv");
                    } else if (x < 0) {
                        System.out.println("Negativ");
                    } else {
                        System.out.println("Numarul este 0 ");
                    }
                    break;
                case 3:
                    String parola;
                    do {
                        System.out.println("Introduceti parola");
                        parola = scanner.next();

                    } while (!(parola.equals("1")));
                    break;
                case 4:
                    long numar = scanner.nextLong(); //34567890567890
                    byte counter = 0;

                    while (numar != 0) {
                        counter++;
                        numar = numar / 10;

                    }
                    System.out.println("Numarul  are " + counter + "cifre");
                    break;

            }
            if(option == 0) {
                break;
            }

            }

        }

    }

