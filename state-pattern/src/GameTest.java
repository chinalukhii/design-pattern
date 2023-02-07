public class GameTest {
    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.setState(new HelthyState());
        context.gameAction();
        System.out.println("*****");
        context.setState(new SurvivalState());
        context.gameAction();
        System.out.println("*****");
        context.setState(new DeadState());
        context.gameAction();
        System.out.println("*****");
}}
