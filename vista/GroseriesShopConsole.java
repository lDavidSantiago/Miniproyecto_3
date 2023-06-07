package Miniproyecto_3.vista;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Miniproyecto_3.controlador.ControladorGroseriesStore;
import Miniproyecto_3.controlador.Options;
import Miniproyecto_3.modelo.Dulce;

public class GroseriesShopConsole implements GroseriesVista{
    String nombre,tipoDulce,temporalname;
    int index;
    ControladorGroseriesStore controlador;
    Dulce dulce;

    public void crearDulce(){
        String nombre,tipoDulce;
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
        tipoDulce = JOptionPane.showInputDialog(null,"Ingrese el tipo");

    }

       public void iniciar(ControladorGroseriesStore controlador) {
        boolean continuar = true;
        this.controlador = controlador;
        while(continuar){
            System.out.println("----------------");
            System.out.println("----------------");
            System.out.println("-- Bienvenido --");
            System.out.println("----------------");
            System.out.println("Que deseas hacer?");
            System.out.println("REMOVE");
            System.out.println("ADD");
            System.out.println("LIST"); 
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();
            switch(opcion){
                case "Añadir":
                controlador.setOptions(Options.ADD);
            
       
        }      }
    }
     
   
   
   
   
    public String getNombre() {
        return nombre;
    }

    public String getTipoDulce() {
        return tipoDulce;
    }

    public String getTemporalname() {
        return temporalname;
    }

    public int getIndex() {
        return index;
    }
    public Dulce getDulce() {
        return dulce;}
}