package CofficeSoap;

public class CoffeeHouse {
    public static void main(String args[]){
        Beverage beverage= new Espresso();
        System.out.println(beverage.getBeverageName());

        System.out.println(beverage.getBeveragePrice());

        beverage=new Milk(beverage);

        System.out.println("after decorating Milk");

        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());
        
        System.out.println("after decorating double Caramel");

        beverage=new Caramel();
        beverage=new Caramel();

        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

    
    }
    
}
