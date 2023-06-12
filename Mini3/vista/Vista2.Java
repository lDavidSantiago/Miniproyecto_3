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


public class Vista2 extends JFrame {
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField4;
    public JButton buttonAdd;
    public JButton buttonEnterSecondPanel;

    public Vista2()  {
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

    }
    public static void main(String[] args) {
        Vista2 frame = new Vista2();
        frame.setVisible(true);
    }
}