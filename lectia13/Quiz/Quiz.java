package BotanicaDuminica1.lectia13.Quiz;

import java.io.File;
import java.util.Scanner;

public class Quiz {
    static void main(String[] args) {
        boolean menu = true;
        String [][]Questions = readQuestions();
        Scanner input = new Scanner(System.in);
        int nr;
        while (menu){
            System.out.println("Cate intrebari doriti sa aveti in test?(max 200)");
            nr = input.nextInt();
            int []indexes = generateQuestions(nr);
            int score = 0;
            for (int i=0; i<nr; i++){
                System.out.println("======================");
                System.out.println(Questions[indexes[i]][0]);
                System.out.println("1)" +Questions[indexes[i]][1]);
                System.out.println("2)" +Questions[indexes[i]][2]);
                System.out.println("3)" +Questions[indexes[i]][3]);
                System.out.println("4)" +Questions[indexes[i]][4]);
                System.out.println("======================");
                System.out.println("Care este varianta corecta? 1/2/3/4");
                String answer = input.next();
                if(answer.equals(Questions[indexes[i]][5])){
                    System.out.println("Corect!");
                    score++;
                }else{
                    System.out.println("POZOR!!!!");
                }
            }
            System.out.println("Scorul acumulat: "+ score +"/"+nr);
            System.out.println("Mai jucam odata? da/nu");
            String newGame = input.next();
            if(newGame.equalsIgnoreCase("nu")){
                menu = false;
            }


        }

    }

    public static int[] generateQuestions(int nr){
        int []indexes = new int[nr];
        for(int i=0; i<nr; i++) {
            int randomNum = (int) (Math.random() * 201);
            indexes[i] = randomNum;
        }
        return indexes;
    }
    public static String[][] readQuestions(){
        String [][]Questions = new String[200][6];
        String path = "src/BotanicaDuminica1/lectia13/Quiz/intrebari.txt";
        try{
            Scanner fin = new Scanner(new File(path));

            for(int i=0; i<200; i++){
                Questions[i][0]=fin.nextLine();//intrebarea
                Questions[i][1]=fin.nextLine();//varinata 1
                Questions[i][2]=fin.nextLine();//varinata 2
                Questions[i][3]=fin.nextLine();//varinata 3
                Questions[i][4]=fin.nextLine();//varinata 4
                Questions[i][5]=fin.nextLine();//raspus corect
                fin.nextLine();
            }

        }catch (Exception e){
            System.out.println("Error!");
        }
        return Questions;
    }
}
