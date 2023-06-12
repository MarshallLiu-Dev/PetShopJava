import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cliente extends JFrame implements ActionListener {
    private JLabel janela;
    private JLabel lblCliente;
    private JLabel lblDtNascimento;
    private JLabel lblCpf;
    private JLabel lblEndereço;
    private JLabel lblEmail;
    private JTextField txtCliente;
    private JTextField txtDtNascimento;
    private JTextField txtCpf;
    private JTextField txtEndereço;
    private JTextField txtEmail;
    private JButton btnCadastro;
    private JButton btnCancela;

    // cores
    Color red = new Color(255,0,0);
    Color green = new Color(0,128,0);
    // Color silver = new Color(192,192,192);

    public Cliente(String nome) {
        super(nome);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.janela = new JLabel("");
        this.janela.setBounds(30, 140, 100, 30);
        this.getContentPane().add(this.janela);
        this.janela.setBackground(Color.white);

        this.lblCliente = new JLabel("Cliente:");
        this.lblCliente.setBounds(30, 20, 80, 20);
        this.getContentPane().add(this.lblCliente);

        this.lblDtNascimento = new JLabel("Data de Nascimento:");
        this.lblDtNascimento.setBounds(30, 50, 150, 20);
        this.getContentPane().add(this.lblDtNascimento);

        this.lblCpf = new JLabel("CPF:");
        this.lblCpf.setBounds(30, 80, 80, 20);
        this.getContentPane().add(this.lblCpf);

        this.lblEndereço = new JLabel("Endereço:");
        this.lblEndereço.setBounds(30, 110, 80, 20);
        this.getContentPane().add(this.lblEndereço);

        this.lblEmail = new JLabel("Email:");
        this.lblEmail.setBounds(30, 140, 80, 20);
        this.getContentPane().add(this.lblEmail);

        this.txtCliente = new JTextField();
        this.txtCliente.setBounds(150, 20, 150, 20);
        this.getContentPane().add(this.txtCliente);

        this.txtDtNascimento = new JTextField();
        this.txtDtNascimento.setBounds(150, 50, 150, 20);
        this.getContentPane().add(this.txtDtNascimento);

        this.txtCpf = new JTextField();
        this.txtCpf.setBounds(150, 80, 150, 20);
        this.getContentPane().add(this.txtCpf);

        this.txtEndereço = new JTextField();
        this.txtEndereço.setBounds(150, 110, 150, 20);
        this.getContentPane().add(this.txtEndereço);

        this.txtEmail = new JTextField();
        this.txtEmail.setBounds(150, 140, 150, 20);
        this.getContentPane().add(this.txtEmail);

        this.btnCadastro = new JButton("Cadastrar");
        this.btnCadastro.setBounds(100, 200, 100, 30);
        this.btnCadastro.setBackground(Color.green);
        this.btnCadastro.addActionListener(this);

        this.btnCancela = new JButton("Cancelar");
        this.btnCancela.setBounds(210, 200, 100, 30);
        this.btnCancela.setBackground(Color.red);
        this.btnCancela.addActionListener(this);

        this.getContentPane().add(this.btnCancela);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(this.btnCadastro);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastro) {
            String cliente = txtCliente.getText();
            String dtNascimento = txtDtNascimento.getText();
            String cpf = txtCpf.getText();
            String endereco = txtEndereço.getText();
            String email = txtEmail.getText();

            JOptionPane.showMessageDialog(this, "Cliente: " + cliente + "\nData de Nascimento: " + dtNascimento +
                    "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nEmail: " + email, "Cadastro realizado",
                    JOptionPane.INFORMATION_MESSAGE);

            txtCliente.setText("");
            txtDtNascimento.setText("");
            txtCpf.setText("");
            txtEndereço.setText("");
            txtEmail.setText("");
        } else if (e.getSource() == btnCancela) {
            this.dispose();
        }
    }
}


// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;


// public class Cliente extends JFrame implements ActionListener {
//     private JLabel janela;
//     private JLabel lblCliente;
//     private JLabel lblDtNascimento;
//     private JLabel lblCpf;
//     private JLabel lblEndereço;
//     private JLabel lblEmail;
//     private JTextField txtCliente;
//     private JTextField txtDtNascimento;
//     private JTextField txtCpf;
//     private JTextField txtEndereço;
//     private JTextField txtEmail;
//     private JButton btnCadastro;
//     private JButton btnCancela;

