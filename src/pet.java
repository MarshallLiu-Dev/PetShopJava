import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pet extends JFrame implements ActionListener {
    private JLabel janela;
    private JLabel lblPet;
    private JLabel lblAnimal;
    private JLabel lblDtNascimento;
    private JLabel lblRaça;
    private JTextField txtPet;
    private JTextField txtAnimal;
    private JTextField txtDtNascimento;
    private JTextField txtRaça;
    private JButton btnCadastro;
    private JButton btnCancela;

    // cores
    Color red = new Color(255,0,0);
    Color green = new Color(0,128,0);
    // Color silver = new Color(192,192,192);

    public Pet(String nome) {
        super(nome);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.janela = new JLabel("");
        this.janela.setBounds(30, 140, 100, 30);
        this.getContentPane().add(this.janela);
        this.janela.setBackground(Color.white);

        this.lblPet = new JLabel("Pet:");
        this.lblPet.setBounds(30, 20, 80, 20);
        this.getContentPane().add(this.lblPet);

        this.lblAnimal = new JLabel("Animal:");
        this.lblAnimal.setBounds(30, 50, 80, 20);
        this.getContentPane().add(this.lblAnimal);

        this.lblDtNascimento = new JLabel("Data de Nascimento:");
        this.lblDtNascimento.setBounds(30, 80, 150, 20);
        this.getContentPane().add(this.lblDtNascimento);

        this.lblRaça = new JLabel("Raça:");
        this.lblRaça.setBounds(30, 110, 80, 20);
        this.getContentPane().add(this.lblRaça);

        this.txtPet = new JTextField();
        this.txtPet.setBounds(150, 20, 150, 20);
        this.getContentPane().add(this.txtPet);

        this.txtAnimal = new JTextField();
        this.txtAnimal.setBounds(150, 50, 150, 20);
        this.getContentPane().add(this.txtAnimal);

        this.txtDtNascimento = new JTextField();
        this.txtDtNascimento.setBounds(150, 80, 150, 20);
        this.getContentPane().add(this.txtDtNascimento);

        this.txtRaça = new JTextField();
        this.txtRaça.setBounds(150, 110, 150, 20);
        this.getContentPane().add(this.txtRaça);

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
            String pet = txtPet.getText();
            String animal = txtAnimal.getText();
            String dtNascimento = txtDtNascimento.getText();
            String raca = txtRaça.getText();

            JOptionPane.showMessageDialog(this, "Pet: " + pet + "\nAnimal: " + animal + "\nData de Nascimento: "
                    + dtNascimento + "\nRaça: " + raca, "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);

            txtPet.setText("");
            txtAnimal.setText("");
            txtDtNascimento.setText("");
            txtRaça.setText("");
        } else if (e.getSource() == btnCancela) {
            this.dispose();
        }
    }
}
