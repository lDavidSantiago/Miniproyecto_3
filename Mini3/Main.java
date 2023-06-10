package Mini3;

import Mini3.controlador.Controlador;
import Mini3.modelo.ModeloCandy;
import Mini3.vista.Vista;

public class Main{
    public static void main(String[] args){
        ModeloCandy mod = new ModeloCandy();
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.starting();
        view.setVisible(true);
        }
}