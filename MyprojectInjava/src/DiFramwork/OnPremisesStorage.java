package DiFramwork;

public class OnPremisesStorage implements IngestionService {

    public IngestToDatabase getInstanceofSource(String source){
        if(source.equals("API")) return new SourceDataFromApi();
        else if(source.equals("FILE")) return new SourceDataFromFile();
        else if(source.equals("DATALAKE")) return new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) return new SourceDataFromdataBase();
        
        return null;

    
    }
    
}
