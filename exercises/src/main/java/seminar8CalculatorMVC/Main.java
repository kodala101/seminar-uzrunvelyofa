package seminar8CalculatorMVC;

import seminar8CalculatorMVC.controller.Controller;
import seminar8CalculatorMVC.model.CalculatorBrain;
import seminar8CalculatorMVC.view.ConsoleView;
import seminar8CalculatorMVC.view.SwingView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new SwingView(), new CalculatorBrain());
        controller.start();
    }
}
