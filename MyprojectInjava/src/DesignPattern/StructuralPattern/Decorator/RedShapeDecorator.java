package StructuralPattern.Decorator;
///concreate Docorator 1

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape){
        super(decoratorShape);

    }
    public void draw(){
        decoratoShape.draw();
        setRedBorder(decoratoShape);
    }
    private void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color:Red");
    }
    
}
// concreate Decorator 2
class DashedBorShapeDecorator extends ShapeDecorator{
    public DashedBorShapeDecorator(Shape decoratorShape){
        super(decoratorShape);
    }
    public void draw(){
        decoratoShape.draw();
        setDashBorder(decoratoShape);
    }
    private void setDashBorder(Shape decoratorShape){
        System.out.println("Border Style: Dashed");
    }

}