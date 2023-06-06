

import javax.swing.*;
// import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    private JTextField txtCliente;
    private JTextField txtServico;
    private JTextField txtPet;
    private JButton btnCadastro;
    private JButton btnCancelar;

    public Menu(String title) {
        super(title);

        // Definir layout para a janela
        // setLayout(new GridLayout(6, 2));

        // Criar rótulos e campos de texto...

        // Configurar a janela...

        // Adicionar componentes à janela...

        // Configurar a janela...

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Menu("Menu"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton sourceButton = (JButton) e.getSource();

            if (sourceButton.getText().equals("Cadastrar")) {
                // Lógica de processamento dos dados de cadastro...
            } else if (sourceButton.getText().equals("Cancelar")) {
                // Lógica de ação do botão de cancelar...
            }
        }
    }
}
