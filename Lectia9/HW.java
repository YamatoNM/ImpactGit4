package BotanicaDuminica1.Lectia9;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {

        int[] v = CitireVector();

        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while(menu){
            System.out.println("1. Introducere vector");
            System.out.println("2. Afisare vector");
            System.out.println("3. Suma Elementelor");
            System.out.println("4. Valoarea Maxima");
            System.out.println("5. Valoarea Minima");
            System.out.println("6. Cauta element in vector");
            System.out.println("7. Exit");
            System.out.print("\tOption= ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    v = CitireVector();
                    break;
                case 2:
                    AfisareVector(v);
                    break;
                case 3:
                    int suma = SumaVector(v);
                    System.out.println("Suma elementelor vectorului:" + suma);
                    break;
                case 4:
                    System.out.println("valoarea maxima din vector:" + maxvalue(v));
                    break;
                case 5:
                    System.out.println("valoarea minima din vector:" + minvalue(v));
                    break;
                case 6:
                    if(foundElement(v)) {
                        System.out.println("elementul a fost gasit!");
                    }else {
                        System.out.println("nu exista acest elemet in vector");
                    }
                    break;
                case 7:
                    menu = false;
                    break;
            }
        }


    }

    public static int[] CitireVector() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti nr de elemente din vector\n n= ");
        int n = input.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("v[" + i + "]=");
            v[i] = input.nextInt();
        }
        return v;
    }

    public static void AfisareVector(int[] v){

        for(int i=0; i<v.length; i++){
            System.out.println("v[" + i + "]=" + v[i]);

        }
    }

    public static int SumaVector(int[] v){
        int suma = 0;
        for(int element: v){

            suma += element;
        }
        return suma;
    }

    public static int maxvalue(int []v){
        int max = v[0];
        for(int element: v){
            if(element>max){
                max = element;
            }
        }
        return max;
    }

    public static int minvalue(int []v){
        int min = v[0];
        for(int element: v){
            if(element<min){
                min = element;
            }
        }
        return min;
    }

    public static boolean foundElement(int []v){
        System.out.print("introdu nr care doresti sa il cauti");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int element:v){
            if(element == n){
                return true;
            }
        }
        return false;
    }
    //a doua varianta pentru a cauta nr:
    public static boolean foundElement(int []v, int x){
        for(int element: v){
            if(element==x){
                return true;
            }
        }
        return false;
    }




}