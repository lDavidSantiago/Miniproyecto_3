package Mini3.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Mini3.modelo.ModeloCandy;
import Mini3.vista.Vista;

public class Controlador implements ActionListener{

    private Vista view;
    private ModeloCandy model;
    private Operations operations;
    
    public Operations getOperations() {
        return operations;
    }
    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public Controlador(Vista view, ModeloCandy model) {
        this.view = view;
        this.model = model;

    }
    public void starting(){
        view.start(this);
    }
   
    public void actionPerformed(ActionEvent e) {
    switch (operations) {
        case ADD:
            String candyName = view.textField1.getText();
            String candyType = view.textField2.getText();

            model.setCandyName(candyName);
            model.setCandyType(candyType);
            model.addCandy(candyName, candyType);
            view.textField3.setText(model.listCandies());
            break; // Agregar este break

        case UPDATE:
            // Código para la actualización

        default:
            break;
    }
}

}

