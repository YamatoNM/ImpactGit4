package BotanicaDuminica1.Lectia5;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 50){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

         i = 0;
        while(i <=50){
            System.out.print(i + " ");
            i+=2;
        }


        Scanner input = new Scanner(System.in);
        int x;

        do{
            System.out.println("Introdu numarul");
            x = input.nextInt();
        }while(x!=0);


    for(int y = 0; y<=10; y++){
        if(y==5)
            continue;
        System.out.println(y);
    }
}
 }