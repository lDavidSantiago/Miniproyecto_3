package Mini3.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class Vista1 extends JFrame {
    public static JTextField jTextField1;
    public static JButton botonFrames;
    public static int opcionNumerito;
    static Vista1 vista1 = new Vista1();

    public Vista1(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        jTextField1 = new JTextField();
        TextPrompt holderMain = new TextPrompt("Ingrese una opcion",jTextField1);
        jTextField1.setFont(new Font("Roboto Light", 0, 12));
        jTextField1.setForeground(new Color(153, 153, 153));
        jTextField1.setBounds(40,285,120,30);
        jTextField1.setBorder(null);
        panelPrincipal.add(jTextField1);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(40,315,120,10);
        separator1.setForeground(new Color(206,206,206));
        panelPrincipal.add(separator1);

        botonFrames = new JButton("OK");
        botonFrames.setForeground(Color.white);
        botonFrames.setBackground(new Color(225,59,59));
        botonFrames.setBounds(180, 285, 120, 30);
        botonAceptar(botonFrames,panelPrincipal,jTextField1);
        

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
    public static void botonAceptar(JButton boton,JPanel panel,JTextField cf){
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                opcionNumerito=Integer.parseInt(cf.getText());
                seleccionMenuOpciones(opcionNumerito);
                cf.setText("");
            }
        };
        boton.addActionListener(al);
        panel.add(boton);
        
    }
    
    public static void seleccionMenuOpciones(int opcion){
        switch (opcion){
            case 1:
                Vista1.vista1.setVisible(false);
                VistaAddCandy.vista2.setVisible(true);
                break;
            case 2:
                Vista1.vista1.setVisible(false);
                VistaUpdateCandy.vista3.setVisible(true);
                break;
            case 3:
                Vista1.vista1.setVisible(false);
                VistaDeleteCandy.vista4.setVisible(true);
                break;
            case 4:
                Vista1.vista1.setVisible(false);
                VistaSearchCandy.vista5.setVisible(true);
                break;
            case 5:
                Vista1.vista1.setVisible(false);
                VistaListCandies.vista6.setVisible(true);
                break;

            default:
                JOptionPane.showMessageDialog(null,"error, ingrese una opcion valida ","ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public void inicio(JFrame view) {//trabajo con vista1 que es estatico 
        view.setVisible(false);
        vista1.setVisible(true);

    }

    public void start(Controlador controlador) {
        VistaAddCandy.addCandyButton.addActionListener(controlador);
        VistaDeleteCandy.deleteCandyButton.addActionListener(controlador); 
        VistaListCandies.listCandiesButton.addActionListener(controlador);
        VistaUpdateCandy.updateCandyButton.addActionListener(controlador); 
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed(ActionEvent press){

    }
    
    public String getCandyNametoDelete(){
        return VistaDeleteCandy.getCandyName();
    }
    public String getCandyName(){
        return VistaAddCandy.getCandyName();
    }

    public String getCandyType(){
        return VistaAddCandy.getCandyType();
    }
    public void setList(String lista){
        VistaListCandies.listCandiesTextArea.setText(lista);
    }
    public String getNewCandyName(){
        return VistaUpdateCandy.getNewCandyName();
    }
    public String getOldCandyName(){
        return VistaUpdateCandy.getOldCandyName();
    }
    public String getNewCandyType(){
        return VistaUpdateCandy.getNewCandyType();
    }
    public static void main(String[] args) {
        Vista1 frame = new Vista1();
        frame.setVisible(true);
    }
    
}