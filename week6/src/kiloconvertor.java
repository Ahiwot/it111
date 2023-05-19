import javax.swing.*;

public  class kiloconvertor extends JFrame {

        JPanel panel;
        JLabel messageLabel;
        JTextField kiloTextField;

        JButton calcButton;

        final int WINDOw_WIDTH = 350;

        final int WINDOW_HEIGHT = 450;

        // always be aware of the colors that intellij is using
        //create a constructor which is a special method to initialize our object

       public kiloconvertor(){

           setTitle("kilometer convertor");

           setSize(WINDOw_WIDTH,WINDOW_HEIGHT);

           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           buildpanel();

           add(panel);

           setVisible(true);


       }
       public void buildpanel(){
           messageLabel=new JLabel("Enter a distance in kilometer");
           // text, button,panel

         kiloTextField=new JTextField(10);

         calcButton=new JButton("calculate");

         panel=new JPanel();
         //we now have the above three component on to the Jpanel

           panel.add(messageLabel);
           panel.add(kiloTextField);
           panel.add(calcButton);

       }

       //we have to add our with method!!!

        public static void main(String[] args){

           new kiloconvertor();
        }


        }





