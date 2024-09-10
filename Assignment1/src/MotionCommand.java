public class MotionCommand implements Command {
  private Shape shape;

  public MotionCommand(Shape shape) {
    this.shape = shape;
  }

  @Override
  public void execute() {
    System.out.println("Executing motion command for Circle");
  }
}
