package Mini3.modelo;

import java.util.ArrayList;

public class ModeloCandy {
    private String candyName;
    private String candyType;
    private String newCandyName;
    private String newCandyType;
    private String text_;
    
    private static ArrayList<ModeloCandy> arrayDulces = new ArrayList<>();

    
    public String getText_() {
        return text_;
    }

    public void setText_(String text_) {
        this.text_ = text_;
    }
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
        ModeloCandy n = new ModeloCandy(candyName, candyType);
        arrayDulces.add(n);
        
        }
    
    public  void removeCandy(String candyName, String candyType) {
        ModeloCandy candyToRemove = null;
        for(ModeloCandy dulce : arrayDulces) {
            if(dulce.getCandyName().equals(candyName) && dulce.getCandyType().equals(candyType)){
                candyToRemove = dulce;
                break;
            }
        }
        if(candyToRemove != null){
            arrayDulces.remove(candyToRemove);
            System.out.println("Dulce elimnado: " + candyToRemove.getCandyName()+","+candyToRemove.getCandyType());
        }
        else{
            System.out.println("No se encontro ningun dulce "+ candyName +","+ candyType);
        }
    }

    public String updateCandy(String candyName, String candyType, String newCandyName, String newCandyType){
        ModeloCandy candyToUpdate = null;
        for(ModeloCandy dulce : arrayDulces){
            if(dulce.getCandyName().equals(candyName)&& dulce.getCandyName().equals(candyType)){
                candyToUpdate = dulce;
                break;
            }
        }
        if(candyToUpdate != null){
            candyToUpdate.setCandyName(newCandyName);
            candyToUpdate.setCandyType(newCandyType);
            return "Dulce Actualizado: " + candyName + ","+candyType+ "ahora es "+ newCandyName +"," + newCandyType;
        }
        else{
            return "No se encontro ningun dulce " + candyName + "," + candyType;
        }   
    }

    public String listCandies() {
    StringBuilder result = new StringBuilder();  
    
    for (int i = 0 ; i < arrayDulces.size()-1 ; i++) { 
        result.append("Nombre: ").append(arrayDulces.get(i).getCandyName()).append(", Tipo: ").append(arrayDulces.get(i).getCandyType()).append("\n");
    }
    
    return result.toString();
}

    public static void searchCandy(String candyName, String candyType){
        ModeloCandy candyFinded = null;
        int i = 0;
        for(ModeloCandy dulce : arrayDulces){
            if(dulce.getCandyName().equals(candyName)&& dulce.getCandyType().equals(candyType)){
                candyFinded = dulce;
                break;
                }
        i++;
            }
        if(candyFinded !=null){
            System.out.println("Su dulce es: " + candyFinded.getCandyName() + candyFinded.getCandyType() + "Y esta en la posicion " + i);
        }
        else{
            System.out.println("No se pudo encontrar su dulce o no existe :C");
        }
     }

    



}


