package DiFramwork;

public class ClaoudStorage  implements IngestionService{

  public   IngestToDatabase getInstanceofSource(String source){

    if(source.equals("API")) return new CloudSorceDataFromApi();

    else if(source.equals("FILE")) return new CloudSourceDataFromFile();

    else if(source.equals("DATABASE")) return new CoudSorceDataFromdataBase();
    return null;

    
    }

    
}
