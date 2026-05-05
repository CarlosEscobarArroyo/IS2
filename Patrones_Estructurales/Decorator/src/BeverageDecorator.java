public abstract class BeverageDecorator extends Beverage {
    protected Beverage decorado;

    public BeverageDecorator(String description, Beverage decorado) {
        super(description);
        this.decorado = decorado;
    }

    @Override
    public abstract float cost();
    
}
