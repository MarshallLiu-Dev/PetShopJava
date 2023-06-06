package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pet extends JFrame implements ActionListener {

    private JTextField txtAnimal;
    private JTextField txtDtNascimento;
    private JTextField txtRaca;
    private JTextField txtEndereco;
    private JButton btnCadastro;
    private JButton btnCancelar;

    public Pet(String title) {
        super(title);

        // Definir layout para a janela
        setLayout(new GridLayout(6, 19));

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
        SwingUtilities.invokeLater(() -> new Pet("Pet"));
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
