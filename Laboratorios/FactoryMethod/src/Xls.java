public class Xls extends Documento {

    @Override
    public void abrir() {
        System.out.println("Se abrirá un documento de Excel");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrará el documento de Excel");
    }

}