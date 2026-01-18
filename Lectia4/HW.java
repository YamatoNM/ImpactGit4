package BotanicaDuminica1.Lectia4;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner pupsik = new Scanner(System.in);
        System.out.println("Un numar por favor: ");
        int x = pupsik.nextInt();


        if(x > 0){
            System.out.println("Pozitiv");
        }else if(x < 0){
            System.out.println("Negativ");
        }else {
            System.out.println("Numarul este 0 ");
        }

        System.out.print("Nota: ");
        int nota = pupsik.nextInt();

        String calificativ = (nota==10  || nota == 9) ? "Foarte bine":
                             (nota==8   || nota == 7)  ? "Bine":
                             ( nota== 6 || nota == 5) ? "Suficient":
                             (x>0 || x<5) ? "Mai incearca":
                                     "Nu este o nota";

        System.out.println(calificativ);

        System.out.println("Introduceti ziua (1-7):");
        int zi = pupsik.nextInt();

        switch (zi){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Nu este o zi a saptamanii");
                break;


        }

    }
}
