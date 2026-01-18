package BotanicaDuminica1.lectia6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        divizori(100);

        Scanner input = new Scanner(System.in);
        int suma = 0;
        System.out.println("introduceti un numar : ");
        int num = input.nextInt();
        for(int x = 2; x <= num; x++) {

            if (estePrim(x)) {
                suma = suma + x;
                System.out.println(x + " este prim");
            }
        }

    }

    public static void divizori(int num){
        int contor = 0;
        for(int i = 1; i<=num; i++){
            if(num % i == 0) {
                contor++;
                System.out.print(i + " ");
            }
        }
        if (contor == 2){
            System.out.println(" numar prim");
        }else{
            System.out.println("nu este numar prim");
        }
    }
    public static boolean estePrim(int num){
        if(num<2)
            return false;

        for (int div = 2; div * div <= num; div++){
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }
}
