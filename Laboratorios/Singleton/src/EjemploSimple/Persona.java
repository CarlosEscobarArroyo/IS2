package EjemploSimple;
public class Persona {
    private static Persona instance = null;
    private String nombre;
    private int edad;

    public static Persona getInstance() {
        if (instance == null) {
            instance = new Persona();
        }
        return instance;
    }

    private Persona() {}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

}


// Como hacemos Singleton esta instancia?
// Tiene que tener un atributo del mismo tipo de la clase que sea tipo static
// La palabra clave static indica que un miembro (atributo, metodo) pertenece a la clase en sí, no a las instancias (objetos) de esa clase. 
// Es decir, existe una sola copia compartida entre todos los objetos.
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
