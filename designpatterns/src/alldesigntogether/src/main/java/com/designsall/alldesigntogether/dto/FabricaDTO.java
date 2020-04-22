package com.designsall.alldesigntogether.dto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FabricaDTO {
    private static final Map<String, Class> DTO_FACTORY_MAP;
    static {
        Map<String, Class> factoryMapInit = new HashMap<>(5);
        factoryMapInit.put("Estabelecimento",EstabelecimentoDTO.class);
        factoryMapInit.put("Informacoes",InformacoesDTO.class);
        factoryMapInit.put("Login",LoginDTO.class);
        factoryMapInit.put("Produto",ProdutoDTO.class);
        factoryMapInit.put("Token",TokenDto.class);
        DTO_FACTORY_MAP = Collections.unmodifiableMap(factoryMapInit);
    }
    public static Object createDTO(String key) {
        return Optional.ofNullable(DTO_FACTORY_MAP.get(key))
                .map(Class::getDeclaredConstructors)
                .map(constructors -> constructors[0])
                .map(constructor -> {
                    try {
                        return constructor.newInstance();
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        return null;
                    }
                })
                .orElse(null);
    }
}
