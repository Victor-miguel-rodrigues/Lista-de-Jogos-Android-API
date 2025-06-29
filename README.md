# Lista-de-Jogos-Android-API

```markdown
# 🎮 Lista de Jogos Android API

Esta é uma API RESTful desenvolvida em Java com Spring Boot que permite cadastrar, listar e filtrar jogos de Android por gênero e avaliação.

> Projeto criado com fins de aprendizado prático em desenvolvimento de APIs com Spring, organização por camadas (Controller, DTO, Entity, Repository) e integração com Swagger.

---

## 📌 Funcionalidades

- ✅ Cadastrar jogos Android
- ✅ Listar todos os jogos cadastrados
- ✅ Filtrar jogos por gênero
- ✅ Listar jogos por ordem de avaliação (maior para menor)
- 🛠️ Em breve: Atualizar, deletar, desativar e autenticar com JWT

---

## 🚀 Tecnologias Utilizadas

| Tecnologia      | Descrição                     |
|----------------|-------------------------------|
| Java 17        | Linguagem de programação      |
| Spring Boot 3  | Framework principal da API    |
| Spring Web     | Criação de endpoints REST     |
| Spring Data JPA| Acesso ao banco de dados      |
| MySQL          | Banco de dados relacional     |
| Swagger/OpenAPI| Documentação da API           |

---

## 🗂️ Estrutura do Projeto

```

src/
└── main/
├── java/
│   └── com.br.jogos.lista\_de\_jogos/
│       ├── controller/       # Endpoints da aplicação
│       ├── dto/             # Transferência de dados
│       ├── model/
│       │   └── entitys/      # Entidades JPA (tabelas)
|       |   ─── repositry/  # Repositórios JPA
│    
│       └── doc/             # Configuração do Swagger
└── resources/
└── application.properties # Configurações do projeto

````

---

## 📦 Instalação e Execução

### Pré-requisitos
- Java 17+
- MySQL Server
- Maven (ou IDE com suporte, como IntelliJ ou VS Code)

### Configuração do banco de dados

Crie um banco de dados MySQL chamado `list_jogos`:

```sql
CREATE DATABASE lista_jogos;
````

### Configure o `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/list_jogos
spring.datasource.username=spring
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
springdoc.api-docs.path=/api-docs
```

### Executar o projeto

```bash
./mvnw spring-boot:run
```

Ou pela sua IDE: `Run > ListaDeJogosApplication`

---

## 📬 Endpoints da API

### 🔹 Listar todos os jogos

```http
GET /
```

### 🔹 Filtrar jogos por gênero

```http
POST /{genero}
```

Exemplo:

```http
POST /RPG
```

### 🔹 Listar por avaliação (decrescente)

```http
GET /avaliação
```

### 🔹 Cadastrar novo jogo

```http
POST /salvar
Content-Type: application/json
```

```json
{
  "name": "Genshin Impact",
  "descricao": "RPG de mundo aberto",
  "genero": "RPG",
  "imagem": "https://imagem-jogo.jpg",
  "avaliacao": 9.4
}
```

---

## 📖 Swagger - Documentação

Após rodar o projeto, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

Você poderá testar todos os endpoints diretamente pela interface visual do Swagger.

---

## 🧠 Futuras Melhorias

* 🔐 Autenticação com JWT
* 🧩 Separação por plataformas (Android, Windows, Linux)
* 🧾 Enum para categorias
* 🔍 Paginação e filtros dinâmicos
* ♻️ Camada de serviço (Service Layer)
* 🧪 Testes unitários e de integração

---

## 🧑‍💻 Autor

**Victor Miguel Rodrigues de Lima**
Estudante de Java | Desenvolvedor Back-End em formação
Contato: `Sem por enquanto`

---

## ⭐ Dê um Star

Se esse projeto te ajudou ou inspirou, deixe uma estrela ⭐ no repositório!
