package EjemploSimple;

public class Animal {

    private String nombre;
    private double edad;

    private static Animal instance;

    public Animal() {};

    public static Animal getInstance() {
        if (instance == null) {
            return new Animal();
        } 
        return instance;
    }


}
