package BotanicaDuminica1.lectia13.HOMEWORK;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class HW {
    static void main(String[] args) {
        try{
            Scanner fin = new Scanner(new File("src/BotanicaDuminica1/lectia13/HOMEWORK/Note.txt"));
            FileWriter fout = new FileWriter("src/BotanicaDuminica1/lectia13/HOMEWORK/message.txt");

            fout.write("Salut, am învățat să lucrez cu fișiere în Java!");

            fout.close();


            int suma = 0;
            int nr = 0;
            int x;
            FileWriter fout2 = new FileWriter("src/BotanicaDuminica1/lectia13/HOMEWORK/coppiedFile.txt");

            while (fin.hasNextLine()){
                x = fin.nextInt();//citim numarul din fisier
                suma += x;//adaugam numarul citit in variabila suma
                fout2.write(x + " ");//adaugam numarul in alt fisier
                nr++;

            }
            fout2.close();
            fin.close();
            System.out.println("Numarul de note = " + nr);
            System.out.println("Media notelor = "+ (double)suma/nr);

        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}
