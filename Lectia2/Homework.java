package BotanicaDuminica1.Lectia2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.print("Num1 = ");
//        int num1 = input.nextInt();
//
//        System.out.print("Num2 = ");
//        int num2 = input.nextInt();
//
//        System.out.println("Num1 + Num2 = " + (num1 + num2));
//        System.out.println("Num1 - Num2 = " + (num1 - num2));
//        System.out.println("Num1 * Num2 = " + (num1 * num2));
//        System.out.println("Num1 / Num2 = " + (num1 / num2));

//        System.out.println("varsta: ");
//        int varsta = input.nextInt();
//
//        System.out.println("Major: " + (varsta>=18));
//
//
//        System.out.println("Varsta este para: " + (varsta%2==0));
//
//
//        if(varsta>=18 && varsta<63){
//            System.out.println("Utilizatorul este logat cu succes");
//
//        }else if(varsta>=63){
//            System.out.println("Interzis pentru pensionari!🥹(cry emoji)");
//        }
//        else{
//            System.out.println("Varsta nu este suficienta pentru logare!");
//        }

        Scanner inp = new Scanner(System.in);
//        System.out.print("x= ");
//        int x = inp.nextInt();
//
//        System.out.print("y= ");
//        int y = inp.nextInt();
//
//
//        if(x>y){
//            System.out.println("x>y " + x);
//
//        } else if (y>x) {
//            System.out.println("y>x" + y);
//        }else{
//            System.out.println("x=y");
//        }
//

        System.out.println("Nota: ");
        int nota  = input.nextInt();

        switch (nota){
            case 10:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
            case 8:
                System.out.println("8");
            default:
                System.out.println("2");
        }


        int zi = input.nextInt();

        String result = (zi == 1) ? "Luni" :
                        (zi == 2) ? "Marti" :
                        (zi == 3) ? "Miercuri" :
                        (zi == 4) ? "Joi" :
                        (zi == 5) ? "Vineri":
                        (zi == 6) ? "Sambata":
                        (zi == 7) ? "Duminica":
                        "Zi invalidă 🤡🦽";
        System.out.println(result);


        result = (zi > 0 ) ? "Pozitiv" :
                 (zi < 0) ? "Negativ":
                        "Egal cu 0";

        System.out.println(result);
    }
}
