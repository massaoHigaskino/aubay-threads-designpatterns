package factoryimproved.handson;

public class Cartao implements  Pagamento {

    @Override
    public void pagar() {
        System.out.println("Realizar pagamento com cartão");
    }
}