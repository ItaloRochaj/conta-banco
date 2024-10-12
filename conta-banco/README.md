
## Desafio Intaxe: Conta Banco

Vamos aplicar todo o conteúdo apresentado no módulo de Sintaxe através da codificação do seguinte cenário:

### Objetivo:
Desenvolver um projeto chamado `ContaBanco`, que receberá dados do usuário via terminal, representando as características de uma conta bancária, de acordo com os atributos listados abaixo.

### Estrutura do Projeto:
1. **Nome do Projeto**: `ContaBanco`
2. **Classe Principal**: `ContaTerminal.java`

### Atributos da Conta:
| Atributo     | Tipo     | Exemplo       |
|--------------|----------|---------------|
| Número       | Inteiro  | 1021          |
| Agência      | Texto    | 067-8         |
| Nome Cliente  | Texto    | MARIO ANDRADE  |
| Saldo        | Decimal  | 237.48        |

### Instruções para Implementação:
1. **Declaração de Variáveis**: Revise as regras para a declaração de variáveis, assegurando que cada atributo da conta seja adequadamente representado.
  
2. **Entrada de Dados**:
   - Utilize a classe `Scanner` para permitir que os dados sejam inseridos via terminal.
   - Para cada informação solicitada, o programa deve exibir uma mensagem clara ao usuário, como por exemplo:
     - **Programa**: "Por favor, digite o número da Agência!"
     - **Usuário**: 1021 (pressionando ENTER para o próximo campo)

3. **Concatenação de Strings**: Revise o uso de concatenação de strings e o método `concat` da classe `String`. Após todas as informações serem coletadas, o sistema deverá exibir a seguinte mensagem:

   ```
   "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agência], conta [Número] e seu saldo de [Saldo] já está disponível para saque."
   ```

   Os campos entre colchetes (`[ ]`) devem ser substituídos pelas informações inseridas pelos usuários.

### Resultado Esperado:
Ao final do processo, o usuário deve receber uma mensagem personalizada com os detalhes de sua nova conta bancária, confirmando a criação com sucesso.