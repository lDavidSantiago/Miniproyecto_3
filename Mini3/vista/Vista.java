package Mini3.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class Vista extends JFrame {
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JButton buttonAdd;
    public JButton buttonEnterSecondPanel;

    public Vista() {
        setTitle("Mi Aplicación");
        setSize(300, 250);
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

        // Etiqueta y campo de texto 3
        JLabel label3 = new JLabel("Campo 3:");
        label3.setBounds(20, 100, 60, 25);
        add(label3);

        textField3 = new JTextField();
        textField3.setBounds(90, 100, 150, 25);
        add(textField3);

        // Botón 1
        buttonAdd = new JButton("Botón 1");
        buttonAdd.setBounds(40, 140, 100, 30);
        add(buttonAdd);

        // Botón para entrar al segundo panel
        buttonEnterSecondPanel = new JButton("Segundo Panel");
        buttonEnterSecondPanel.setBounds(160, 140, 120, 30);
        add(buttonEnterSecondPanel);
    }

    public String getCandyName() {
        return textField1.getText();
    }

    public String getCandyType() {
        return textField2.getText();
    }

    public String getCandyInfo() {
        return textField3.getText();
    }

    public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        buttonEnterSecondPanel.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Vista frame = new Vista();
        frame.setVisible(true);
    }
}

