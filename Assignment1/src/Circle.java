class Circle implements Shape {
  private Command command;

  public Circle() {
    this.command = new MotionCommand(this);
    command.execute();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }

  @Override
  public String getDescription() {
    return "This is a Circle";
  }
}