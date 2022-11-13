package interface_segregation.bad.PosibleSolution;

public class Test {
    public Animal pengui;
    public Animal eagle;

    public void insertarAnimals(Animal pengui, Animal eagle){

        this.eagle=eagle;
        this.pengui=pengui;
    }

    public void TestH(){
        insertarAnimals(new Penguin(50), new Eagle(30));

        eagle.toString();
        pengui.toString();
    }


}
