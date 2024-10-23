package StructuralPattern.Composite;
// Leaf

public class Developer implements Employee{
    private String name;
    private long empid;
    private String position;

    public Developer (long empid,String name,String position){
        this.empid=empid;
        this.name=name;
        this.position=position;
    }
    public void showEmployeeDetails(){
        System.out.println(empid+" "+name+" "+position);
    }
    
}
//Leaf


class Disigner implements Employee{
    private String name;
    private long empid;
    private String position;

    public Disigner (long empid,String name,String position){
        this.empid=empid;
        this.name=name;
        this.position=position;
    }
    public void showEmployeeDetails(){
        System.out.println(empid+" "+name+" "+position);
    }
    
}

