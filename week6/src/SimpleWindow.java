import javax.swing.*;

public class SimpleWindow extends JFrame {

    // i am not going to have a main method in this file
    // constructor  - special method that displays

    public SimpleWindow(){
        final int WINDOW_WIDTH=400;
        final int WINDOW_HEIGHT=500;

        setTitle("my second simple window");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // don't forget to display it!!!
        setVisible(true);

    }

}
