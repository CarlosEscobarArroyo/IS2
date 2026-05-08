public class Main {
    public static void main(String[] args) throws Exception {
        Ensayo ensayito = new Ensayo("Perú", "La Biblioteca de Medianoche", "Matt Haig", "Ficcion");
        Novela novelita = new Novela("editorial", "titulo", "autor", "tema");
        System.out.println(ensayito.getTema()); 
        
        Coleccion<Libro> coleccion = new Coleccion<>();

        coleccion.agregarElemento(ensayito);
        coleccion.agregarElemento(novelita);

        coleccion.buscarPorTitulo("La Biblioteca de Medianoche");
        coleccion.buscarPorTitulo("titulo");


    }
}
