package DiFramwork;

public interface IngestionService {
    
    default void ingestDataToMyDatabase(String source){
    
        
    IngestToDatabase sourceObject = getInstanceofSource(source);

    sourceObject.ingestData();

        //SourceDataFromFile sourceFile=new SourceDataFromFile();
        //sourceFile.ingestData();
    }
    IngestToDatabase getInstanceofSource(String source);
    
}
