public class Doc extends Documento {

    @Override
    public void abrir() {
        System.out.println("Se abrirá un documento de Word");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrará el documento de Word");
    }
    
}
