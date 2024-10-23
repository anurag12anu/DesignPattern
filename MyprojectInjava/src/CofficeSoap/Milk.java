package CofficeSoap;

public class Milk  extends IndegridiantDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;

    }

    String getBeverageName(){

        return beverage.getBeverageName()+"with Milk";
    }
    @Override
    int getBeveragePrice() {
       
        return beverage.getBeveragePrice()+2;
    }
    
}
