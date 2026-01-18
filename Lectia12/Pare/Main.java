package BotanicaDuminica1.Lectia12.Pare;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {
    static void main(String[] args) {
        try {
            Scanner fin = new Scanner(new File("src/BotanicaDuminica1/Lectia12/Pare/date.txt"));
            FileWriter fout = new FileWriter("src/BotanicaDuminica1/Lectia12/Pare/rezultat.txt");

            int x;

            while (fin.hasNextLine()){
                if (fin.hasNextInt()){
                    x = fin.nextInt();

                    if(x==10){
                        fout.write("10 se afla in date.txt");
                    }

                }
            }

            fin.close();
            fout.close();

        }catch (FileNotFoundException e){
            System.out.println("File data.txt was not found!");
        }
        catch (IOException e){
            System.out.println("Input/Output Exception");
        }
        catch (Exception e){
            System.out.println("Unknown error!");
        }



    }
}

