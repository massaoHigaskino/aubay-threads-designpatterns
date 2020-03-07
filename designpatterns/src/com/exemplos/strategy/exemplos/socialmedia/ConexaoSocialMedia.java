package com.exemplos.strategy.exemplos.socialmedia;

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

    public void publicar(String conteudo, EnumSocialMedia socialMedia) {
        switch (socialMedia) {
            case TIKTOK:
                System.out.println("Publicar TikTok - "+conteudo);
                break;
            case FACEBOOK:
                System.out.println("Publicar Facebook - "+conteudo);
                break;
            case TWITTER:
                System.out.println("Publicar Twitter - "+conteudo);
                break;
            case INSTAGRAM:
                System.out.println("Publicar Instagram - "+conteudo);
                break;
        }
    }

}

enum EnumSocialMedia {
    FACEBOOK, TWITTER, INSTAGRAM, TIKTOK
}