package CreationalPattern.SingletonPttern;
public class SingleObject {
    private static SingleObject instance;
    
    // we create constructor

    private SingleObject(){

    }
    public static SingleObject getInstance(){
        if(instance==null){

        instance=new SingleObject();
        }

        return instance;
    }


    
}
