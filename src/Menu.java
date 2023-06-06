import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame implements ActionListener{ 
   

	public static void  main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Criar o JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Criar os JMenus
        JMenu clienteMenu = new JMenu("Clientes");
        JMenu petMenu = new JMenu("Pet");
        JMenu servicosMenu = new JMenu("Serviços");

        // Criar os JMenuItems
        JMenuItem clienteItem = new JMenuItem("Novo Cliente");
        JMenuItem petItem = new JMenuItem("Pet");
        JMenuItem servicosItem = new JMenuItem("Serviços");

        // Adicionar os JMenuItems aos JMenus
        clienteMenu.add(clienteItem);
        petMenu.add(petItem);
        servicosMenu.add(servicosItem);

        // Adicionar os JMenus à JMenuBar
        menuBar.add(clienteMenu);
        menuBar.add(petMenu);
        menuBar.add(servicosMenu);

        // Adicionar a JMenuBar ao JFrame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
   
    
        // Criação do botão de "Abrir"
        // JButton abrirButton = new JButton("Abrir");

        // Configuração do evento de clique do botão "Abrir"
       clienteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Cliente janelaGUI = new Cliente("Cadastro"); 
                janelaGUI.setVisible(true);
            }
        });
        
        // Configuração do evento de clique do botão "Abrir"
       petItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Pet janelaGUI = new Pet("Animal"); 
                janelaGUI.setVisible(true);
            }
        });
                // Configuração do evento de clique do botão "Abrir"
      servicosItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a GUI desejada
                // MinhaJanelaGUI janelaGUI = new MinhaJanelaGUI();
                Servico janelaGUI = new Servico("Atendimento");
                janelaGUI.setVisible(true);
            }
        });


 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JButton;
// import java.awt.CardLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Menu extends JFrame {
//     private CardLayout cardLayout;
//     private JPanel cardPanel;
//     private JButton btnTela1;
//     private JButton btnTela2;
//     private JPanel tela1;
//     private JPanel tela2;

//     public Menu() {
//         setTitle("Menu");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(300, 200);

//         cardLayout = new CardLayout();
//         cardPanel = new JPanel(cardLayout);

//         tela1 = new JPanel();
//         tela1.add(new JButton("Clientes"));

//         tela2 = new JPanel();
//         tela2.add(new JButton("Serviços"));

//         cardPanel.add(tela1, "tela1");
//         cardPanel.add(tela2, "tela2");

//         btnTela1 = new JButton("Abrir Tela 1");
//         btnTela1.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 cardLayout.show(cardPanel, "tela1");
//             }
//         });

//         btnTela2 = new JButton("Abrir Tela 2");
//         btnTela2.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 cardLayout.show(cardPanel, "tela2");
//             }
//         });

//         JPanel menuPanel = new JPanel();
//         menuPanel.add(btnTela1);
//         menuPanel.add(btnTela2);

//         getContentPane().add(menuPanel, "North");
//         getContentPane().add(cardPanel);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Menu();
//     }
// }
