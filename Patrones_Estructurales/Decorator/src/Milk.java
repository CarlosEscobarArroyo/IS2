public class Milk extends BeverageDecorator{

    public Milk(String description, Beverage decorado) {
        super(description, decorado);
    }

    @Override
    public float cost() {
        return decorado.cost()+2f;
    }
    
    

}
