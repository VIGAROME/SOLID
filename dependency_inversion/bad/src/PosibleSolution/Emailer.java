package PosibleSolution;

public class Emailer implements Notificate{

    @Override
    public void generarNotificate(String condicion) {
        if(condicion=="Sunny"){
            System.out.println("The weather is"+ condicion);
        }
        
    }

    
    
}
