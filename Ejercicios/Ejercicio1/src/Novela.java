public class Novela extends Libro{
    private String editorial;

    public Novela(String editorial, String titulo, String autor, String tema) {
        super(titulo, autor, tema);
        this.editorial = editorial;
    }

    //No tenemos que volver a crear los métodos de la clase padre; gracias al extend ya se cuenta con ellos
    //El super(titulo, autor, tema) lo que hace es llamar al constructor del padre.
    // Como los atributos en Libro suelen ser private, la única forma de que Novela nazca con un título y autor ya asignados es pasando esos datos hacia arriba mediante super.
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
        
    }

    

}
