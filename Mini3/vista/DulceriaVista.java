package Mini3.vista;


import Mini3.controlador.Controlador;

public interface DulceriaVista {

    public void start(Controlador controlador);
    
    public String getNewCandyName();

    public String getNewCandyType();
    
    public String getCandyName();
    
    public String getCandyType();
    
    public String getCandyNametoDelete();
    
    public void setList(String lista);
    
    public String getOldCandyName();
    
    public  void addCandy(String candyName, String candyType);

    public  void removeCandy(String candyName);

    
}
