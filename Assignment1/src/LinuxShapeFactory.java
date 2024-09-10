class LinuxShapeFactory implements ShapeFactory {
  public Square createSquare() {
    return new LinuxSquare();
  }

  public Rectangle createRectangle() {
    return new LinuxRectangle();
  }

  public Circle createCircle() {
    return new LinuxCircle();
  }
}