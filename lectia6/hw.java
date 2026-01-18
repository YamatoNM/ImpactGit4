package BotanicaDuminica1.lectia6;

public class hw {
    public static void main(String[] args) {

        double result = factorial(7);
        System.out.println(result);

        double result2 = sumaNumerelor(7);
        System.out.println(result2);
    }

    public static double factorial(double num) {
        if (num == 2)
            return 2;
        else
            return num * factorial(num - 1);
    }

    public static double sumaNumerelor(double num) {
        if (num == 1)
            return 1;
        else
            return num + sumaNumerelor(num - 1);

    }
}
