package factoryimproved.examples.moeda;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/*
    Aplique o pattern Factory Method para a conversão
 */
public class Moeda {

    public static final Map<String, Supplier<Conversao>> conversaoFactoryMap = new HashMap<>(3);

    static {
        conversaoFactoryMap.put(Dolar.class.getName(), Dolar::new);
        conversaoFactoryMap.put(Real.class.getName(), Real::new);
    }

    public static void main(String[] args) {
        System.out.println(build("JAVA").map(conversao -> conversao.converter(BigDecimal.TEN)).orElse(null));
    }

    public static Optional<Conversao> build(String key) {
        return Optional.ofNullable(conversaoFactoryMap.get(key)).map(Supplier::get);
    }
}

interface Conversao {
    String converter(BigDecimal valor);
}

class Dolar implements Conversao {

    @Override
    public String converter(BigDecimal valor) {
        return "$ "+valor;
    }
}

class Real implements Conversao {

    @Override
    public String converter(BigDecimal valor) {
        return "R$ "+valor;
    }
}