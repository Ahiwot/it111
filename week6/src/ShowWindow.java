import javax.swing.*;

public class ShowWindow {

    public static void main (String[]args){
    //declare our variables
        //we are going to make them CONSTANTS

        final int WINDOW_WIDTH= 350;
        final int WINDOW_HIGHT=250;

        // creating a widow

        JFrame window=new JFrame();
        //set the title
        window.setTitle("my simple window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH,WINDOW_HIGHT);

        // close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we not display the window, it will not display!
        //display the window is a boolean
        window.setVisible(true);
    }
}
