package Mini3.vista;
import java.util.ArrayList;
import java.util.Scanner;


import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;
import Mini3.modelo.ModeloCandy;

public class DulceriaConsola implements DulceriaVista{

    private static ArrayList<ModeloCandy> arrayDulces = new ArrayList<>();

    String candyName,candyType,newCandyName,newCandyType;
    Controlador controlador;
    Scanner scanner = new Scanner(System.in);
    

    public void start(Controlador controlador){
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
            System.out.print("Digite la opcion deseada: ");
            String opcion = scanner.nextLine();

            switch(opcion){
                case "1":
                    System.out.print("Digite el nombre del dulce: ");
                    candyName = scanner.nextLine();
                    System.out.print("Digite el tipo de dulce: ");
                    candyType = scanner.nextLine();
                    addCandy(candyName, candyType);
                    controlador.setOperations(Operations.ADD);
                    break;
                case "2":
                    controlador.setOperations(Operations.UPDATE);
                    break;
                case "3":
                    System.out.print("Digite el nombre del dulce que desea eliminar: ");
                    candyName = scanner.nextLine();
                    removeCandy(candyName);
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
                default:
                    System.out.println("No creo que este numero este dentro de las opciones...");
                
            }

        }
    }


    @Override
    public String getCandyName(){
        return candyName;
        
    }

    @Override
    public String getCandyType() {
        return candyType;
    }

    @Override
    public String getCandyNametoDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCandyNametoDelete'");
    }

    @Override
    public void setList(String lista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setList'");
    }

    @Override
    public String getOldCandyName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOldCandyName'");
    }


    @Override
    public String getNewCandyName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNewCandyName'");
    }


    @Override
    public String getNewCandyType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNewCandyType'");
    }

    public void addCandy(String candyName, String candyType) {
        ModeloCandy dulce = new ModeloCandy(candyName, candyType);
        arrayDulces.add(dulce);
        System.out.println(candyName + candyType);
    }


    @Override
    public void removeCandy(String candyName) {
        ModeloCandy candyToRemove = null;
        for(ModeloCandy dulce : arrayDulces) {
            if(dulce.getCandyName().equals(candyName)){
                candyToRemove = dulce;
                break;
            }
        }
        if(candyToRemove != null){
            arrayDulces.remove(candyToRemove);
            System.out.println("Dulce elimnado: " + candyToRemove.getCandyName());
        }
        else{
            System.out.println("No se encontro ningun dulce "+ candyName);
        }
    }    
}

