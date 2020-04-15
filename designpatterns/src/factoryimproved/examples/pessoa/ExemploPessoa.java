package factoryimproved.examples.pessoa;

import java.math.BigDecimal;

/*
    Refatore o código para o FactoryMethod
 */
public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new PessoaSingular();
        pessoa.pagarImpostos(BigDecimal.ONE);
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
