# Desafio Padrão de Projeto Singleton com Spring Boot

Este é um exemplo de projeto Spring Boot que demonstra a implementação do padrão de design Singleton utilizando o Spring Framework. O projeto inclui um serviço Singleton e um controlador REST para interagir com esse serviço.



## Visão Geral

Este projeto exemplifica como o Spring Boot gerencia beans como Singletons. A classe `ServicoSigleton` é um serviço Singleton que mantém uma mensagem que pode ser lida e atualizada através de endpoints REST definidos na classe `Controlador`.

## Pré-requisitos

- [JDK 11 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (para construir o projeto)
- [IDE de sua escolha](https://spring.io/tools) (como IntelliJ IDEA, Eclipse, ou VS Code)

## Configuração do Projeto


Construir o Projeto

Certifique-se de que o Maven esteja instalado e execute:

bash
Copiar código
./mvnw clean install
Executar o Projeto
Para executar a aplicação, use o comando Maven:

bash
Copiar código
./mvnw spring-boot:run
Isso iniciará o servidor embutido e a aplicação estará disponível em http://localhost:8080.

Testar os Endpoints
Obter a Mensagem

Acesse o seguinte URL para obter a mensagem atual do serviço Singleton:

bash
Copiar código
curl http://localhost:8080/api/message
Resposta esperada:

json
Copiar código
"Bem vindo ao Serviço do Singleton"

Atualizar a Mensagem

Use o seguinte URL para atualizar a mensagem no serviço Singleton:

bash
Copiar código
curl "http://localhost:8080/api/set-message?newMessage=NovaMensagem"
Resposta esperada:

bash
Copiar código
"Mensagem Atualizada"