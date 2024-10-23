package Factory;

public class FactoryOfSource {
    IngestToDatabase sourceObject=null;
    public IngestToDatabase getInstanceofSource(String source){
        IngestToDatabase sourceSystemObject=null;
        if(source.equals("API")) sourceSystemObject=new SourceDataFromApi();
        else if(source.equals("FILE")) sourceSystemObject=new SourceDataFromFile();
        else if(source.equals("DATALAKE")) sourceSystemObject=new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) sourceSystemObject=new SourceDataFromdataBase();
        return sourceSystemObject;
        
    }
    
}
