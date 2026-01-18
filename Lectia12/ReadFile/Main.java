package BotanicaDuminica1.Lectia12.ReadFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {
    static void main(String[] args) {
        try {
            Scanner fin = new Scanner(new File("src/BotanicaDuminica1/Lectia12/ReadFile/data.txt"));
            FileWriter fout = new FileWriter("src/BotanicaDuminica1/Lectia12/ReadFile/output.txt");
            int n,x, sum = 0;

            n = fin.nextInt(); //n-numarul de elemente
            for(int i=0; i<n; i++){
                x = fin.nextInt();
                sum += x;
            }
            System.out.println("Suma = " + sum);
            fout.write("Suma elementelor din data.txt: " + sum);
            fout.write("Media numerelor: "+ (double)sum/n);

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

