package CreationalPattern.FactoryClass;

public class FactoryMain {
    public static Employee getEmployee(String type){
        if(type.trim().equals("WebDev")){
            return new WebDeveloper();
            
        }
        else if(type.trim().equals("AndroidDev")){
            return new AndroidDeveloper();
        }
        return null;
    }
    
}
