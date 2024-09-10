class WindowsCircle extends Circle {
  private Command command;

  public WindowsCircle() {
    super();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Windows-specific Circle");
  }

  @Override
  public String getDescription() {
    return "This is a Circle for Windows OS";
  }

}