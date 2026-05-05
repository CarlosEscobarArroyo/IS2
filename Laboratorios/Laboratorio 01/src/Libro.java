
public abstract class Libro {
    
    protected String titulo;
    protected String autor;
    protected String tema;
    
    public Libro(String titulo, String autor, String tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public abstract void Imprimir();

    

}
