# Vamos lá

### Template Method
Percebam que nós temos duas classes *Handler: ProdutoHandler e EstablecimentoHandler, certo? Precisamos que estas duas classes realizem a validação do token. Sim, para cada requisição que chegar, vamos validar se o token para aquele utilizador é válido. Para isso, aplique o pattern Template Method utilizando a classe BaseHandler. Uma outra possível solução seria criando uma anotação, por exemplo Secured e interceptando as requisições e realizando a validação antes da requisição sequer chegar no endpoint.

### Decorator
O pattern Decorator está presente no SpringBoot e será que você percebeu? Olhe novamente para as anotações: @RestController, @Componente, @Repository, @Autowired, @PostMapping, @GetMapping dentre outras. Isso é uma forma de "decorar" sua classe ou seu método. Através de anotações podemos adicionar meta-informações que podem ser lidas em tempo de compilação ou execução. Mas, não teríamos um exemplo contemplativo. Perceba que temos um Handler chamado FileHandler que redireciona para uma classe que começou a ler de um arquivo. O arquivo é lido, agora, usando o Pattern Decorator termine de ler o arquivo e retorne o conteúdo dele, que alías, é uma música do Mr. Big, Collorado Bulldog.

### Factory Method
Temos vários DTOs espalhado pelo projeto. Acredito que eles podem ser bons candidatos a participarem de uma fábrica. Realize com que os DTOs possam ser criados/instanciados com o pattern Factory Method.

### Builder
Poxa, o DTO InformacoesDTO possui muitos campos e ficar setando atributos com Get/Set às vezes é tão chato. Podemos criar um Builder para essa classe. Lembrem-se que podemos usar com classes estáticas, ou com o GenericBuilder ou usar o Lombok.

### Singleton
Temos em nossa API um endpoint que retorna as informações de sistema o StatusHandler. Vejam que a implementação sempre busca as propriedades de sistema e elas sempre serão as mesmas, desde que não reinicie a VM. Essa classe que carrega as propriedades de sistema é uma excelente candidata a virar um Singleton. Uma outra possível solução seria transformar isso em um cache ou transformar num Bean de escopo de aplicação como por exemplo um @ApplicationScope.

### NullObject
Nos endpoints quando um argumento de pesquisa não é registrado ou estamos a receber uma NPE(NullPointerException) ou podemos estar retornando um resultado a null. Isso é indesejado! Fazendo uso do pattern NullObject faça com que a resposta seja um NullObject.