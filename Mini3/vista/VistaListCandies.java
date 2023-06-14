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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;


public class VistaListCandies extends JFrame{
    static VistaListCandies vista6 = new VistaListCandies();
    public static JTextArea listCandiesTextArea;
    public VistaListCandies(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground5 = new JPanel();
        panelBackground5.setLayout(null);
        panelBackground5.setSize(670, 459);

        JPanel listCandyPanel = new JPanel();
        listCandyPanel.setLayout(null);
        listCandyPanel.setSize(430, 400);
        listCandyPanel.setBackground(new Color(255, 255, 255));
        listCandyPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(listCandyPanel);

        JLabel listCandyLabel = new JLabel( );
        listCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        listCandyLabel.setText("SEARCH A CANDY");
        listCandyLabel.setBounds(40,10,210,40);
        listCandyPanel.add(listCandyLabel);

        JLabel candyNameList = new JLabel("Name");
        candyNameList.setFont(new Font ("Roboto Medium", 0, 14));
        candyNameList.setBounds(40, 80, 150, 30);
        listCandyPanel.add(candyNameList);

        JLabel candyTypeList = new JLabel("Type");
        candyTypeList.setFont(new Font ("Roboto Medium", 0, 14));
        candyTypeList.setBounds(150, 80, 150, 30);
        listCandyPanel.add(candyTypeList);

        listCandiesTextArea = new JTextArea(); 
        listCandiesTextArea.setEditable(false);  

        JScrollPane scroll = new JScrollPane(listCandiesTextArea);
        scroll.setBounds(40,115,150,200);
        listCandyPanel.add(scroll);

        JButton listCandiesButton = new JButton("UPDATE");
        listCandiesButton.setForeground(Color.white);
        listCandiesButton.setBackground(new Color(225,59,59));
        listCandiesButton.setBounds(40, 350, 120, 30);
        listCandyPanel.add(listCandiesButton);

        JButton backButton5 = new JButton("BACK");
        backButton5.setForeground(Color.white);
        backButton5.setBackground(new Color(225,59,59));
        backButton5.setBounds(200, 350, 120, 30);
        botonVolver(backButton5);
        listCandyPanel.add(backButton5);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(370, 10, 60, 60);
        listCandyPanel.add(logo);

        //panel sobre panel
        listCandyPanel.setVisible(true);
        panelBackground5.add(listCandyPanel);
        listCandyPanel.setBounds(115,15,430,430);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground5.add(backGroundPic1);
        panelBackground5.setVisible(true);
        add(panelBackground5);

       
    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista6.setVisible(false);
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
        VistaListCandies frame6 = new VistaListCandies();
        frame6.setVisible(true);
    }
}

