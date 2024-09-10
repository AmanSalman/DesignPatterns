class LinuxCircle extends Circle {
  private Command command;

  public LinuxCircle() {
    super();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Linux-specific Circle");
  }

  @Override
  public String getDescription() {
    return "This is a Circle for Linux OS";
  }
}
