package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryOfSource factoryOfSource=new FactoryOfSource();

        IngestionService ingestionService=new IngestionService(factoryOfSource);
        
        ingestionService.ingestDataToMyDatabase("API");
        ingestionService.ingestDataToMyDatabase("FILE");
        ingestionService.ingestDataToMyDatabase("DATALAKE");
    }
    
}
