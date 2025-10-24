# 🧩 Sistema CRUD com Spring Boot e Mockito

## 📘 Descrição do Projeto

Este projeto é um **Sistema CRUD** desenvolvido em **Java com Spring Boot**, utilizando o banco de dados **H2** em memória. Ele permite criar, listar, buscar, atualizar e excluir produtos. Além disso, inclui **testes unitários** implementados com **Mockito**, simulando o comportamento da camada de repositório.

---

## ⚙️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **Banco de dados H2 (em memória)**
- **JUnit 5**
- **Mockito**
- **Maven**

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o Repositório
```bash
  git clone https://github.com/DenielCarlson/testes_unitarios_atividade

2️⃣ Compilar e Executar

mvn spring-boot:run

3️⃣ Acessar o Sistema

    API: http://localhost:8080/produtos

Console H2: http://localhost:8080/h2-console

        JDBC URL: jdbc:h2:mem:testdb

        Usuário: sa

        Senha: (deixe em branco)

📡 Endpoints da API
🔹 Criar Produto

POST /produtos

Exemplo de JSON:

{
  "nome": "Notebook Dell Inspiron",
  "descricao": "Notebook Dell com processador i7 e 16GB de RAM",
  "preco": 4999.90,
  "estoque": 12
}

🔹 Listar Todos os Produtos

GET /produtos

Exemplo de Resposta:

[
  {
    "id": 1,
    "nome": "Notebook Dell Inspiron",
    "descricao": "Notebook Dell com processador i7 e 16GB de RAM",
    "preco": 4999.9,
    "estoque": 12
  }
]

🔹 Buscar Produto por ID

GET /produtos/{id}

Exemplo:

GET http://localhost:8080/produtos/1

🔹 Atualizar Produto

PUT /produtos/{id}

Exemplo de JSON:

{
  "nome": "Notebook Dell Atualizado",
  "descricao": "Versão atualizada com SSD de 1TB",
  "preco": 5499.90,
  "estoque": 10
}

🔹 Excluir Produto

DELETE /produtos/{id}

Exemplo:

DELETE http://localhost:8080/produtos/1

🧪 Testes Unitários (Mockito)

Os testes automatizados estão localizados em:

src/test/java/com/facul/JUnitAtividade/service/ProdutoServiceTest.java

🧰 Executar os testes

mvn test

📊 Cobertura de Testes

    Testes unitários cobrem a camada de serviço (ProdutoService).

    O comportamento do repositório é simulado usando Mockito.

    Cobertura recomendada: 80%+

🗃️ Exemplo de Entidade Produto
Campo	Tipo	Descrição
id	Long	Identificador único (gerado)
nome	String	Nome do produto
descricao	String	Descrição do produto
preco	Double	Preço unitário
estoque	Integer	Quantidade disponível em estoque