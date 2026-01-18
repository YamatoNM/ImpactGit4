package BotanicaDuminica1.Lectia11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QUIZ {
    static void main(String[] args) {




    }
    public static String[][] readFile(){
        String[][] questions = new String[100][100];
        int i =0;
        try {
            Scanner fin = new Scanner(new File("src/BotanicaDuminica1/Lectia11/questions.txt"));
            while (fin.hasNextLine()){
                fin.next();
//                questions[i][0] = fin;

            }

        }catch (FileNotFoundException e){
            System.out.println("File data.txt was not found!");
        }
            catch (IOException e){
            System.out.println("Input/Output Exception");
        }
            catch (Exception e){
            System.out.println("Unknown error!");
        }
        return questions;


    }
}
