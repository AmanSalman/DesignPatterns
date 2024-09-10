public class DoubleBorderDecorator extends ShapeDecorator {
  public DoubleBorderDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    System.out.println("Adding double border size");
  }

  @Override
  public String getDescription() {
    return decoratedShape.getDescription() + " with double border size";
  }
}
