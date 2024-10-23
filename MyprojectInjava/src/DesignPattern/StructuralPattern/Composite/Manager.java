package StructuralPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private long empid;
    private String position;
    private List<Employee> subordinates;

    public Manager(long empid,String name,String position){
        this.empid=empid;
        this.name=name;
        this.position=position;
        this.subordinates=new ArrayList<>();
    }
    //@Override
    public void showEmployeeDetails(){
        System.out.println(empid+" "+name+" "+position);
        for(Employee emp:subordinates){
            emp.showEmployeeDetails();
        }
    }
    public void addEmployee(Employee emp){
        subordinates.add(emp);
    }
    public void removeEmployee(Employee emp){
        subordinates.remove(emp);
    }

    
}
