package Mini3.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class Vista1 extends JFrame {
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField4;
    public JButton buttonAdd;
    public JButton buttonEnterSecondPanel;


    public Vista1(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground = new JPanel();
        panelBackground.setLayout(null);
        panelBackground.setSize(670, 500);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setSize(570, 400);
        panelPrincipal.setBackground(Color.white);
        
        JLabel label1 = new JLabel("CANDY STF");
        label1.setFont(new Font ("Roboto Medium", 0, 24));
        label1.setBounds(40, 10, 210, 40);
        panelPrincipal.add(label1);

        JLabel label2 = new JLabel("1) Add candies");
        label2.setFont(new Font ("Roboto Medium", 0, 14));
        label2.setBounds(40, 80, 150, 30);
        panelPrincipal.add(label2);

        JLabel label3 = new JLabel("2) Update candies ");
        label3.setFont(new Font ("Roboto Medium", 0, 14));
        label3.setBounds(40, 115, 150, 30);
        panelPrincipal.add(label3);
 
        JLabel label4 = new JLabel("3) Delete candies");
        label4.setFont(new Font ("Roboto Medium", 0, 14));
        label4.setBounds(40, 150, 150, 30);
        panelPrincipal.add(label4);

        JLabel label5 = new JLabel("4) Search by name");
        label5.setFont(new Font ("Roboto Medium", 0, 14));
        label5.setBounds(40, 185, 150, 30);
        panelPrincipal.add(label5);

        JLabel label6 = new JLabel("5) List candies");
        label6.setFont(new Font ("Roboto Medium", 0, 14));
        label6.setBounds(40, 220, 150, 30);
        panelPrincipal.add(label6);

        //Falta el holder
        JTextField jTextField1 = new JTextField("Select an option");
        jTextField1.setFont(new Font("Roboto Light", 0, 12));
        jTextField1.setForeground(new Color(153, 153, 153));
        jTextField1.setBounds(40,285,120,30);
        panelPrincipal.add(jTextField1);

        buttonEnterSecondPanel = new JButton("OK");
        buttonEnterSecondPanel.setForeground(Color.white);
        buttonEnterSecondPanel.setBackground(new Color(225,59,59));
        buttonEnterSecondPanel.setBounds(180, 285, 120, 30);
        panelPrincipal.add(buttonEnterSecondPanel);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(340, 10, 60, 60);
        panelPrincipal.add(logo);
        //PANEL ENCIMA DE OTRO PANEL
        panelPrincipal.setVisible(true);
        panelBackground.add(panelPrincipal);
        panelPrincipal.setBounds(135,30,400,400);
        JLabel backGroundPic = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic.setBounds(0,0,670,459);
        panelBackground.add(backGroundPic);
        

        panelBackground.setVisible(true);
        add(panelBackground);
    }

    public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Vista1 frame = new Vista1();
        frame.setVisible(true);
    }
}