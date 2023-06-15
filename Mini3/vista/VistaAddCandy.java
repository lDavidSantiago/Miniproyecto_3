package Mini3.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class VistaAddCandy extends JFrame {
    static VistaAddCandy vista2 = new VistaAddCandy();
    public static JTextField nameTF;
    public static JTextField typeTF;
    public static JButton backButton;
    public static JButton addCandyButton;
    public VistaAddCandy(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground1 = new JPanel();
        panelBackground1.setLayout(null);
        panelBackground1.setSize(670, 500);

        JPanel addCandyPanel = new JPanel();
        addCandyPanel.setLayout(null);
        addCandyPanel.setSize(570, 400);
        addCandyPanel.setBackground(new Color(255, 255, 255));
        addCandyPanel.setFont(new Font("Roboto Light", 0, 12));
        addCandyPanel.setBackground(Color.white);
        //por ahora el add(addCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(addCandyPanel);

        JLabel addCandyLabel = new JLabel( );
        addCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        addCandyLabel.setText("ADD NEW CANDY");
        addCandyLabel.setBounds(40,10,210,40);
        addCandyPanel.add(addCandyLabel);

        JLabel candyName = new JLabel("Name");
        candyName.setFont(new Font ("Roboto Medium", 0, 14));
        candyName.setBounds(40, 80, 150, 30);
        addCandyPanel.add(candyName);

        nameTF = new JTextField();
        TextPrompt nameTF_ = new TextPrompt("Type candy name",nameTF);
        nameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameTF.setForeground(new java.awt.Color(153, 153, 153));
        nameTF.setBounds(40,115,250,20);
        nameTF.setBorder(null);
        addCandyPanel.add(nameTF);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(40,135,250,10);
        separator1.setForeground(new Color(206,206,206));
        addCandyPanel.add(separator1);

        JLabel candyType = new JLabel("Type");
        candyType.setFont(new Font ("Roboto Medium", 0, 14));
        candyType.setBounds(40, 170, 150, 30);
        addCandyPanel.add(candyType);

        typeTF = new JTextField();
        typeTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeTF.setForeground(new java.awt.Color(153, 153, 153));
        TextPrompt TypeTF_ = new TextPrompt("Candy Type",typeTF);
        typeTF.setBounds(40,205,250,20);
        typeTF.setBorder(null);
        addCandyPanel.add(typeTF);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(40,225,250,10);
        separator2.setForeground(new Color(206,206,206));
        addCandyPanel.add(separator2);

        addCandyButton = new JButton("ADD");
        addCandyButton.setForeground(Color.white);
        addCandyButton.setBackground(new Color(225,59,59));
        addCandyButton.setBounds(40, 295, 120, 30);
        addCandyPanel.add(addCandyButton);

        backButton = new JButton("BACK");
        backButton.setForeground(Color.white);
        backButton.setBackground(new Color(225,59,59));
        backButton.setBounds(200, 295, 120, 30);
        botonVolver(backButton);
        addCandyPanel.add(backButton);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(340, 10, 60, 60);
        addCandyPanel.add(logo);

        //panel sobre panel
        addCandyPanel.setVisible(true);
        panelBackground1.add(addCandyPanel);
        addCandyPanel.setBounds(135,30,400,400);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground1.add(backGroundPic1);
        panelBackground1.setVisible(true);
        add(panelBackground1);

    }
    public  void botonVolver(JButton boton){
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista2.setVisible(false);
                Vista1.vista1.setVisible(true);
            }
        };
        boton.addActionListener(d);
        
    }
    
    public void start(Controlador controlador) {
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        VistaAddCandy frame2 = new VistaAddCandy();
        frame2.setVisible(true);
    }
    public static String getCandyName() {
        return nameTF.getText();
    }
    public static String getCandyType(){
        return typeTF.getText();
    }

}