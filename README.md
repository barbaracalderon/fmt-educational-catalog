# FMT Educational Catalog Restful API

Este é um projeto inicial de base para uma RESTful API de catálogo, que gerencia alunos e cursos. Bastante simples,
foi desenvolvida em Java e Spring Boot para gerenciar alunos e cursos --- como primeiro contato com o Spring Boot.
Não possui persistência de dados. Desenvolvido na semana 8 do módulo de Backend Java, Lab 365, SENAI - Florianópolis, SC. 

## Autor

Sou a Barbara Calderon, desenvolvedora de software.
- [Github](https://www.github.com/barbaracalderon)
- [Linkedin](https://www.linkedin.com/in/barbaracalderondev)
- [Twitter](https://www.x.com/bederoni)

## Tecnologias Utilizadas

- **Java 17**: linguagem de programação Java com JDK 17.
- **Spring Boot**: framework para desenvolvimento de aplicações Java
- **Spring Boot Starter Web**: para desenvolvimento de aplicativos da web
- **Spring Boot DevTools**: ferramenta para desenvolvimento mais produtivo
- **Project Lombok**: para reduzir a verbosidade do código Java
- **Maven**: gerenciador de dependências e construção de projetos

## Endpoints da API

Sistema conta apenas com sete endpoints simples, descritos abaixo.

### /Aluno

| Endpoint         | Método HTTP | Descrição                               |
|------------------|-------------|-----------------------------------------|
| /aluno           | GET         | Retorna todos os alunos cadastrados.    |
| /aluno/{idAluno} | GET         | Retorna um aluno específico pelo ID.    |
| /aluno           | POST        | Cadastra um novo aluno.                 |

### /Curso

| Endpoint         | Método HTTP | Descrição                                      |
|------------------|-------------|------------------------------------------------|
| /curso           | GET         | Retorna todos os cursos cadastrados.           |
| /curso/{idCurso} | GET         | Retorna um curso específico pelo ID.           |
| /curso           | POST        | Cadastra um novo curso.                       |
| /curso/{idCurso}/matricula | POST   | Matricula um aluno em um curso específico.     |

## Executando o Projeto

Antes de executar o projeto, certifique-se de ter o JDK 17 e o PostgreSQL instalados em sua máquina.

1. Clone o repositório do projeto:
    ```bash
    git clone git@github.com:barbaracalderon/fmt-educational-catalog.git
    ```

2. Acesse o diretório do projeto:
    ```bash
    cd fmt-educational-catalog
    ```
3. Execute o projeto:
    ```bash
    ./mvnw spring-boot:run
    ```

O servidor será iniciado em http://localhost:8080.


## Como Testar os Endpoints

Você pode testar os endpoints utilizando ferramentas como o Insomnia, Postman ou cURL. 
Abaixo estão alguns exemplos de como testar os endpoints:

### Testando os Endpoints

Você pode testar os endpoints utilizando ferramentas como Postman ou Insomnia. Por exemplo:

- Para listar todos os alunos:
    ```bash
    GET http://localhost:8080/alunos
    ```

- Para cadastrar um novo aluno:
    ```bash
    POST http://localhost:8080/aluno

    Body:
    {
      "nomeDoAluno": "Maria",
      "dataDeNascimento": "2000-01-01"
    }
    ```

Certifique-se de substituir os valores de exemplo pelos valores reais.

### Atividade

Esta foi uma atividade da semana 8, execução própria de uma proposta de primeiro contato com construção de APIs no 
ecossistema Java.