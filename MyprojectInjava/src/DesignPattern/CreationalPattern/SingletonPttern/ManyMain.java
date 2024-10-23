package CreationalPattern.SingletonPttern;

public class ManyMain {
    public static void main(String[] args) {
        ManyObject ob=new ManyObject();
        System.out.println(ob.hashCode());



        ManyObject ob1=new ManyObject();
        System.out.println(ob1.hashCode());
        
    }
    
}
