// Cuando tenemos una clase hija con un padre que tiene un constructor
// que tiene parametros, si la clase hija no tiene un constructor propio no funcionará
// Esto pasa por que cuando no hay constructor se inicializa como public libro() {}
// Y Ensayo quiere hacer lo mismo -> public ensayo() {} pero no funcionara por que como ya
// cree un constructor con parametros, el que no tiene parametros ya no existe
public class Ensayo extends Libro{
    private String pais;
    public Ensayo(String pais, String titulo, String autor, String tema) {
        super(titulo, autor, tema);
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
        
    }
    
    
    

}
