# Exemplo de blog construído com Spring Boot

## Tecnologias utilizadas

* Maven
* Springboot
* Spring-JPA
* Spring-WEB
* Banco de dados H2
* Thymeleaf
* Bootstrap

### Build do projeto utilizando Maven:
Rodar o comando "mvn install" na pasta raiz do projeto;
Será criado o arquivo "springblog-1.0.0.jar" na pasta target.

### Rodar o projeto localmente após o build:
Executar o comando "$ java -jar springblog-1.0.0.jar" na pasta "target" que contém o .jar
> http://localhost:8080/posts

### Heroku
Foi realizado o deploy do projeto no Heroku, **para acessar**, clique [aqui](https://spring-blog-example.herokuapp.com/posts).

> É  [política da plataforma Heroku](https://devcenter.heroku.com/articles/dynos#dyno-sleeping) manter os aplicativos em estado de "dormência" após uma hora de inatividade. Isso causa um pequeno atraso na primeira solicitação, mas as solicitações subsequentes serão executadas normalmente
