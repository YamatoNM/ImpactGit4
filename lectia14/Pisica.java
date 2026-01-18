package BotanicaDuminica1.lectia14;

public class Pisica extends Animal{
    boolean domestic = true;
    String rasa;
    String nume;

    @Override
    void mananca(){
        System.out.println("Eu sunt pisica, sunt animal carniovor");
    }
}
