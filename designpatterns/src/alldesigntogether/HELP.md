# Vamos lá

### Template Method
Percebam que nós temos duas classes *Handler: ProdutoHandler e EstablecimentoHandler, certo? Precisamos que estas duas classes realizem a validação do token. Sim, para cada requisição que chegar, vamos validar se o token para aquele utilizador é válido. Para isso, aplique o pattern Template Method utilizando a classe BaseHandler. Uma outra possível solução seria criando uma anotação, por exemplo Secured e interceptando as requisições e realizando a validação antes da requisição sequer chegar no endpoint.

### Decorator

### Factory Method

### Builder
Poxa, o DTO InformacoesDTO possui muitos campos e ficar setando atributos com Get/Set às vezes é tão chato. Podemos criar um Builder para essa classe. Lembrem-se que podemos usar com classes estáticas, ou com o GenericBuilder ou usar o Lombok.

### Singleton
Temos em nossa API um endpoint que retorna as informações de sistema o StatusHandler. Vejam que a implementação sempre busca as propriedades de sistema e elas sempre serão as mesmas, desde que não reinicie a VM. Essa classe que carrega as propriedades de sistema é uma excelente candidata a virar um Singleton. Uma outra possível solução seria transformar isso em um cache ou transformar num Bean de escopo de aplicação como por exemplo um @ApplicationScope.

### NullObject
Nos endpoints quando um argumento de pesquisa não é registrado ou estamos a receber uma NPE(NullPointerException) ou podemos estar retornando um resultado a null. Isso é indesejado! Fazendo uso do pattern NullObject faça com que a resposta seja um NullObject.

### Strategy
