public class LinuxSquare extends Square {
  private Command command;

  public LinuxSquare() {
    super();
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Linux-specific Square");
  }

  @Override
  public String getDescription() {
    return "This is a Square for Linux OS";
  }
}
