package BotanicaDuminica1.LECTIA15;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Car c1 = new Car();

        c1.fuelUp();
        c1.move();

        Airplane a1 = new Airplane();

        a1.fuelUp();
        a1.move();

        Transport t1 = new Car();
        t1.fuelUp();
        t1.move();

        c1.color = "";
//        t1.color;


        CashPayment cp1 = new CashPayment();
        cp1.processPayment(100);

        Payment p1 = new CardPayment();
        p1.processPayment(88.99);


        List<String> fructs = new ArrayList<>();

        fructs.add("Kiwi");
        fructs.add("Mango");
        fructs.add("Apple");
        fructs.add("Banana");

        fructs.add(1,"Orange");
        fructs.addFirst("Grapes");

        System.out.println(fructs);

        fructs.remove(2);
        fructs.remove("Apple");
        System.out.println(fructs.get(2));


        Set<String> cities = new HashSet<>();
        cities.add("Chisinau");
        cities.add("Balti");
        cities.add("Orhei");
        cities.add("Ungheni");
        cities.add("Stefan-Voda");
        cities.add("Ungheni");

        System.out.println(cities);

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Andrei");
        students.put(2, "Ion");
        students.put(3, "Daniel");
        students.put(4, "Eugen");
        System.out.println(students);

        Map<String, Double> noteleLuiMario = new HashMap<>();
        noteleLuiMario.put("Mate", 9.2);
        noteleLuiMario.put("Romana", 8.12);
        noteleLuiMario.put("Engleza", 9.87);

        Map<String, Double> noteleLuiEugen = new HashMap<>();
        noteleLuiEugen.put("Mate", 10.0);
        noteleLuiEugen.put("Romana", 7.87);
        noteleLuiEugen.put("Engleza", 10.00);


        List<Map> noteElevi = new ArrayList<>();
        noteElevi.add(noteleLuiMario);
        noteElevi.add(noteleLuiEugen);

        System.out.println(noteElevi.get(1));


        List list = new ArrayList();
        list.add("aaa");
        list.add(123);

        System.out.println(list);







    }
}
