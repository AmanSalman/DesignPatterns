class WindowsSquare extends Square {
  private Command command;

  public WindowsSquare() {
    super();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Windows-specific Square");
  }

  @Override
  public String getDescription() {
    return "This is a Square for Windows OS";
  }
}
