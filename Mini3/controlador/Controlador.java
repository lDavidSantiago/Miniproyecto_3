package Mini3.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Mini3.modelo.ModeloCandy;
import Mini3.vista.Vista1;
import Mini3.vista.VistaAddCandy;
import Mini3.vista.VistaDeleteCandy;
import Mini3.vista.VistaListCandies;
import Mini3.vista.VistaUpdateCandy;
import Mini3.vista.VistaSearchCandy;

public class Controlador implements ActionListener{

    private Vista1 view;
    private ModeloCandy model;
    private Operations operations;
    
    public Operations getOperations() {
        return operations;
    }
    public void setOperations(Operations operations) {
        this.operations = operations;
    }
    public Controlador(Vista1 view, ModeloCandy model) {
        this.view = view;
        this.model = model;
    }
    public void starting(){
        view.start(this);
    }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VistaAddCandy.addCandyButton || operations == Operations.ADD){
            model.setCandyName(view.getCandyName());
            model.setCandyType(view.getCandyType());
            model.addCandy((model.getCandyName()),(model.getCandyType()));
            System.out.println(model.listCandies());
        }
        if(e.getSource() == VistaDeleteCandy.deleteCandyButton || operations == Operations.REMOVE){
            model.setCandyName(view.getCandyNametoDelete());
            model.removeCandy(model.getCandyName());
            System.out.println("FUNCIONO");
        }
        if(e.getSource() == VistaListCandies.listCandiesButton || operations == Operations.LIST){
            view.setList(model.listCandies());
            System.out.println("aaaa");
        }
        if(e.getSource() == VistaUpdateCandy.updateCandyButton || operations == Operations.UPDATE){
            model.updateCandy(view.getOldCandyName(),view.getNewCandyName(),view.getNewCandyType());
            System.out.println("waza");
        }
        if(e.getSource() == VistaSearchCandy.searchCandyButton || operations == Operations.SEARCH){
            model.searchCandy(view.getCandyName(), view.getCandyType());
            System.out.println("ES CINE");
        } 
    }
    
    
}
    

    
    
    


