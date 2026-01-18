package BotanicaDuminica1.Lectia8;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        String[] produse = {"Lapte", "Oua", "Paine",
                "Cascaval", "Carne", "Vin",
                "Si o bere, va rog frumos mama a zis ca se poate"};

        System.out.println(produse[0]);//Primul element
        System.out.println(produse[6]);
        System.out.println(produse[produse.length - 1]);//Utlimul element
        System.out.println("Tabloul are " + produse.length + " elemente");

        produse[produse.length - 1] = "Inca un lapte :(";//Modificarea valorii

        for(int i = 0; i<produse.length; i++){
            System.out.println(produse[i]);
            String word = produse[i];
            for(int y = 0; y<word.length(); y++){
                System.out.println(word.charAt(y));
            }
        }
        for(int i = 0; i<produse.length; i++){
            System.out.println(produse[i]);
            for(int y = 0; y<produse[i].length(); y++){
                System.out.println(produse[i].charAt(y));
            }
        }
        int[] note = new int[11];//crearea unei liste goale, cu 11 elemente

        note[0] = 9;
        System.out.println(note[10]);
        Random random = new Random();

        int suma = 0;

        for(int i =0; i<note.length; i++){
            note[i] = random.nextInt(4, 11);//[4;11)
            suma += note[i];
        }

        for(int i =0; i<note.length; i++){
            System.out.print(note[i] + " ");
        }
        System.out.println();
        System.out.println("Suma notelor este:" + suma);
        System.out.println("Media aritemtica: " + (double) suma/note.length);

        int min = 100;
        int max = 4;

        for(int i = 0; i<note.length; i++){
            if(note[i] < min) min = note[i];
            if(note[i] > max) max = note[i];
        }


        for(int i = 0; i<note.length; i++){
            for(int y = 0; y< note.length - i - 1; y++){
                if(note[y] > note[y + 1]){
                    int temp = note[y];
                    note[y] = note[y+1];
                    note[y+1] = temp;

                    for(int nota: note){
                        System.out.print(nota + " ");

                    }
                    System.out.println();
                }

            }
        }

        for(String produs: produse){
            if(produs.equalsIgnoreCase("Bere") ||
                    produs.equalsIgnoreCase("Vin")){
                for(int nota: note){
                    if(nota == 4){
                        System.out.println("Nu se poate!");
                    }
                }
            }
        }


    }
}
