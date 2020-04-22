package factoryimproved.examples.pessoa;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/*
    Refatore o código para o FactoryMethod
 */
public class ExemploPessoa {

    public static final Map<String, Supplier<Pessoa>> pessoaFactoryMap = new HashMap<>(3);

    static {
        pessoaFactoryMap.put(PessoaJuridica.class.getName(), PessoaJuridica::new);
        pessoaFactoryMap.put(PessoaFisica.class.getName(), PessoaFisica::new);
        pessoaFactoryMap.put(PessoaSingular.class.getName(), PessoaSingular::new);
    }

    public static void main(String[] args) {
        build(PessoaFisica.class.getName()).ifPresent(pessoa -> pessoa.pagarImpostos(BigDecimal.ONE));
    }

    public static Optional<Pessoa> build(String key) {
        return Optional.ofNullable(pessoaFactoryMap.get(key)).map(Supplier::get);
    }
}

interface Pessoa {
    void pagarImpostos(BigDecimal imposto);
}

class PessoaJuridica implements Pessoa {
    @Override
    public void pagarImpostos(BigDecimal imposto) {
        System.out.println("Pagando imposto como Pessoa Jurídica");
    }
}

class PessoaFisica implements Pessoa {
    @Override
    public void pagarImpostos(BigDecimal imposto) {
        System.out.println("Pagando imposto como Pessoa Física");
    }
}

class PessoaSingular implements Pessoa {
    @Override
    public void pagarImpostos(BigDecimal imposto) {
        System.out.println("Pagando imposto como Pessoa Singular");
    }
}
