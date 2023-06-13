package Mini3.vista;

import Mini3.controlador.Controlador;

public interface DulceriaVista {

    public void inicio(Controlador controlador);
    public String getName();
    public String getType();
    public void setDulce(String resultado);
    
}
