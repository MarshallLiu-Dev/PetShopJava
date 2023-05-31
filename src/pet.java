import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pet extends JFrame implements ActionListener {

    private JTextField txtAnimal;
    private JTextField txtDtNascimento;
    private JTextField txtRaca;
    private JTextField txtEndereco;
    private JButton btnCadastro;
    private JButton btnCancelar;

    public pet(String title) {
        super(title);

        // Definir layout para a janela
        setLayout(new GridLayout(6, 19));

        // Criar rótulos
        JLabel lblAnimal = new JLabel("Animal:");
        JLabel lblDtNascimento = new JLabel("Data de Nascimento:");
        JLabel lblRaca = new JLabel("Raça:");
        JLabel lblEndereco = new JLabel("Endereço:");

        // Criar campos de texto
        txtAnimal = new JTextField();
        txtDtNascimento = new JTextField();
        txtRaca = new JTextField();
        txtEndereco = new JTextField();

        // Criar botão de cadastro
        btnCadastro = new JButton("Cadastrar");
        btnCadastro.addActionListener(this);

        // Criar botão de cancelar
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);

        // Adicionar componentes à janela
        add(lblAnimal);
        add(txtAnimal);
        add(lblDtNascimento);
        add(txtDtNascimento);
        add(lblEndereco);
        add(txtEndereco);
        add(lblRaca);
        add(txtRaca);
        add(btnCancelar);
        add(btnCadastro);

        // Configurar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // centralizar na tela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new pet("Pet"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastro) {
            // Lógica de processamento dos dados de cadastro
            String animal = txtAnimal.getText();
            String dtNascimento = txtDtNascimento.getText();
            String raca = txtRaca.getText();
            String endereco = txtEndereco.getText();

            // Exemplo: exibir os dados de cadastro
            String mensagem = "Animal: " + animal + "\n"
                    + "Data de Nascimento: " + dtNascimento + "\n"
                    + "Raça: " + raca + "\n"
                    + "Endereço: " + endereco;

            JOptionPane.showMessageDialog(this, mensagem, "Dados de Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnCancelar) {
            // Lógica de ação do botão de cancelar
            // Você pode adicionar aqui o código para limpar os campos de entrada ou realizar outras ações de cancelamento
            txtAnimal.setText("");
            txtDtNascimento.setText("");
            txtRaca.setText("");
            txtEndereco.setText("");
        }
    }
}
