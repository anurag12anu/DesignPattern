package CofficeSoap;

public class Caramel  extends IndegridiantDecorator{
    Beverage beverage;

    
   public Caramel (){
    this.beverage=beverage;

    }

    @Override
    String getBeverageName() {

        return beverage.getBeverageName()+"with caramel";
        
        
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice()+5;
       
    }
    
}
