<div align="center">
  <h1>Sistema de Avaliação de Notas</h1>
  <p><strong>Classificador de Notas Escolares com Feedback Personalizado</strong></p>
  <p>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven">
    <img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit&logoColor=white" alt="JUnit">
    <img src="https://img.shields.io/badge/license-MIT-blue?style=for-the-badge" alt="MIT License">
  </p>
</div>

---

## Sobre

Sistema de avaliação de notas escolares desenvolvido em **Java** com **Maven** e testes unitários em **JUnit**. O projeto classifica a nota final de um estudante em cinco categorias e gera uma mensagem de feedback personalizada. Também inclui validação de entrada, tratamento de exceções e um plano de testes completo.

---

## ✨ Funcionalidades

### Classificação de Notas

A nota do estudante é classificada em cinco categorias com base no intervalo:

| Categoria | Intervalo | Mensagem de Feedback |
|-----------|-----------|----------------------|
| **Excelente** | 90 a 100 | "Parabéns! Você está com desempenho excelente!" |
| **Bom** | 75 a 89 | "Seu desempenho foi bom! Continue assim!" |
| **Regular** | 50 a 74 | "Você está no caminho certo, mas pode melhorar!" |
| **Insuficiente** | 30 a 49 | "Você não passou, precisa melhorar. Não desista!" |
| **Reprovado** | abaixo de 30 | "Você foi reprovado. Busque apoio e estude mais para a próxima!" |

### Validação e Tratamento de Erros

- **Nota inválida**: lança `IllegalArgumentException` se a nota estiver fora do intervalo 0–100
- **Mensagem de erro amigável**: captura a exceção e retorna mensagem compreensível ao usuário

### Testes Unitários

Cobertura completa com **JUnit**:

- Classificação para todas as 5 categorias de nota
- Geração de mensagem para cada classificação
- Avaliação completa do estudante (classificação + mensagem)
- Notas inválidas acima de 100 e negativas
- Tratamento de erro com mensagem esperada

---

## 🏗 Arquitetura

### Componentes

| Classe | Responsabilidade |
|--------|------------------|
| `Estudante` | POJO que armazena nome e nota final do estudante |
| `AvaliadorDeNotas` | Lógica de classificação, geração de mensagens e avaliação completa |
| `Main` | Ponto de entrada com exemplos de uso |
| `AvaliadorDeNotasTest` | Testes unitários cobrindo todos os cenários |

### Fluxo de Avaliação

```
Estudante (nome, notaFinal)
        ↓
AvaliadorDeNotas.avaliarEstudante()
        ↓
classificarNota() → retorna categoria
        ↓
gerarMensagem() → retorna feedback personalizado
        ↓
Resultado formatado: "Classificação: X\nMensagem: Y"
```

---

## 📁 Estrutura do Projeto

```
project-school-grades/
├── Plano.txt                    # Plano de testes com casos de uso
├── ProjetoNotas/
│   ├── pom.xml                  # Configuração Maven (Java 23, JUnit)
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── org/
│       │           └── example/
│       │               ├── Estudante.java         # POJO do estudante
│       │               ├── AvaliadorDeNotas.java    # Lógica de classificação
│       │               └── Main.java              # Exemplos de execução
│       └── test/
│           └── java/
│               └── org/
│                   └── example/
│                       └── AvaliadorDeNotasTest.java # Testes JUnit
├── LICENSE                      # Licença MIT
└── README.md                    # Este arquivo
```

---

## 🚀 Como Usar

### Requisitos

- **Java JDK 23** (ou superior)
- **Maven** 3.6+ instalado

### Compilar e Executar

1. Navegue até a pasta do projeto Maven:
   ```bash
   cd project-school-grades/ProjetoNotas
   ```

2. Compile e execute:
   ```bash
   mvn compile exec:java -Dexec.mainClass="org.example.Main"
   ```

   Ou manualmente:
   ```bash
   mvn compile
   java -cp target/classes org.example.Main
   ```

### Executar Testes

```bash
mvn test
```

### Usar como Biblioteca

```java
import org.example.Estudante;
import org.example.AvaliadorDeNotas;

// Criar um estudante
Estudante estudante = new Estudante("Maria", 85);

// Avaliar e obter resultado
String resultado = AvaliadorDeNotas.avaliarEstudante(estudante);
System.out.println(resultado);

// Saída:
// Classificação: Bom
// Mensagem: Seu desempenho foi bom! Continue assim!
```

---

## 🛠 Tecnologias Utilizadas

- **Java 23** — linguagem principal
- **Maven** — gerenciamento de dependências e build
- **JUnit 4** — testes unitários
- **POJO Pattern** — modelo simples de dados (`Estudante`)
- **Static Methods** — lógica utilitária reutilizável (`AvaliadorDeNotas`)
- **Exception Handling** — validação de entrada com `IllegalArgumentException`

---

## 📄 Licença

Projeto livre para estudo e modificação.

---

<div align="center">
  <p>Desenvolvido como projeto de estudo</p>
</div>
