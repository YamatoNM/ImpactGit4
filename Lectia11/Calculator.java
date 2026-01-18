package BotanicaDuminica1.Lectia11;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean menu = true;
        double a;
        double b;
        while(menu){
            System.out.println("====Caliculiator Ultra Pro MAX 200MP====");
            System.out.println("1. Adunare.");
            System.out.println("2. Scadere.");
            System.out.println("3. Inmultire.");
            System.out.println("4. Impartire.");
            System.out.println("5. Procentaj.");
            System.out.println("6. Restul impartirii.");
            System.out.println("7. Ridicarea la putere.");
            System.out.println("8. Radical.");
            System.out.println("9. a% din b");
            System.out.println("0. EXIT.");
            System.out.print("Alege o optiune: ");
            int optiune = input.nextInt();
            switch (optiune){
                case 1:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();

                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                case 2:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();

                    System.out.println(a + " - " + b + " = " + (a-b));
                    break;
                case 3:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();

                    System.out.println(a + " * " + b + " = " + (a*b));
                    break;
                case 4:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    if(b!=0)
                    System.out.println(a + " / " + b + " = " + (a/b));
                    else
                        System.out.println("b = 0? 🤨");
                    break;
                case 5:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    if(b!=0)
                        System.out.println(a + " este egal cu "  +String.format ("%.2f",(a/b)*100) + "% din " + b );
                    else
                        System.out.println("b = 0? 🤨");
                    break;
                case 6:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    if(b!=0)
                        System.out.println(a + " % "  + b + " = " + a%b + " (restul impartirii)" );
                    else
                        System.out.println("b = 0? 🤨");
                    break;
                case 7:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();

                    System.out.println(a + " la puterea "  + b + " = " + Math.pow(a,b) + " (ridicarea la putere)" );

                    break;
                case 8:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.println("radical din " + a + " = " + Math.sqrt(a));
                    break;
                case 9:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println((b/100)*a + " reprezinta " + a + "% din " + b);
                case 0:
                    menu = false;
                    break;
                default:
                    System.out.println("NU ESTE ASA OPTIUNE!");
                    break;

            }

        }


    }
}
