package pe.edu.ulima.is2.solid.oc;

public class Persona extends Animal{

    @Override
    public void despedirse() {
        System.out.println("Adios");        
    }

    @Override
    public void saludar() {
        System.out.println("Hola");        
    }
    

}
