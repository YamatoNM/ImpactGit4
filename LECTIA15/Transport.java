package BotanicaDuminica1.LECTIA15;

public abstract class Transport {
    abstract void move();

     abstract void fuelUp();
}

class Car extends Transport{

    String color;
    @Override
    void move(){
        System.out.println("This is a car so it rides on the road.");
    }

    @Override
    void fuelUp(){
        System.out.println("It`s a car and it usually use Petrol/Disel");
    }

}

class Airplane extends Transport{

    @Override
    void move() {
        System.out.println("Its an airplane so it flyes in the skies");
    }

    @Override
    void fuelUp() {
        System.out.println("Airplanes use kerosen to fuel up");
    }
}