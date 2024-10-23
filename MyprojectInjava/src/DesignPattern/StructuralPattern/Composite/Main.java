package StructuralPattern.Composite;

public class Main {
    public static void main(String[] args) {
        Employee dev1=new Developer(100,"johan","senior Developer");
        Employee dev2=new Developer(100,"Anurag","senior Developer");
        Employee des3=new Disigner(100,"Atul","Joiner Developer");

        // Composite object Manager
        Manager manager1=new Manager(200,"mitchel", "project Manager");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);
        // 
        Manager genralManager=new Manager(300, "Sarah", "General Manager");
        genralManager.addEmployee(manager1);
        genralManager.addEmployee(des3);

        System.out.println("Genral Manager and subordinates");
        genralManager.showEmployeeDetails();


    }
    
}
