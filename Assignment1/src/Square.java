class Square implements Shape {
  private Command command;

  public Square() {
    this.command = new BorderLightCommand(this);
    command.execute();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Square");
  }

  @Override
  public String getDescription() {
    return "This is a Square";
  }
}