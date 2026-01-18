package BotanicaDuminica1.lectia7;

public class Strings {
    public static void main(String[] args) {
        String nume = "Gheorghe Creciunel";
        String adresa = "Bd. Dacia 23 etaj 3 oficiu 32 class 4 👍";
        String adresa2 = "Bd. Stefan cel mare 123 etaj 3 oficiu 32 class 4 👍";
        System.out.println(nume);
        System.out.println("Length name =" + nume.length());//Afisarea lungimii unui sir
        System.out.println("Primul simbol (caracter)= " + nume.charAt(0));
        System.out.println("Ultimul simbol (caracter)= " + nume.charAt(17));
        System.out.println("Ultimul simbol (caracter)= " + adresa.charAt(adresa.length()-1));

        System.out.println("Substring nume(0,8) "+ nume.substring(0,8));
        System.out.println("Substring nume(8,18) "+ nume.substring(9,18));
        System.out.println("Substring nume(9) "+ nume.substring(9));

        System.out.println("Gheorghe Creciunel".equals(nume)); // "Gheorghe Creciunel" == nume
        System.out.println("gheorghe creciunel".equals(nume.toLowerCase()));
        System.out.println(adresa.toUpperCase());
        System.out.println(adresa.toLowerCase());
        System.out.println(adresa);
        System.out.println("gHEoRGhE CrEcIunEl".equalsIgnoreCase(nume));
        System.out.println("My function " + equalsIgnoreCase(nume, "gHEoRGhE CrEcIunEl"));


        adresa= adresa.replace("Dacia", "Miami");
        System.out.println(adresa);

        System.out.println(adresa.indexOf("class"));
        System.out.println(adresa.indexOf("etaj"));
        System.out.println(adresa.indexOf("oficiu"));
        System.out.println(adresa.substring(adresa.indexOf("class")));
        System.out.println(adresa2.substring(adresa2.indexOf("etaj"),adresa2.indexOf("oficiu")));

    }


    public static boolean equalsIgnoreCase(String a, String b){
        return a.toLowerCase().equals(b.toLowerCase());
    }
}
