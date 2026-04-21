package pe.edu.ulima.is2.lab2.corrected.LSP;



public class DigitalProduct extends Product implements Downloadable{

    protected long fileSize;

    public DigitalProduct(String name, double basePrice, long fileSize) {
        super(name, basePrice); // Los productos digitales no tienen peso
        this.fileSize = fileSize;
    }

    @Override
    public double calculatePrice() {
        return basePrice; // Sin impuestos físicos
    }
    
    @Override
    public String getDownloadUrl() {
        return "URL";
    }

    @Override
    public long getFileSize() {
        return this.fileSize;
    }


//EXTRAS

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