package StructuralPattern.Decorator;
// Decorator
/// create abstract decorator class

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratoShape;
    public ShapeDecorator(Shape decoratorShape){
        this.decoratoShape=decoratorShape;

    }
    public void draw(){
        decoratoShape.draw();
    }
    
}
