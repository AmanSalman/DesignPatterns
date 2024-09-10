class WindowsRectangle extends Rectangle {
  @Override
  public void draw() {
    System.out.println("Drawing a Windows-specific Rectangle");
  }

  @Override
  public String getDescription() {
    return "This is a Rectangle for Windows OS";
  }
}
