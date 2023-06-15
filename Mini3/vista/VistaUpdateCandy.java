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


public class VistaUpdateCandy extends JFrame{
    static VistaUpdateCandy vista3 = new VistaUpdateCandy();
    public static JTextField oldNameTF;
    public static JTextField newNameTF;
    public static JTextField newTypeTF;
    public static JButton updateCandyButton;
    public static JLabel candyOldName;
    public VistaUpdateCandy(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground2 = new JPanel();
        panelBackground2.setLayout(null);
        panelBackground2.setSize(670, 459);

        JPanel updateCandyPanel = new JPanel();
        updateCandyPanel.setLayout(null);
        updateCandyPanel.setSize(430, 400);
        updateCandyPanel.setBackground(new Color(255, 255, 255));
        updateCandyPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(updateCandyPanel);

        JLabel updateCandLabel = new JLabel( );
        updateCandLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        updateCandLabel.setText("UPDATE CANDY");
        updateCandLabel.setBounds(40,10,210,40);
        updateCandyPanel.add(updateCandLabel);

       candyOldName = new JLabel("Name");
        candyOldName.setFont(new Font ("Roboto Medium", 0, 14));
        candyOldName.setBounds(40, 80, 150, 30);
        updateCandyPanel.add(candyOldName);

        oldNameTF = new JTextField();
        oldNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        oldNameTF.setForeground(new java.awt.Color(153, 153, 153));
        oldNameTF.setText("Candy´s old name");
        oldNameTF.setBounds(40,115,250,20);
        oldNameTF.setBorder(null);
        updateCandyPanel.add(oldNameTF);

        JSeparator separator3 = new JSeparator();
        separator3.setBounds(40,135,250,10);
        separator3.setForeground(new Color(206,206,206));
        updateCandyPanel.add(separator3);

        JLabel candyNewName = new JLabel("New name");
        candyNewName.setFont(new Font ("Roboto Medium", 0, 14));
        candyNewName.setBounds(40, 175, 150, 30);
        updateCandyPanel.add(candyNewName);

        newNameTF = new JTextField();
        newNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newNameTF.setForeground(new java.awt.Color(153, 153, 153));
        newNameTF.setText("Candy´s new name");
        newNameTF.setBounds(40,210,250,20);
        newNameTF.setBorder(null);
        updateCandyPanel.add(newNameTF);

        JSeparator separator4 = new JSeparator();
        separator4.setBounds(40,230,250,10);
        separator4.setForeground(new Color(206,206,206));
        updateCandyPanel.add(separator4);

        ////////////////////////////////////

        JLabel candyNewType = new JLabel("New Type");
        candyNewType.setFont(new Font ("Roboto Medium", 0, 14));
        candyNewType.setBounds(40, 265, 150, 30);
        updateCandyPanel.add(candyNewType);

        newTypeTF = new JTextField();
        newTypeTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newTypeTF.setForeground(new java.awt.Color(153, 153, 153));
        newTypeTF.setText("Candy´s new type");
        newTypeTF.setBounds(40,300,250,20);
        newTypeTF.setBorder(null);
        updateCandyPanel.add(newTypeTF);

        JSeparator separator5 = new JSeparator();
        separator5.setBounds(40,320,250,10);
        separator5.setForeground(new Color(206,206,206));
        updateCandyPanel.add(separator5);
        

        updateCandyButton = new JButton("UPDATE");
        updateCandyButton.setForeground(Color.white);
        updateCandyButton.setBackground(new Color(225,59,59));
        updateCandyButton.setBounds(40, 355, 120, 30);
        updateCandyPanel.add(updateCandyButton);

        JButton backButton3 = new JButton("BACK");
        backButton3.setForeground(Color.white);
        backButton3.setBackground(new Color(225,59,59));
        backButton3.setBounds(200, 355, 120, 30);
        botonVolver(backButton3);
        updateCandyPanel.add(backButton3); 

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(370, 10, 60, 60);
        updateCandyPanel.add(logo);

        //panel sobre panel
        updateCandyPanel.setVisible(true);
        panelBackground2.add(updateCandyPanel);
        updateCandyPanel.setBounds(115,30,430,400);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground2.add(backGroundPic1);
        panelBackground2.setVisible(true);
        add(panelBackground2);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista3.setVisible(false);
                Vista1.vista1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }
    public static String getNewCandyName(){
        return newNameTF.getText();
    }
    public static String getOldCandyName(){
        return oldNameTF.getText();
    }
    public static String getNewCandyType(){
        return newTypeTF.getText();
    }

    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaUpdateCandy frame3 = new VistaUpdateCandy();
        frame3.setVisible(true);
    }
}