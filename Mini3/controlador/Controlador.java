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
        this.view.buttonAdd.addActionListener(this);
    }
    public void starting(){
        view.start(this);
    }
   
    public void actionPerformed(ActionEvent e) {
        switch (operations){
            case ADD:
            model.setCandyName(view.textField1.getText());
            model.setCandyType(view.textField2.getText());
            model.addCandy((view.textField1.getText()),(view.textField2.getText()));
            view.textField3.setText(model.listCandies());
            case UPDATE:
            
            default:
                break;
        }
        
    }
}

