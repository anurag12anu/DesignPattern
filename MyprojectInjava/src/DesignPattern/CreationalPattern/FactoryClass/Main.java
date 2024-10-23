package CreationalPattern.FactoryClass;

public class Main {
    public static void main(String args[]){
        Employee ob=FactoryMain.getEmployee("WebDev");
        ob.salary();

        Employee ob1=FactoryMain.getEmployee("AndroidDev");
        ob1.salary();
    }
    
}
