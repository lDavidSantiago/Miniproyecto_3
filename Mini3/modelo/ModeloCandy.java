package Mini3.modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModeloCandy {
    private String candyName;
    private String candyType;
    private String newCandyName;
    private String newCandyType;
    
    private static ArrayList<ModeloCandy> arrayDulces = new ArrayList<>();

    
    public ModeloCandy() {
    }

    public String getNewCandyName() {
        return newCandyName;
    }
    
    public ModeloCandy(String candyName2, String candyType2) {
    this.candyName = candyName2;
    this.candyType = candyType2;
    }


    public void setNewCandyName(String newCandyName) {
        this.newCandyName = newCandyName;
    }

    public String getNewCandyType() {
        return newCandyType;
    }

    public void setNewCandyType(String newCandyType) {
        this.newCandyType = newCandyType;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public String getCandyType() {
        return candyType;
    }

    public void setCandyType(String candyType) {
        this.candyType = candyType;
    }

    public ArrayList<ModeloCandy> getArrayDulces() {
        return arrayDulces;
    }

    public void setArrayDulces(ArrayList<ModeloCandy> arrayDulces) {
        ModeloCandy.arrayDulces = arrayDulces;
    }

    public  void addCandy(String candyName, String candyType) {
        ModeloCandy dulce = new ModeloCandy(candyName, candyType);
        arrayDulces.add(dulce);
        System.out.println(candyName + candyType);
        
        }
    
    public  void removeCandy(String candyName) {
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
            return "Dulce Actualizado: " + candyName + "ahora es "+ newCandyName +"," + newCandyType;
        }
        else{
            return "No se encontro ningun dulce " + candyName;
        }   
    }

    public String listCandies() {
    StringBuilder result = new StringBuilder();  
    
    for (int i = 0 ; i < arrayDulces.size() ; i++) { 
        result.append("Nombre: ").append(arrayDulces.get(i).getCandyName()).append(", Tipo: ").append(arrayDulces.get(i).getCandyType()).append("\n");
    }
    
    return result.toString();
}

    public String searchCandy(String candyName, String candyType){
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

            JOptionPane.showMessageDialog(null, "Su dulce es: " + candyFinded.getCandyName() +","+ candyFinded.getCandyType() + " y esta en la posicion " + i);

            return " ";

        }
        else{
            return "No se pudo encontrar su dulce o no existe :C";
        }
     }

    



}


