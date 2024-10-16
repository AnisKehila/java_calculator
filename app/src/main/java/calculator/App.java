package calculator;
import calculator.CalcJFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        // Ensuring the GUI is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalcJFrame frame = new CalcJFrame();
                frame.setVisible(true); // Make the frame visible
            }
        });
    }
}
