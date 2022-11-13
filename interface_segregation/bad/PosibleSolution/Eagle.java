
package interface_segregation.bad.PosibleSolution;;
/**
 * Created by mrk on 4/7/14.
 */
public class Eagle implements BirdFly {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    @Override
    public void comer() {
        System.out.println("Comen gusanos");
        
    }

    @Override
    public void producirSonido() {
        // Sonido de Eagle
        
    }
}
