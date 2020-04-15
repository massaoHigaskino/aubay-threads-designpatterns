package factoryimproved.handson;

public class FactoryBasic {
    public static void main(String[] args) {
        FactoryPagamento.factory("mbway").pagar();
    }
}

class FactoryPagamento {
    public static Pagamento factory(String tipo) {
        if(tipo.equals("cartao")) {
            return new Cartao();
        }

        if(tipo.equals("mbway")) {
            return new MBWay();
        }

        if(tipo.equals("paypal")) {
            return new PayPal();
        }
        return null;
    }
}