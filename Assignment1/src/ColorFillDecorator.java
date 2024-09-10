public class ColorFillDecorator extends ShapeDecorator {
  public ColorFillDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    System.out.println("Filling with color");
  }

  @Override
  public String getDescription() {
    return decoratedShape.getDescription() + " with color fill";
  }
}
