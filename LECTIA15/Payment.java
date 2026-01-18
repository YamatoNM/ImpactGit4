package BotanicaDuminica1.LECTIA15;

public interface Payment {
    void processPayment(double amount);
}

interface Reciept{
    void giveReciept();
}
class CashPayment implements Payment,Reciept{
    @Override
    public void processPayment(double a){
        System.out.println(a + "$ paid by Cash");
    }

    @Override
    public void giveReciept() {

    }
}
class CardPayment implements Payment{
    @Override
    public void processPayment(double a){
        System.out.println(a + "$ paid by Card");
    }
}