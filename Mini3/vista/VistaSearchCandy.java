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

public class VistaSearchCandy extends JFrame{
    static VistaSearchCandy vista5 = new VistaSearchCandy();
    public static JTextField nameSearchTF;
    public VistaSearchCandy(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground4 = new JPanel();
        panelBackground4.setLayout(null);
        panelBackground4.setSize(670, 459);

        JPanel searchCandyPanel = new JPanel();
        searchCandyPanel.setLayout(null);
        searchCandyPanel.setSize(430, 300);
        searchCandyPanel.setBackground(new Color(255, 255, 255));
        searchCandyPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(searchCandyPanel);

        JLabel searchCandyLabel = new JLabel( );
        searchCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        searchCandyLabel.setText("SEARCH A CANDY");
        searchCandyLabel.setBounds(40,10,210,40);
        searchCandyPanel.add(searchCandyLabel);

        JLabel candyNameSearch = new JLabel("Name");
        candyNameSearch.setFont(new Font ("Roboto Medium", 0, 14));
        candyNameSearch.setBounds(40, 80, 150, 30);
        searchCandyPanel.add(candyNameSearch);

        nameSearchTF = new JTextField();
        nameSearchTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameSearchTF.setForeground(new java.awt.Color(153, 153, 153));
        nameSearchTF.setText("Candy´s name you want to search");
        nameSearchTF.setBounds(40,115,250,20);
        nameSearchTF.setBorder(null);
        searchCandyPanel.add(nameSearchTF);

        JSeparator separator7 = new JSeparator();
        separator7.setBounds(40,135,250,10);
        separator7.setForeground(new Color(206,206,206));
        searchCandyPanel.add(separator7);

        JButton searchCandyButton = new JButton("SEARCH");
        //Que la accion del boton saque un joptionMessage
        searchCandyButton.setForeground(Color.white);
        searchCandyButton.setBackground(new Color(225,59,59));
        searchCandyButton.setBounds(40, 195, 120, 30);
        searchCandyPanel.add(searchCandyButton);

        JButton backButton4 = new JButton("BACK");
        backButton4.setForeground(Color.white);
        backButton4.setBackground(new Color(225,59,59));
        backButton4.setBounds(200, 195, 120, 30);
        botonVolver(backButton4);
        searchCandyPanel.add(backButton4);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(370, 10, 60, 60);
        searchCandyPanel.add(logo);

        //panel sobre panel
        searchCandyPanel.setVisible(true);
        panelBackground4.add(searchCandyPanel);
        searchCandyPanel.setBounds(115,80,430,300);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground4.add(backGroundPic1);
        panelBackground4.setVisible(true);
        add(panelBackground4);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista5.setVisible(false);
                Vista1.vista1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }
    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaSearchCandy frame5 = new VistaSearchCandy();
        frame5.setVisible(true);
    }
}
