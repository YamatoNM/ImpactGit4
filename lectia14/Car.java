package BotanicaDuminica1.lectia14;

public class Car {
    String marca;
    String model;
    String culoare;
    String tipCaroserie;
    double capacitateMotor;
    int nrCilindri;
    private double pretPerZi;

    public double getPretPerZi() {
        return pretPerZi;
    }

    public void setPretPerZi(double pretPerZi) {
        if(pretPerZi>25) {
            this.pretPerZi = pretPerZi;
        }
    }

    public Car(){}

    public Car(String marca, String model, String culoare, String tipCaroserie, double capacitateMotor, int nrCilindri, double pretPerZi) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.tipCaroserie = tipCaroserie;
        this.capacitateMotor = capacitateMotor;
        this.nrCilindri = nrCilindri;
        this.pretPerZi = pretPerZi;
    }

    public void showInfo(){
        System.out.println("Aceasta este un " + tipCaroserie + " " + marca  + " " + model
        + " de culaorea " + culoare + "\n cu un motor de " + capacitateMotor
        + " cm3, cu " + nrCilindri + "\n cilindri, la pretul incepand cu  " + pretPerZi + " pe zi");
    }

    public double calculPret(int nrZile){
        if(nrZile > 0){
            if (nrZile<5){
                return pretPerZi*nrZile;
            }
            else if (nrZile>=5 & nrZile<10){
                return (pretPerZi*nrZile)*0.9;
            }
            else if (nrZile>=10 & nrZile<=30){
                return (pretPerZi*nrZile)*0.8;
            }
        }

            System.out.println("Nr de zile trebuie sa fie mai mare de 0 si mai mic ca 30");
            return 0;

    }
}
