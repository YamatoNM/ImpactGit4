package BotanicaDuminica1.lectia7;

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "saranciuc";
        word = word.toLowerCase();
        String hiddenWord = "_".repeat(word.length());
        int tries = 0;
        boolean found = false;

        System.out.println("=== Поле Чудес ===");
        System.out.println("С вами Леонид Якубович");
        System.out.println("Cuvantul are " + word.length());

        while (!found){
            System.out.println("Крутите барабан!");
            System.out.print("Introduceti o litera = ");

            char guess = Character.toLowerCase(input.next().charAt(0));

            StringBuilder newHidden = new StringBuilder(hiddenWord);
            boolean correct = false;

            for(int letter = 0; letter < word.length(); letter++){
                if(word.charAt(letter) == guess){

                    newHidden.setCharAt(letter, guess);
                    correct = true;
                }
            }
            if(correct){
                hiddenWord = newHidden.toString();
                System.out.println("Correct \n word: " + hiddenWord);
            }else{
                System.out.println("Wrong!");
            }
            if(hiddenWord.equals(word)){
                System.out.println("Победитель, Победитель, Победитель!!!");
                System.out.println("It took you");
                found = true;
            }

        }


    }
}
