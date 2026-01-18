package BotanicaDuminica1.Lectia11;

import java.util.Scanner;

public class HW {
    static void main(String[] args) {
        int[][] a = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("1 - Introducere de la tastatura / 2 - default values");

        int option = input.nextInt();
        if (option == 1) {
            //tablou bidimensional 3x3 (fara valor)
            //Citirea (Introducerea) valorilor de la tastatura
            for (int i = 0; i < a.length; i++) { //a.length = numarul de randuri din matrice
                for (int j = 0; j < a[i].length; j++) {//a[i].length = numarul de elemente pe coloana i
                    System.out.print("a[" + i + "][" + j + "]=");
                    a[i][j] = input.nextInt();
                }
                System.out.println();
            }
        } else {
            a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        }


        for (int[] rand : a) {//pentru fiecare rand din matrice
            for (int element : rand) {//pentru fiecare element din rand
                System.out.print(element + " ");
            }
            System.out.println();
        }


        int sumaDiagonala = 0;

        for (int i = 0; i < a.length; i++) { //a.length = numarul de randuri din matrice
            for (int j = 0; j < a[i].length; j++) {//a[i].length = numarul de elemente pe coloana i
                if (i == j) {
                    sumaDiagonala += a[i][j];
                }
            }
            System.out.println("Suma elementelor pe diagonala principala " + sumaDiagonala);
            sumaDiagonala = 0;
            for (int j = 0; j < a.length; j++) {
                sumaDiagonala += a[j][j];

            }

            System.out.println("Suma elementelor pe diagonala principala " + sumaDiagonala);
        }

        boolean simetric = true;

        for (int i = 0; i < a.length; i++) { //a.length = numarul de randuri din matrice
            for (int j = 0; j < a[i].length; j++) {//a[i].length = numarul de elemente pe coloana i
                if (a[i][j] != a[j][i]) {
                    simetric = false;
                    break;
                }
            }
        }
        if (simetric) {
            System.out.println("Simetric - sigma!");
        } else {
            System.out.println("Non-simetric🤡");
        }

        int sumaPerRand = 0;
        for (int i = 0; i < a.length; i++) { //a.length = numarul de randuri din matrice
            sumaPerRand = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumaPerRand += a[i][j];
            }
            System.out.println("Suma pe randul " + i + " = " + sumaPerRand);

        }
    }
}

