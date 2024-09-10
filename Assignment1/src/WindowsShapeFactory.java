class WindowsShapeFactory implements ShapeFactory {
  public Square createSquare() {
    return new WindowsSquare();
  }

  public Circle createCircle() {
    return new WindowsCircle();
  }

  public Rectangle createRectangle() {
    return new WindowsRectangle();
  }
}