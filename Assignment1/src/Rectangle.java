class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a Rectangle");
  }

  @Override
  public String getDescription() {
    return "This is a Rectangle";
  }
}