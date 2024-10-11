import Services.Strategy.Input;
import Services.Strategy.InputCLI;

public class Main {
    public static void main(String[] args) {
        Input input = new InputCLI();
        input.takeInput();
    }
}