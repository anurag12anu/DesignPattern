package DiFramwork;

public class StorageFactory {
    public IngestionService getStoraService(String storageType){

        if(storageType.equals("CLOUD")) return new ClaoudStorage();
        
        else if(storageType.equals("ONPRIMIS")) return new OnPremisesStorage();

        return null;

    }
    
}
