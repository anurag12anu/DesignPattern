package CreationalPattern.SingletonPttern;

public class SingleMain {
    public static void main(String args[]){
        SingleObject ob=SingleObject.getInstance();
        System.out.println(ob.hashCode());

        SingleObject ob1=SingleObject.getInstance();
         System.out.println(ob1.hashCode());
    }
    
}
