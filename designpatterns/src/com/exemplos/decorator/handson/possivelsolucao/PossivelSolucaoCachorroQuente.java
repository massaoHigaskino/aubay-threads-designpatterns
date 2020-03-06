package com.exemplos.decorator.handson.possivelsolucao;

public class PossivelSolucaoCachorroQuente {
    public static void main(String[] args) {
        CachorroQuente basico = new CachorroQuenteBasico();
        basico.montar();

        CachorroQuente comTudo = new CachorroQuenteComTudo(new CachorroQuenteBasico());
        comTudo.montar();

        CachorroQuente gourmet = new CachorroQuenteGourmet(new CachorroQuenteComTudo(new CachorroQuenteBasico()));
        gourmet.montar();

    }
}


interface CachorroQuente {
    void montar();
}

class CachorroQuenteBasico implements CachorroQuente {

    @Override
    public void montar() {
        System.out.println("Cachorro quente básico.");
    }
}

class CachorroQuenteComTudo extends CachorroQuenteDecorator {

    public CachorroQuenteComTudo(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    @Override
    public void montar() {
        System.out.println("Cachorro quente com tudo que tenho direito.");
    }
}

class CachorroQuenteGourmet extends CachorroQuenteDecorator {

    public CachorroQuenteGourmet(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    @Override
    public void montar() {
        System.out.println("Cachorro quente gourmetizado.");
    }
}

class CachorroQuenteDecorator implements CachorroQuente {

    protected CachorroQuente cachorroQuente;

    public CachorroQuenteDecorator(CachorroQuente cachorroQuente) {
        this.cachorroQuente = cachorroQuente;
    }

    @Override
    public void montar() {
        cachorroQuente.montar();
    }
}