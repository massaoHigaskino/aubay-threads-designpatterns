package com.exemplos.strategy.exemplos.socialmedia;

import java.util.EnumMap;
import java.util.Map;

/*
    Objetivo: Aplique o pattern Strategy e simplifique o código
 */
public class ConexaoSocialMedia {

    public static void main(String[] args) {
        String conteudo = "Pipoco do Trovão!!!";
        for(EnumSocialMedia socialMediaValues : EnumSocialMedia.values()) {
            EnviaPost enviaPost = new EnviaPost();
            enviaPost.publicar(conteudo, socialMediaValues);
        }
    }
}

class EnviaPost {

    public static final Map<EnumSocialMedia, IPublish> PUBLISHER_MAP;
    public static final IPublish PUBLISHER_DEFAULT = new DefaultImpl();

    static {
        PUBLISHER_MAP = new EnumMap<>(EnumSocialMedia.class);
        PUBLISHER_MAP.put(EnumSocialMedia.FACEBOOK, new FacebookImpl());
        PUBLISHER_MAP.put(EnumSocialMedia.TWITTER, new TwitterImpl());
        PUBLISHER_MAP.put(EnumSocialMedia.INSTAGRAM, new InstagramImpl());
        PUBLISHER_MAP.put(EnumSocialMedia.TIKTOK, new TiktokImpl());
    }

    public void publicar(String conteudo, EnumSocialMedia socialMedia) {
        PUBLISHER_MAP.getOrDefault(socialMedia, PUBLISHER_DEFAULT).publicar(conteudo);
    }

}

enum EnumSocialMedia {
    FACEBOOK, TWITTER, INSTAGRAM, TIKTOK
}

interface IPublish {
    void publicar(String conteudo);
}

class DefaultImpl implements IPublish {
    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicar NULL - "+conteudo);
    }
}

class FacebookImpl implements IPublish {
    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicar Facebook - "+conteudo);
    }
}

class TwitterImpl implements IPublish {
    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicar Twitter - "+conteudo);
    }
}

class InstagramImpl implements IPublish {
    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicar Instagram - "+conteudo);
    }
}

class TiktokImpl implements IPublish {
    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicar Tiktok - "+conteudo);
    }
}

