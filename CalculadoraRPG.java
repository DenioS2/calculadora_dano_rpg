import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraRPG {
    public static void main(String[] args) {
        // Cria a janela do jogo
        JFrame janela = new JFrame("Arena de RPG");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null); // Usando layout manual igual ao seu código anterior

        // 1. Título do Sistema
        JLabel titulo = new JLabel("CALCULADORA DE COMBATE", JLabel.CENTER);
        titulo.setBounds(20, 20, 340, 30);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        janela.add(titulo);

        // 2. Campo para o Dano do Ataque
        JLabel lblAtaque = new JLabel("Dano do Ataque:");
        lblAtaque.setBounds(40, 80, 120, 25);
        janela.add(lblAtaque);

        JTextField txtAtaque = new JTextField();
        txtAtaque.setBounds(160, 80, 60, 25);
        janela.add(txtAtaque);

        // 3. Campo para a Defesa do Inimigo
        JLabel lblDefesa = new JLabel("Defesa do Alvo:");
        lblDefesa.setBounds(40, 120, 120, 25);
        janela.add(lblDefesa);

        JTextField txtDefesa = new JTextField();
        txtDefesa.setBounds(160, 120, 60, 25);
        janela.add(txtDefesa);

        // 4. Botão de Atacar (Fica ao lado do campo de Defesa para aproveitar o espaço)
        JButton btnAtacar = new JButton("ATACAR!");
        btnAtacar.setBounds(240, 100, 100, 35);
        janela.add(btnAtacar);

        // 5. Label de Resultado (Onde a mágica acontece)
        JLabel lblResultado = new JLabel("O inimigo aguarda seu movimento...", JLabel.CENTER);
        lblResultado.setBounds(20, 180, 340, 40);
        lblResultado.setFont(new Font("Arial", Font.ITALIC, 14));
        lblResultado.setForeground(Color.BLUE); // Deixa o texto azul para destacar
        janela.add(lblResultado);

        // Lógica do Botão: O que acontece quando você clica em "ATACAR!"
        btnAtacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Pega os números digitados nas caixas de texto
                    int ataque = Integer.parseInt(txtAtaque.getText());
                    int defesa = Integer.parseInt(txtDefesa.getText());

                    // Regra do RPG: Dano final = Ataque - Defesa
                    int danoFinal = ataque - defesa;

                    // Se o dano for menor que zero, o escudo absorveu tudo
                    if (danoFinal < 0) {
                        danoFinal = 0;
                    }

                    // Exibe a mensagem personalizada na tela
                    if (danoFinal > 0) {
                        lblResultado.setText("💥 Sucesso! Você causou " + danoFinal + " de dano!");
                    } else {
                        lblResultado.setText("🛡️ O inimigo defendeu o ataque!");
                    }

                } catch (NumberFormatException erro) {
                    // Se o usuário digitar letras em vez de números, mostra um aviso
                    lblResultado.setText("⚠️ Digite números válidos nos campos!");
                }
            }
        });

        // Mostra a janela na tela
        janela.setVisible(true);
    }
}
