package pe.edu.ulima.is2.solid.oc;
public class Main {
    public static void main(String[] args) throws Exception {
        interactuarAnimal(new Perro());
        interactuarAnimal(new Gato());
        // Esto es polimorfismo: el método interactuarAnimal() acepta un parámetro de tipo Animal,
        // pero puede recibir objetos de diferentes tipos (Perro, Gato). Cada objeto ejecuta su propia
        // versión de saludar() y despedirse() según su tipo, aunque se llama el mismo método.

        // Ejemplo de Principio Abierto/Cerrado -> Creamos la clase gallo

        // No tengo que modificar nada. Solo tendría que extender: Crear una clase gallo con los mismos metodos.
        // Abierto a Extensiones -> tenemos la capacidad de agregar nuevas funcionalidades
        // Cerrado a Modificaciones -> para agregar la clase gallo no tuvimos que modificar el código ya escrito
        
        interactuarAnimal(new Gallo());
    }

    public static void interactuarAnimal(Animal animal) {
        animal.saludar();
        animal.despedirse();
    }
}
