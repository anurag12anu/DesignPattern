package DiFramwork;

public class FactoryMain {
    public static void main(String[] args) {

        StorageFactory storageFactory=new StorageFactory();

        IngestionService cloundObject=storageFactory.getStoraService("CLOUD");
        
        cloundObject.ingestDataToMyDatabase("API");
        
        IngestionService onprimise=storageFactory.getStoraService("ONPRIMIS"); 
        
        onprimise.ingestDataToMyDatabase("FILE");
        //onprimisesObject.ingestDataToMyDatabase("FILE");
        //onprimisesObject.ingestDataToMyDatabase("DATALAKE");
    }
    
}
