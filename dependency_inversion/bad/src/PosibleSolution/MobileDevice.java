package PosibleSolution;

public class MobileDevice implements Notificate {

    @Override
    public void generarNotificate(String condicion) {
        if(condicion=="rainy"){
            System.out.println("The weather is"+ condicion);
        }
        
    }
    
}
