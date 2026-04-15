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

    }

    public void buscarPorAutor(String autor) {

    }

    public void buscarPorTema(String tema) {

    }
}
