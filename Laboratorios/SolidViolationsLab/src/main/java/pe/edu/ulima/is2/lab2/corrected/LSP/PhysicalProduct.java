package pe.edu.ulima.is2.lab2.corrected.LSP;

public class PhysicalProduct extends Product implements Shippable {

    protected double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.15; // Incluye impuestos
    }


    public double calculateShippingCost() {
        return weight * 2.5; // $2.5 por kg
    }

    public boolean requiresPhysicalDelivery() {
        return true;

    }

// EXTRA

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