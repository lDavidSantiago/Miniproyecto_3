package Mini3.vista;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;
import Mini3.modelo.ModeloCandy;

public class DulceriaConsola implements DulceriaVista{

    private static ArrayList<ModeloCandy> arrayDulces = new ArrayList<>();

    String candyName,candyType,newCandyName,newCandyType;
    Controlador controlador;
    Scanner input = new Scanner(System.in);
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    

    public void start(Controlador controlador){
        boolean continuar = true;
        this.controlador = controlador;
        while(continuar){
            clearScreen();
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
            String opcion = input.nextLine();

            switch(opcion){
                case "1":
                    System.out.print("Digite el nombre del dulce: ");
                    candyName = input.nextLine();
                    System.out.print("Digite el tipo de dulce: ");
                    candyType = input.nextLine();
                    addCandy(candyName, candyType);
                    controlador.setOperations(Operations.ADD);
                    break;
                case "2":
                    System.out.print("Digite el nombre del dulce: ");
                    candyName = input.nextLine();
                    System.out.print("Digite el nuevo nombre del dulce: ");
                    newCandyName = input.nextLine();
                    System.out.print("Digite el nuevo tipo del dulce: ");
                    newCandyType = input.nextLine();
                    updateCandy(candyName, newCandyName, newCandyType);
                    controlador.setOperations(Operations.UPDATE);
                    break;
                case "3":
                    System.out.print("Digite el nombre del dulce que desea eliminar: ");
                    candyName = input.nextLine();
                    removeCandy(candyName);
                    controlador.setOperations(Operations.REMOVE);
                    break;
                case "4":
                    System.out.print("Digite el nombre del dulce que desea buscar: ");
                    candyName = input.nextLine();
                    System.out.print("Ahora, digite de que tipo es el dulce: ");
                    candyType = input.nextLine();
                    searchCandy(candyName, candyType);
                    controlador.setOperations(Operations.SEARCH);
                    break;
                case "5":
                    listCandies();
                    controlador.setOperations(Operations.LIST);
                    break;
                case "6":
                    continuar = false;
                    continue;
                default:
                    System.out.println("No creo que este numero este dentro de las opciones...");
            }
            input.nextLine();

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
        System.out.println("Nombre Dulce Agregado:" + candyName +"---Tipo Dulce Agregado: " + candyType);
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


    @Override
    public String searchCandy(String candyName, String candyType) {
        ModeloCandy candyFinded = null;
        //AQUI SE ESTAN SUMANDO LAS POSICIONES DE UNA, HAY QUE HACER UN ATRIBUTO O ALGO SIMILAR
        int i = 0;
        for(ModeloCandy dulce : arrayDulces){
            if(dulce.getCandyName().equals(candyName)&& dulce.getCandyType().equals(candyType)){
                candyFinded = dulce;
                break;
                }
        i++;
        }
        if(candyFinded !=null){
            System.out.println("Su dulce es: " + candyFinded.getCandyName() +","+ candyFinded.getCandyType() + " y esta en la posicion " + i);
            return " ";
        }
        else{
            System.out.println("No se pudo encontrar su dulce o no existe :C");
            return " ";
        } 
    }
    
    public String listCandies() {
    StringBuilder result = new StringBuilder();  
    
    for (int i = 0 ; i < arrayDulces.size() ; i++) { 
        System.out.println("\n---Imprimiento la lista de dulces---");
        System.out.println("____________________________________");
        System.out.println("Nombre Dulce: " + arrayDulces.get(i).getCandyName() + "\nTipo Dulce:" + arrayDulces.get(i).getCandyType());
        System.out.println("____________________________________");
        //result.append("Nombre: ").append(arrayDulces.get(i).getCandyName()).append(", Tipo: ").append(arrayDulces.get(i).getCandyType()).append("\n");
    }
    
    return result.toString();
    }
    public String updateCandy(String candyName, String newCandyName, String newCandyType){
        ModeloCandy candyToUpdate = null;
        for(ModeloCandy dulce : arrayDulces){
            if(dulce.getCandyName().equals(candyName)){
                candyToUpdate = dulce;
                break;
            }
        }
        if(candyToUpdate != null){
            candyToUpdate.setCandyName(newCandyName);
            candyToUpdate.setCandyType(newCandyType);
            System.out.println("Dulce Actualizado: " + candyName + "ahora es "+ newCandyName +"," + newCandyType);
            return " ";
        }
        else{
            System.out.println("No se encontro ningun dulce " + candyName);
            return " ";
        }   
    }
}

