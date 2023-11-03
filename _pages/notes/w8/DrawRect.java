import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawRect {
public static void main(String[] args) {
    Rectangle box = new Rectangle(5, 10, 20, 30);

    // New stuff - Create a program window and set it up.
    JFrame window = new JFrame();

    // Tell Swing to exit the program when the program window is closed.
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the window boundaries to be 300x300 on the screen, and position it 30 pixels from the top and left edges of the monitor.
    window.setBounds(30, 30, 300, 300);

    // Get the content pane of the window, and give it our own custom component.
    window.getContentPane().add(new JComponent() {  // Not a typo - this is some advanced magic called an "anonymous class".
        Rectangle myBox = box;    // Give the component a reference to our box object.
        public void paint(Graphics g) {
            g.drawRect(myBox.x, myBox.y, myBox.width, myBox.height);
        }
    });

    // Make our window appear.
    window.setVisible(true);
}
}