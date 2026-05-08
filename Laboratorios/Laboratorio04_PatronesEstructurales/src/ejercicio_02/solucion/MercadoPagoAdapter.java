package ejercicio_02.solucion;

public class MercadoPagoAdapter implements PaymentProcessor{
    private MercadoPagoAPI mercadoPagoAPI;

    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = mercadoPagoAPI;
    }

    @Override
    public void pay(double amount) {
        this.mercadoPagoAPI.pagar(amount);   
    }
    
}
