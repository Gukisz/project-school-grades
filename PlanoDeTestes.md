# Plano de Testes (Test Plan)

## Objetivo

Verificar se o sistema de avaliação de notas classifica corretamente os estudantes com base na nota final e retorna mensagens apropriadas.

---

## Casos de Teste

### Test Case 1: Nota Excelente

- **Descrição**: Verifica que um estudante com nota 95 é classificado como "Excelente".
- **Entrada**: `95`
- **Saída Esperada**: `Classificação: Excelente`

### Test Case 2: Nota Boa

- **Descrição**: Verifica que um estudante com nota 85 é classificado como "Bom".
- **Entrada**: `85`
- **Saída Esperada**: `Classificação: Bom`

### Test Case 3: Nota Regular

- **Descrição**: Verifica que um estudante com nota 60 é classificado como "Regular".
- **Entrada**: `60`
- **Saída Esperada**: `Classificação: Regular`

### Test Case 4: Nota Insuficiente

- **Descrição**: Verifica que um estudante com nota 45 é classificado como "Insuficiente".
- **Entrada**: `45`
- **Saída Esperada**: `Classificação: Insuficiente`

### Test Case 5: Nota Reprovada

- **Descrição**: Verifica que um estudante com nota 20 é classificado como "Reprovado".
- **Entrada**: `20`
- **Saída Esperada**: `Classificação: Reprovado`

### Test Case 6: Avaliação Completa do Estudante

- **Descrição**: Verifica que o sistema retorna a classificação correta e a mensagem de feedback para um estudante.
- **Entrada**: `Estudante("João", 85)`
- **Saída Esperada**:
  ```
  Classificação: Bom
  Mensagem: Seu desempenho foi bom! Continue assim!
  ```

### Test Case 7: Nota Inválida Acima de 100

- **Descrição**: Verifica que uma nota acima de 100 lança exceção.
- **Entrada**: `105`
- **Saída Esperada**: `IllegalArgumentException` com mensagem "Nota inválida! A nota deve estar entre 0 e 100."

### Test Case 8: Nota Inválida Negativa

- **Descrição**: Verifica que uma nota negativa lança exceção.
- **Entrada**: `-10`
- **Saída Esperada**: `IllegalArgumentException` com mensagem "Nota inválida! A nota deve estar entre 0 e 100."

### Test Case 9: Mensagem de Erro para Nota Inválida

- **Descrição**: Verifica que o método `avaliarEstudante` retorna mensagem amigável ao receber nota inválida.
- **Entrada**: `Estudante("Ana", 150)`
- **Saída Esperada**: `Erro: Nota inválida! A nota deve estar entre 0 e 100.`

---

## Conclusão

Os casos de teste cobrem todos os intervalos de nota possíveis e garantem que o sistema classifica corretamente os estudantes e retorna mensagens apropriadas. Todos os testes devem passar para confirmar a precisão do sistema.
