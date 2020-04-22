package factoryimproved.handson;

public class PayPal implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Realizar pagamento com PayPal");
    }
}