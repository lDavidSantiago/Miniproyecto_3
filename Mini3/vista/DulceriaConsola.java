package Mini3.vista;
import java.util.Scanner;

import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class DulceriaConsola implements DulceriaVista{

    String nombre,tipo;
    Controlador controlador;
    Scanner scanner = new Scanner(System.in);

    public void inicio(Controlador controlador){
        boolean continuar = true;
        this.controlador = controlador;
        while(continuar){
            System.out.println("--------------------");
            System.out.println("---  Bienvenido  ---");
            System.out.println("--------------------");
            System.out.println("---lista de opciones");
            System.out.println("1) Add candies");
            System.out.println("2) Update candies ");
            System.out.println("3) Delete candies");
            System.out.println("4) Search by name");
            System.out.println("5) List candies");
            System.out.println("6) Salir");
            String opcion = scanner.nextLine();

            switch(opcion){
                case "1":
                    System.out.println("Digite el nombre del dulce: ");
                    nombre = scanner.nextLine();
                    System.out.println("Digite el tipo de dulce: ");
                    tipo = scanner.nextLine();
                    controlador.setOperations(Operations.ADD);
                    break;
                case "2":
                    controlador.setOperations(Operations.UPDATE);
                    break;
                case "3":
                    controlador.setOperations(Operations.REMOVE);
                    break;
                case "4":
                    controlador.setOperations(Operations.SEARCH);
                    break;
                case "5":
                    controlador.setOperations(Operations.LIST);
                    break;
                case "6":
                    continuar = false;
                    continue;
            }

        }
    }

    public String getName() {
        return nombre;
    }

    public String getType() {
        return tipo;
    }

    public void setDulce() {
        System.out.println("El nombre del dulce es: "+ getType());

    }
}
