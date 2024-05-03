# OBJETIVOS

Definição dos objetivos:
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções

## Atividade Proposta

Criar um projeto utilizando o framework Spring para o gerenciamento de usuários de um sistema. O projeto será um backend baseado em Rest API, disponibilizando os endpoints necessários para realizar as operações de gerenciamento de usuários (CRUD). O projeto seguirá o padrão MVC e será necessário realizar o modelo lógico para a criação da base de dados, bem como a conexão com o mesmo. Além da lógica base, será necessário realizar os tratamentos de exceções.

## Procedimentos para a Realização da Atividade

Para a realização desta aula prática, você precisará seguir os seguintes passos:

1. Utilize um editor de texto, recomendável o Eclipse com Spring Tool: [Spring Tools](https://spring.io/tools).
2. Tenha o Postman instalado: [Download Postman](https://www.postman.com/downloads/).
3. Tenha Git instalado: [Download Git](https://git-scm.com/downloads) (caso queira versionar o seu projeto e/ou salvar na nuvem).

### Criar o Projeto Base

1. Crie o projeto base com a estrutura Spring a partir do seguinte link: [Spring Initializr](https://start.spring.io/).
   - Selecione as seguintes opções:
     - Maven
     - Java, versão 17
     - Versão do Spring: 3.0.0
     - JAR packaging
     - Add dependencies: Spring Web
   - Clique em "Generate" e descompacte o projeto no seu workspace.
2. Abra o Spring Tool Suite e escolha seu workspace.
   - Em "File > Import > Maven > Existing Maven projects", escolha a pasta do projeto base gerado e selecione o arquivo pom.xml. Clique em "Finish".

### Criar Entidades e Controller

3. Em `src/main/java`, crie um pacote `entities` e dentro dele crie a classe `User`.
   - Adicione os atributos básicos: id, nome, e-mail, telefone, password.
   - Crie construtores e métodos getters e setters.
   - Adicione as annotations `@Entity` e `@Table(name = "tb_user")`.

4. Em `src/main/java`, crie um pacote `resource` e dentro dele crie a classe `UserResource` (controladora).
   - Adicione as annotations `@RestController` e `@RequestMapping(value = "/users")`.

### Configurar Banco de Dados

5. Adicione as dependências de JPA e H2 ao arquivo `pom.xml`.

6. Crie os arquivos `application.properties` e `application-test.properties` em `src/main/resources` com as respectivas configurações.

7. Em `src/main/java`, crie um pacote `repositories` e dentro dele crie a interface `UserRepository` estendendo `JpaRepository`.

### Configurar Dados de Teste

8. Em `src/main/java`, crie um pacote `config` e dentro dele crie a classe `TestConfig` que implementa `CommandLineRunner`.
   - Injete um atributo do tipo `UserRepository`.
   - Implemente o método `run` para popular dados no banco em tempo de execução.

### Criar Serviços e Tratamento de Exceções

9. Em `src/main/java`, crie um pacote `services` e dentro dele crie a interface `UserService` com a annotation `@Service`.
   - Injete um atributo do tipo `UserRepository`.
   - Implemente métodos como `findAll`, `findById`, `insert`, `delete`, `update`.

10. Em `src/main/java`, crie um pacote `exceptions` e dentro dele crie a classe `ResourceNotFoundException`.

11. Em `src/main/java`, crie um pacote `exceptions` e dentro dele crie as classes `StandardError` e `ResourceExceptionHandler`.

### Testar a Aplicação

12. Teste a aplicação utilizando o Postman.

Com esses passos, você estará criando um projeto Spring para o gerenciamento de usuários com todas as funcionalidades solicitadas.

## Checklist

- [x] Utilização de um editor de código sugerido neste documento.
- [x] Instalação do Postman e do Git (opcional).
- [x] Criação do projeto base.
- [x] Adição das dependências e implementação das properties.
- [x] Implementação das classes: `User`, `UserResource` e `UserService`.
- [x] Implementação da interface `UserRepository`.
- [x] Implementação das classes e mecanismo de exceção.
- [x] Configuração da aplicação para testes.
- [x] Teste da aplicação com a ferramenta Postman.

