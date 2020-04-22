package factoryimproved.handson;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class FactoryIntermediate {
    public static void main(String[] args) {
        FactoryDynamic.factory("mbway").pagar();
    }
}


class FactoryDynamic {
    private static final Map<String, Class<? extends Pagamento>> tiposRegistrados = new HashMap<>();

    static {
        tiposRegistrados.put("mbway", MBWay.class);
        tiposRegistrados.put("paypal", PayPal.class);
        tiposRegistrados.put("cartao", Cartao.class);
    }

    public static void registrar(String tipo, Class<? extends Pagamento> clazz) {
        tiposRegistrados.put(tipo, clazz);
    }

    public static Pagamento factory(String tipo) {
        Class<?> clazz = tiposRegistrados.get(tipo);
        try {
            Constructor construtor = clazz.getDeclaredConstructor(new Class[] {});
            return (Pagamento) construtor.newInstance(new Object[]{});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}