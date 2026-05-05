package pe.edu.ulima.is2.lab2.corrected.LSP;

public class ServiceProduct extends Product implements Serviceable{
    protected int duration;

    public ServiceProduct(String name, double basePrice, int duration) {
        super(name, basePrice);
        this.duration = duration;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1; // Incluye comisión de servicio
    }

    public void scheduleService() {
        System.out.println("El pedido ha sido agendado!!");
    }

    public int getServiceDuration() {
        return this.duration;
    }



//EXTRA
    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void processOrder() {
        super.processOrder();
    }

    

}