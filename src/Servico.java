import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Servico extends JFrame implements ActionListener {
    private JLabel janela;
    private JLabel lblServico;
    private JLabel lblValor;
    private JLabel lblTempoMedio;
    private JLabel lblEndereco;
    private JTextField txtServico;
    private JTextField txtValor;
    private JTextField txtTempoMedio;
    private JTextField txtEndereco;
    private JButton btnCadastro;
    private JButton btnCancela;

    // cores
    Color red = new Color(255,0,0);
    Color green = new Color(0,128,0);
    // Color silver = new Color(192,192,192);

    public Servico(String nome) {
        super(nome);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.janela = new JLabel("");
        this.janela.setBounds(30, 140, 100, 30);
        this.getContentPane().add(this.janela);
        this.janela.setBackground(Color.white);

        this.lblServico = new JLabel("Serviço:");
        this.lblServico.setBounds(30, 20, 80, 20);
        this.getContentPane().add(this.lblServico);

        this.lblValor = new JLabel("Valor:");
        this.lblValor.setBounds(30, 50, 80, 20);
        this.getContentPane().add(this.lblValor);

        this.lblTempoMedio = new JLabel("Tempo Médio:");
        this.lblTempoMedio.setBounds(30, 80, 100, 20);
        this.getContentPane().add(this.lblTempoMedio);

        this.lblEndereco = new JLabel("Endereço:");
        this.lblEndereco.setBounds(30, 110, 80, 20);
        this.getContentPane().add(this.lblEndereco);

        this.txtServico = new JTextField();
        this.txtServico.setBounds(150, 20, 150, 20);
        this.getContentPane().add(this.txtServico);

        this.txtValor = new JTextField();
        this.txtValor.setBounds(150, 50, 150, 20);
        this.getContentPane().add(this.txtValor);

        this.txtTempoMedio = new JTextField();
        this.txtTempoMedio.setBounds(150, 80, 150, 20);
        this.getContentPane().add(this.txtTempoMedio);

        this.txtEndereco = new JTextField();
        this.txtEndereco.setBounds(150, 110, 150, 20);
        this.getContentPane().add(this.txtEndereco);

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
            String servico = txtServico.getText();
            String valor = txtValor.getText();
            String tempoMedio = txtTempoMedio.getText();
            String endereco = txtEndereco.getText();

            JOptionPane.showMessageDialog(this, "Serviço: " + servico + "\nValor: " + valor + "\nTempo Médio: "
                    + tempoMedio + "\nEndereço: " + endereco, "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);

            txtServico.setText("");
            txtValor.setText("");
            txtTempoMedio.setText("");
            txtEndereco.setText("");
        } else if (e.getSource() == btnCancela) {
            this.dispose();
        }
    }
}
