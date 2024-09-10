public class TestDriver {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        // Create a Windows factory
        ShapeFactory windowsFactory = new WindowsShapeFactory();

        // Create and configure a Windows Square with decorators
        Shape windowsSquare = singleton.getSquare(windowsFactory);
        windowsSquare = new ColorFillDecorator(windowsSquare);
        windowsSquare = new DoubleBorderDecorator(windowsSquare);
        windowsSquare.draw();
        System.out.println(windowsSquare.getDescription());

        System.out.println("==============================================================");
        // Create a Linux factory
        ShapeFactory linuxFactory = new LinuxShapeFactory();

        // Create and configure a Linux Circle with decorators
        Shape linuxCircle = singleton.getCircle(linuxFactory);
        linuxCircle = new BorderColorDecorator(linuxCircle);
        linuxCircle = new DoubleBorderDecorator(linuxCircle);
        linuxCircle.draw();
        System.out.println(linuxCircle.getDescription());
    }
}
