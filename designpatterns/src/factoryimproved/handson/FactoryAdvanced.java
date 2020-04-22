package factoryimproved.handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class FactoryAdvanced {
    public static void main(String[] args) {
        FactoryDynamic2.factory("paypal").pagar();
    }
}


class FactoryDynamic2 {
    private static final Map<String, Supplier<Pagamento>> tiposRegistrados = new HashMap<>();

    static {
        tiposRegistrados.put("mbway", MBWay::new);
        tiposRegistrados.put("paypal", PayPal::new);
        tiposRegistrados.put("cartao", Cartao::new);
    }

    public static void registrar(String tipo, Supplier<Pagamento> clazz) {
        tiposRegistrados.put(tipo, clazz);
    }

    public static Pagamento factory(String tipo) {
        Supplier<Pagamento> supplierPagamento =  tiposRegistrados.get(tipo);
        if(Objects.nonNull(supplierPagamento)) {
            return supplierPagamento.get();
        }
        return null;
    }

}