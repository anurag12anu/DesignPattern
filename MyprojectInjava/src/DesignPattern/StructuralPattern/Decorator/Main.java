package StructuralPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape RedRectangle=new RedShapeDecorator(new Rectangle());
        Shape dashedCircle=new DashedBorShapeDecorator(new Circle());
        
        System.out.println("Circle with normal border");
        circle.draw();
        
        System.out.println("\nCircle with Red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        RedRectangle.draw();

        System.out.println("\nCircle with dashed border");
        dashedCircle.draw();
    }
    
}
