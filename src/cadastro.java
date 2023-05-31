// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class cadastro extends JFrame implements ActionListener {

//     private JLabel palavra;
//     private JTextField txtEditar;
//     private JTextField txtCancelar;
//     private JButton btnCadastro;

//     public cadastro(String string) {
//         // construtor da classe
//     }

//     public static void main(String[] args) {
//         // Caixa de diálogo para obter os dados de cadastro no sistema
//         String clienteString = JOptionPane.showInputDialog(null, "Cliente:",
//                 "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
//         String dtNasString = JOptionPane.showInputDialog(null, "Data de Nascimento:",
//                 "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
//         String cpf = JOptionPane.showInputDialog(null, "CPF:",
//                 "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
//         String email = JOptionPane.showInputDialog(null, "E-mail:",
//                 "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
//         String endereco = JOptionPane.showInputDialog(null, "Endereço:",
//                 "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // método de ação do botão (se necessário)
//     }
// }



// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class cadastro extends JFrame implements ActionListener {

//     private JTextField txtCliente;
//     private JTextField txtDtNascimento;
//     private JTextField txtCPF;
//     private JTextField txtEmail;
//     private JTextField txtEndereco;
//     private JButton btnCadastro;

//     public cadastro(String title) {
//         super(title);

//         // Definir layout para a janela
//         setLayout(new GridLayout(6, 2));

//         // Criar rótulos
//         JLabel lblCliente = new JLabel("Cliente:");
//         JLabel lblDtNascimento = new JLabel("Data de Nascimento:");
//         JLabel lblCPF = new JLabel("CPF:");
//         JLabel lblEmail = new JLabel("E-mail:");
//         JLabel lblEndereco = new JLabel("Endereço:");

//         // Criar campos de texto
//         txtCliente = new JTextField();
//         txtDtNascimento = new JTextField();
//         txtCPF = new JTextField();
//         txtEmail = new JTextField();
//         txtEndereco = new JTextField();

//         // Criar botão de cadastro
//         btnCadastro = new JButton("Cadastrar");
//         btnCadastro.addActionListener(this);

//         // Adicionar componentes à janela
//         add(lblCliente);
//         add(txtCliente);
//         add(lblDtNascimento);
//         add(txtDtNascimento);
//         add(lblCPF);
//         add(txtCPF);
//         add(lblEmail);
//         add(txtEmail);
//         add(lblEndereco);
//         add(txtEndereco);
//         add(new JLabel()); // espaço em branco para alinhar o botão
//         add(btnCadastro);

//         // Configurar a janela
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         pack();
//         setLocationRelativeTo(null); // centralizar na tela
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new cadastro("Cadastro de Clientes"));
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // Lógica de processamento dos dados de cadastro
//         String cliente = txtCliente.getText();
//         String dtNascimento = txtDtNascimento.getText();
//         String cpf = txtCPF.getText();
//         String email = txtEmail.getText();
//         String endereco = txtEndereco.getText();

//         // Exemplo: exibir os dados de cadastro
//         String mensagem = "Cliente: " + cliente + "\n"
//                 + "Data de Nascimento: " + dtNascimento + "\n"
//                 + "CPF: " + cpf + "\n"
//                 + "E-mail: " + email + "\n"
//                 + "Endereço: " + endereco;

//         JOptionPane.showMessageDialog(this, mensagem, "Dados de Cadastro", JOptionPane.INFORMATION_MESSAGE);
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro extends JFrame implements ActionListener {

    private JTextField txtCliente;
    private JTextField txtDtNascimento;
    private JTextField txtCPF;
    private JTextField txtEmail;
    private JTextField txtEndereco;
    private JButton btnCadastro;
    private JButton btnCancelar;

    public cadastro(String title) {
        super(title);

        // Definir layout para a janela
        setLayout(new GridLayout(6, 2));

        // Criar rótulos
        JLabel lblCliente = new JLabel("Cliente:");
        JLabel lblDtNascimento = new JLabel("Data de Nascimento:");
        JLabel lblCPF = new JLabel("CPF:");
        JLabel lblEmail = new JLabel("E-mail:");
        JLabel lblEndereco = new JLabel("Endereço:");

        // Criar campos de texto
        txtCliente = new JTextField();
        txtDtNascimento = new JTextField();
        txtCPF = new JTextField();
        txtEmail = new JTextField();
        txtEndereco = new JTextField();

        // Criar botão de cadastro
        btnCadastro = new JButton("Cadastrar");
        btnCadastro.addActionListener(this);

        // Criar botão de cancelar
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);

        // Adicionar componentes à janela
        add(lblCliente);
        add(txtCliente);
        add(lblDtNascimento);
        add(txtDtNascimento);
        add(lblCPF);
        add(txtCPF);
        add(lblEmail);
        add(txtEmail);
        add(lblEndereco);
        add(txtEndereco);
        add(btnCancelar);
        add(btnCadastro);

        // Configurar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // centralizar na tela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new cadastro("Cadastro de Clientes"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastro) {
            // Lógica de processamento dos dados de cadastro
            String cliente = txtCliente.getText();
            String dtNascimento = txtDtNascimento.getText();
            String cpf = txtCPF.getText();
            String email = txtEmail.getText();
            String endereco = txtEndereco.getText();

            // Exemplo: exibir os dados de cadastro
            String mensagem = "Cliente: " + cliente + "\n"
                    + "Data de Nascimento: " + dtNascimento + "\n"
                    + "CPF: " + cpf + "\n"
                    + "E-mail: " + email + "\n"
                    + "Endereço: " + endereco;

            JOptionPane.showMessageDialog(this, mensagem, "Dados de Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnCancelar) {
            // Lógica de ação do botão de cancelar
            // Você pode adicionar aqui o código para limpar os campos de entrada ou realizar outras ações de cancelamento
            txtCliente.setText("");
            txtDtNascimento.setText("");
            txtCPF.setText("");
            txtEmail.setText("");
            txtEndereco.setText("");
        }
    }
}
