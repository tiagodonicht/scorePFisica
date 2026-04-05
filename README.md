# 📊 Score Pessoa Física — API REST

API REST desenvolvida em **Java** com **Spring Boot** para <!-- descreva aqui o objetivo principal: ex: "cálculo de score de crédito de pessoas físicas" -->. O projeto utiliza banco de dados em memória **H2** para persistência durante a execução, facilitando testes e desenvolvimento local.

---

## 🛠️ Tecnologias utilizadas

| Tecnologia | Versão |
|---|---|
| Java | 11 |
| Spring Boot | 2.5.4 |
| Spring Data JPA | — |
| Spring Web | — |
| H2 Database | — |
| Gradle | — |

---

## 📋 Pré-requisitos

- [JDK 11](https://adoptium.net/) instalado
- [Gradle](https://gradle.org/) ou uso do wrapper incluso (`./gradlew`)

---

## 🚀 Como executar

**1. Clone o repositório:**

```bash
git clone https://github.com/tiagodonicht/scorePFisica.git
cd scorePFisica
```

**2. Execute a aplicação:**

```bash
./gradlew bootRun
```

A aplicação estará disponível em `http://localhost:8080`.

**3. Acesse o console do banco H2 (opcional):**

```
http://localhost:8080/h2-console
```

> JDBC URL padrão: `jdbc:h2:mem:testdb`

---

## 📡 Endpoints

> ⚠️ Atualize esta seção com os endpoints reais da aplicação.

| Método | Endpoint | Descrição |
|---|---|---|
| `POST` | `/score` | <!-- descrição --> |
| `GET` | `/score/{id}` | <!-- descrição --> |

### Exemplo de requisição

```json
// POST /score
{
  // adicione aqui o payload de exemplo
}
```

### Exemplo de resposta

```json
{
  // adicione aqui o response de exemplo
}
```

---

## 📁 Estrutura do projeto

```
scorePFisica/
├── src/
│   └── main/
│       ├── java/com/nubank/scorePFisica/
│       │   ├── ScorePFisicaApplication.java   # Entry point da aplicação
│       │   ├── controller/                    # Controllers REST
│       │   ├── service/                       # Regras de negócio
│       │   ├── model/                         # Entidades JPA
│       │   └── repository/                    # Repositórios Spring Data
│       └── resources/
│           └── application.properties         # Configurações da aplicação
├── build.gradle                               # Dependências e build
├── settings.gradle
└── gradlew
```

---

## 🧪 Como testar

Execute os testes com:

```bash
./gradlew test
```

---

## 💡 Sobre o projeto

Este projeto foi desenvolvido como parte do programa de **Arquitetura de Soluções** da [FIAP](https://www.fiap.com.br/), com foco em desenvolvimento de APIs REST com Spring Boot e boas práticas de arquitetura Java.

---

## 📄 Licença

Este projeto é de uso livre para fins educacionais e de estudo.
