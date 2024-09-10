class Singleton {
  private static Singleton inst;
  private Square square;
  private Rectangle rect;
  private Circle circle;

  private Singleton() {
  }

  public static synchronized Singleton getInstance() {
    if (inst == null) {
      inst = new Singleton();
    }
    return inst;
  }

  public Square getSquare(ShapeFactory shapeFactory) {
    if (square == null) {
      square = shapeFactory.createSquare();
    }
    return square;
  }

  public Rectangle getRectangle(ShapeFactory shapeFactory) {
    if (rect == null) {
      rect = shapeFactory.createRectangle();
    }
    return rect;
  }

  public Circle getCircle(ShapeFactory shapeFactory) {
    if (circle == null) {
      circle = shapeFactory.createCircle();
    }
    return circle;
  }

}
