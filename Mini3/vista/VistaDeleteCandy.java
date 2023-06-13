package Mini3.vista;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;


public class VistaDeleteCandy extends JFrame{
    public VistaDeleteCandy(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground3 = new JPanel();
        panelBackground3.setLayout(null);
        panelBackground3.setSize(670, 459);

        JPanel deleteCandyPanel = new JPanel();
        deleteCandyPanel.setLayout(null);
        deleteCandyPanel.setSize(430, 300);
        deleteCandyPanel.setBackground(new Color(255, 255, 255));
        deleteCandyPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(deleteCandyPanel);

        JLabel deleteCandyLabel = new JLabel( );
        deleteCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        deleteCandyLabel.setText("DELETE A CANDY");
        deleteCandyLabel.setBounds(40,10,210,40);
        deleteCandyPanel.add(deleteCandyLabel);

        JLabel candyNameDelete = new JLabel("Name");
        candyNameDelete.setFont(new Font ("Roboto Medium", 0, 14));
        candyNameDelete.setBounds(40, 80, 150, 30);
        deleteCandyPanel.add(candyNameDelete);

        JTextField nameDeleteTF = new JTextField();
        nameDeleteTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameDeleteTF.setForeground(new java.awt.Color(153, 153, 153));
        nameDeleteTF.setText("Candy´s name you want to delete");
        nameDeleteTF.setBounds(40,115,250,20);
        nameDeleteTF.setBorder(null);
        deleteCandyPanel.add(nameDeleteTF);

        JSeparator separator6 = new JSeparator();
        separator6.setBounds(40,135,250,10);
        separator6.setForeground(new Color(206,206,206));
        deleteCandyPanel.add(separator6);

        JButton deleteCandyButton = new JButton("DELETE");
        deleteCandyButton.setForeground(Color.white);
        deleteCandyButton.setBackground(new Color(225,59,59));
        deleteCandyButton.setBounds(40, 195, 120, 30);
        deleteCandyPanel.add(deleteCandyButton);

        JButton backButton3 = new JButton("BACK");
        backButton3.setForeground(Color.white);
        backButton3.setBackground(new Color(225,59,59));
        backButton3.setBounds(200, 195, 120, 30);
        deleteCandyPanel.add(backButton3);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(370, 10, 60, 60);
        deleteCandyPanel.add(logo);

        //panel sobre panel
        deleteCandyPanel.setVisible(true);
        panelBackground3.add(deleteCandyPanel);
        deleteCandyPanel.setBounds(115,80,430,300);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground3.add(backGroundPic1);
        panelBackground3.setVisible(true);
        add(panelBackground3);

    }
    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaDeleteCandy frame4 = new VistaDeleteCandy();
        frame4.setVisible(true);
    }
}
