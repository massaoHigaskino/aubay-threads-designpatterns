package factoryimproved.handson;

public class MBWay implements  Pagamento {

    @Override
    public void pagar() {
        System.out.println("Realizar pagamento com MBWay");
    }
}
