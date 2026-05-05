import java.util.List;
import java.util.ArrayList;


public class Catalogo <T extends Usuario> { 
    private List<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

}