//     // cores
//     Color red = new Color(255,0,0);
//     Color green = new Color(0,128,0);
//     // Color silver = new Color(192,192,192);


//     public Cliente(String nome) {
//         super(nome);
//         this.setBounds(100, 100, 400, 300);
//         this.setLayout(null);
//         this.setVisible(true);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         this.janela = new JLabel("");
//         this.janela.setBounds(30, 140, 100, 30);
//         this.getContentPane().add(this.janela);
//         this.janela.setBackground(Color.white);

//         this.lblCliente = new JLabel("Cliente:");
//         this.lblCliente.setBounds(30, 20, 80, 20);
//         this.getContentPane().add(this.lblCliente);

//         this.lblDtNascimento = new JLabel("Data de Nascimento:");
//         this.lblDtNascimento.setBounds(30, 50, 150, 20);
//         this.getContentPane().add(this.lblDtNascimento);

//         this.lblCpf = new JLabel("CPF:");
//         this.lblCpf.setBounds(30, 80, 80, 20);
//         this.getContentPane().add(this.lblCpf);

//         this.lblEndereço = new JLabel("Endereço:");
//         this.lblEndereço.setBounds(30, 110, 80, 20);
//         this.getContentPane().add(this.lblEndereço);

//         this.lblEmail = new JLabel("Email:");
//         this.lblEmail.setBounds(30, 140, 80, 20);
//         this.getContentPane().add(this.lblEmail);

//         this.txtCliente = new JTextField();
//         this.txtCliente.setBounds(150, 20, 150, 20);
//         this.getContentPane().add(this.txtCliente);

//         this.txtDtNascimento = new JTextField();
//         this.txtDtNascimento.setBounds(150, 50, 150, 20);
//         this.getContentPane().add(this.txtDtNascimento);

//         this.txtCpf = new JTextField();
//         this.txtCpf.setBounds(150, 80, 150, 20);
//         this.getContentPane().add(this.txtCpf);

//         this.txtEndereço = new JTextField();
//         this.txtEndereço.setBounds(150, 110, 150, 20);
//         this.getContentPane().add(this.txtEndereço);

//         this.txtEmail = new JTextField();
//         this.txtEmail.setBounds(150, 140, 150, 20);
//         this.getContentPane().add(this.txtEmail);

//         this.btnCadastro = new JButton("Cadastrar");
//         this.btnCadastro.setBounds(100, 200, 100, 30);
//         this.btnCadastro.setBackground(Color.green);
//         this.btnCadastro.addActionListener(this);

//         this.btnCancela = new JButton("Cancelar");
//         this.btnCancela.setBounds(210, 200, 100, 30);
//         this.btnCancela.setBackground(Color.red);
//         this.btnCancela.addActionListener(this);

//         this.getContentPane().add(this.btnCancela);
//         this.getContentPane().setBackground(Color.LIGHT_GRAY);
//         this.getContentPane().add(this.btnCadastro);
//         this.getContentPane().setBackground(Color.LIGHT_GRAY);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == btnCadastro) {
//             String cliente = txtCliente.getText();
//             String dtNascimento = txtDtNascimento.getText();
//             String cpf = txtCpf.getText();
//             String endereco = txtEndereço.getText();
//             String email = txtEmail.getText();

//             try (Connection conn = DBConnection.getConnection()) {
//                 String sql = "INSERT INTO tabela_clientes (cliente, dt_nascimento, cpf, endereco, email) VALUES (?, ?, ?, ?, ?)";
//                 PreparedStatement stmt = conn.prepareStatement(sql);
//                 stmt.setString(1, cliente);
//                 stmt.setString(2, dtNascimento);
//                 stmt.setString(3, cpf);
//                 stmt.setString(4, endereco);
//                 stmt.setString(5, email);
//                 stmt.executeUpdate();

//                 JOptionPane.showMessageDialog(this, "Cliente: " + cliente + "\nData de Nascimento: " + dtNascimento +
//                         "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nEmail: " + email, "Cadastro realizado",
//                         JOptionPane.INFORMATION_MESSAGE);

//                 txtCliente.setText("");
//                 txtDtNascimento.setText("");
//                 txtCpf.setText("");
//                 txtEndereço.setText("");
//                 txtEmail.setText("");
//             } catch (SQLException ex) {
//                 ex.printStackTrace();
//                 JOptionPane.showMessageDialog(this, "Erro ao cadastrar o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
//             }
//         } else if (e.getSource() == btnCancela) {
//             this.dispose();
//         }
//     }
// }
