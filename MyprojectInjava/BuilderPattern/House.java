package MyprojectInjava.BuilderPattern;

public class House {
    private String ground;
    private String structure;
    private String roof;
    
    public House(String ground,String strucure,String roof){
        this.ground=ground;
        this.structure=strucure;
        this.roof=roof;
        
    }
    public House build(){
        return new House("anurag","anu","roof");
    }

    
}


// builder pattern
class BuilderClass{
    private String ground;
    private String structure;
    private String roof;
    
    public BuilderClass(String ground,String strucure,String roof){
        this.ground=ground;
        this.structure=strucure;
        this.roof=roof;
        
    }
    public BuilderClass setGround(String ground){
        this.ground=ground;
        return this;
   
        
    }
    public BuilderClass setStructure(String strucure){
        
        this.structure=strucure;
    return this;
        
    }
    public BuilderClass setRoof(String roof){
        
        this.roof=roof;
        return this;
        
    }
    
    

}

