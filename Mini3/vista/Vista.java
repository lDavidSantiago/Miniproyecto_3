package Mini3.vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;

    public Vista() {
        setTitle("Mi Aplicación");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente

        // Etiqueta y campo de texto 1
        JLabel label1 = new JLabel("Campo 1:");
        label1.setBounds(20, 20, 60, 25);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(90, 20, 150, 25);
        add(textField1);

        // Etiqueta y campo de texto 2
        JLabel label2 = new JLabel("Campo 2:");
        label2.setBounds(20, 60, 60, 25);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(90, 60, 150, 25);
        add(textField2);

        // Botón 1
        button1 = new JButton("Botón 1");
        button1.setBounds(40, 100, 100, 30);
        add(button1);

        // Botón 2
        button2 = new JButton("Botón 2");
        button2.setBounds(160, 100, 100, 30);
        add(button2);
    }

    public static void main(String[] args) {
        Vista frame = new Vista();
        frame.setVisible(true);
    }
}

