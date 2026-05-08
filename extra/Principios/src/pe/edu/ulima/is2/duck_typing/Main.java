package pe.edu.ulima.is2.duck_typing;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        interactuarAnimal(new Perro());
        interactuarAnimal(new Gato());
        // Esto es polimorfismo: el método interactuarAnimal() acepta un parámetro de tipo Animal,
        // pero puede recibir objetos de diferentes tipos (Perro, Gato). Cada objeto ejecuta su propia
        // versión de saludar() y despedirse() según su tipo, aunque se llama el mismo método.
    }

    public static void interactuarAnimal(Animal animal) {
        animal.saludar();
        animal.despedirse();
    }
}
