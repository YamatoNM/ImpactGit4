package BotanicaDuminica1.lectia14;

public class Main {
    static void main(String[] args) {
        Car car1 = new Car();
        car1.marca = "koenigsegg";
        car1.model = "agera";
        car1.capacitateMotor = 5000;
        car1.culoare = "Black";
        car1.nrCilindri = 8;
        car1.tipCaroserie = "Sport-Car";
        car1.setPretPerZi(180);

        car1.showInfo();

        Car car2 = new Car("Audi", "A4", "white",
                "sedan", 2300, 4, 50);

        car2.showInfo();
        System.out.println(" pret pe 12 zile va fi " + car2.calculPret(12) + "💶");

        Car[] cars = {
                new Car("Audi", "A4", "white", "sedan", 2300, 4, 50),
                new Car("BMW", "320i", "black", "sedan", 2200, 4, 55),
                new Car("Mercedes-Benz", "C200", "silver", "sedan", 2100, 4, 60),
                new Car("Volkswagen", "Passat", "blue", "sedan", 2000, 4, 70),
                new Car("Toyota", "Corolla", "red", "sedan", 1800, 4, 45),
                new Car("Honda", "Civic", "gray", "sedan", 1900, 4, 47),
                new Car("Ford", "Focus", "white", "hatchback", 1700, 4, 52),
                new Car("Hyundai", "Elantra", "black", "sedan", 1600, 4, 50),
                new Car("Mazda", "6", "dark blue", "sedan", 2500, 4, 62),
                new Car("Skoda", "Octavia", "green", "liftback", 2000, 4, 55)
        };

        for(Car c: cars){
            c.showInfo();
            System.out.println();
        }


        Pisica p1 = new Pisica();

        p1.clasa = "Mammalia";
        p1.culoare = "gray";
        p1.vertebrat = true;
        p1.domestic = true;
        p1.nrPicioare = 4;
        p1.nume = "Kuzea";
        p1.increngatura = "Chordata";
        p1.rasa = "British";
        p1.mananca();
        p1.respira();

    }
}
