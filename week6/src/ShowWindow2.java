import javax.swing.*;
import java.awt.*;

public class ShowWindow2 extends JFrame {
    public static void main(String[]args){


        //we are going to make them CONSTANTS their values can't change



            JLabel myLabel1;
            JLabel myLabel2;
            JTextField windowTextField1;
            JTextField windowTextField2;

        final int WINDOW_WIDTH= 350;
        final int WINDOW_HEIGHT=450;

            // creating a widow--just start typing  JFrame and it will show up

            //JFrame window=new JFrame();
            // scanner input =new scanner (system.in) It looks the same as setting the JFrame


            //JTextField textField1,textField2;
            JFrame window=new JFrame();
            window.setTitle("my simple window");


        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(Color.red);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            myLabel1=new JLabel("My First Big Label!!!");
            myLabel1.setBounds(20,50,360,80);
            myLabel1.setFont(new Font("Jackie",Font.PLAIN,24));

            windowTextField1=new JTextField(15);
            windowTextField1.setBounds(20,110,300,50);

            myLabel2=new JLabel("My Second Big Label!");
            myLabel2.setBounds(20,170,330,30);
            myLabel2.setFont(new Font("Jackie",Font.BOLD,25));

             windowTextField2=new JTextField(15);
             windowTextField2.setBounds(20,220,300,50);


        window.add(myLabel1);
        window.add(windowTextField1);
        window.add(myLabel2);
        window.add(windowTextField2);
        window.setLayout(null);
        window.setVisible(true);

        //             don't forget to display the window. if we do not display the window, it will not display!
        //             display the window is a boolean
                  //window.setVisible(true);

        }
    }


