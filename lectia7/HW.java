package BotanicaDuminica1.lectia7;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x=");
        int x = input.nextInt();

        int sumaPrime = 1;
       for(int i =2; i<=x; i++) {
           int counter = 0;

           for (int d = 1; d <= i; d++) {
               if (i % d == 0) {
                   counter++;
               }
           }
           if (counter == 2) {
               sumaPrime *= i;
               System.out.println(i + "- Numar prim");
           }
       }
        System.out.println("SumaPrime " + sumaPrime);

    }
}
