public class FC_Presentador extends FA_Aplicacion{

    @Override
    public Documento crear() {
        return new Ppt();
    }

}
