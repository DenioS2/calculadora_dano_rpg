# Arena de RPG - Calculadora de Combate 

Uma aplicação desktop simples desenvolvida em **Java** utilizando a biblioteca **Swing**. O programa simula o cálculo de dano em um combate de RPG com base nos pontos de ataque do jogador e na defesa do alvo.

---

## 🚀 Funcionalidades
- **Cálculo Automático**: Subtrai a defesa do alvo do valor do ataque (`Dano Final = Ataque - Defesa`).
- **Proteção contra Danos Negativos**: Se a defesa for maior que o ataque, o dano final é ajustado para zero.
- **Tratamento de Erros**: Avisa o usuário caso insira caracteres inválidos (letras) em vez de números.
- **Interface Gráfica Leve**: Janela interativa com posicionamento manual de componentes (`null layout`).

---

##  Pré-requisitos
Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina (versão 8 ou superior recomendada).

---

## Como Executar

1. Clone este repositório ou copie o código fonte para um arquivo chamado `CalculadoraRPG.java`.
2. Abra o terminal (ou prompt de comando) na pasta onde o arquivo está salvo.
3. Compile o programa com o comando:
   ```bash
   javac CalculadoraRPG.java
   ```
4. Execute o programa com o comando:
   ```bash
   java CalculadoraRPG
   ```

---

## Como Usar
1. Insira o valor do **Dano do Ataque** no primeiro campo de texto.
2. Insira o valor da **Defesa do Alvo** no segundo campo.
3. Clique no botão **ATACAR!** para ver o resultado da investida na parte inferior da janela.
