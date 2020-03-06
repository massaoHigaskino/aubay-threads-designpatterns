package com.exemplos.decorator.handson;

public class DecoratorMain {
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

class CachorroQuenteComTudo implements CachorroQuente {

    @Override
    public void montar() {
        System.out.println("Cachorro quente com tudo que tenho direito.");
    }
}

class CachorroQuenteGourmet implements CachorroQuente {

    @Override
    public void montar() {
        System.out.println("Cachorro quente gourmetizado.");
    }
}