class LinuxRectangle extends Rectangle {
  private Command command;

  public LinuxRectangle() {
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Linux-specific Rectangle");
  }

  @Override
  public String getDescription() {
    return "This is a Rectangle for Linux OS";
  }
}