public class FC_HojaCalculo extends FA_Aplicacion{


    @Override
    public Documento crear() {
        return new Xls();
    }
    
}
