public class BorderLightCommand implements Command {
  private Shape shape;

  public BorderLightCommand(Shape shape) {
    this.shape = shape;
  }

  @Override
  public void execute() {
    System.out.println("Executing border light command for Square");
  }
}
