package CreationalPattern.abstractFactory;

public interface UiFactory {
    Button createButton();
    CheckBox createCheckBox();

    
}
class WindowUiFactory implements UiFactory{
    public Button createButton(){
        return new WindoButton();
    }
    public CheckBox createCheckBox(){
        return new WindowCheckBox();

    }
}
class MacUIFactory implements UiFactory{
    public Button createButton(){
        return new MacButton();
    }
    public CheckBox createCheckBox(){
        return new MackCheckBox();

    }
    /**
     * InnerUiFactory
     */
    
}
 interface Button {
    void paint();
}
interface CheckBox {
    void paint();
}
class WindoButton implements Button{
    public void paint(){
        System.out.println("rendering a button in windows style.");
    }
}
class WindowCheckBox implements CheckBox{
    public void paint(){
        System.out.println("rendring a checkbox in windows style ");
    }
}
class MacButton implements Button{
    public void paint(){
        System.out.println("rendering a Button in Mack style");
    }
}
class MackCheckBox implements CheckBox{
    public void paint(){
        System.out.println("rendering a checkBox in mack");
    }
}
class Main{
    private Button button;
    private CheckBox checkBox;
    Main(UiFactory factory){
       button= factory.createButton();
       checkBox= factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }
    public static void main(String[] args) {
        UiFactory factory=new WindowUiFactory();
        Main main=new Main(factory);
        main.paint();
    }
}
