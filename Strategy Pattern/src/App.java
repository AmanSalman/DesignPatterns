public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mallard Duck");
        Duck D = new MallardDuck();
        D.display();
        // change the FlyBehavior in runtime
        D.setFlyBehavior(new FlyNoWay());
        D.performFly();

        System.out.println("--------------------------------");
        // ModelDuck
        System.out.println("Model Duck");
        Duck M = new ModelDuck();
        M.display();
        M.performFly();
        // change the FlyBehavior in runtime
        M.setFlyBehavior(new FlyRocket());
        M.performFly();
    }
}
