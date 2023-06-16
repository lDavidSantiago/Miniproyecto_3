package Mini3;

import Mini3.controlador.Controlador;
import Mini3.modelo.ModeloCandy;
import Mini3.vista.Vista1;
//import Mini3.vista.DulceriaConsola;
import Mini3.vista.DulceriaVista;


public class Main{
    public static void main(String[] args){
        ModeloCandy mod = new ModeloCandy();
        //DulceriaVista view = new DulceriaConsola();
        DulceriaVista view = new Vista1();

        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.starting();
        
        
    }
}