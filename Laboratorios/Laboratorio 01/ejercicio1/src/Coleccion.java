import java.util.List;
import java.util.ArrayList;


public class Coleccion <T extends Libro> { 
    private List<T> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void buscarPorTitulo(String titulo) {
        for (T elemento : elementos) {
            if (elemento.getTitulo().equals(titulo)) {
                System.out.println("Si se encontro el titulo " + elemento.getTitulo());
                break;
            } else {
                System.out.println("No se encontro el titulo");
            }
        }
    }

    public void buscarPorAutor(String autor) {

    }

    public void buscarPorTema(String tema) {

    }
}
