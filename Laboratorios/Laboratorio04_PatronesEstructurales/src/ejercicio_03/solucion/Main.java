package ejercicio_03.solucion;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor pago = new BasicPayment();
        pago.pay(200);

        PaymentProcessor pago_con_descuento = new PaymentWithDiscount(pago);
        pago_con_descuento.pay(200);

    }
}
