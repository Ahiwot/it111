import java.util.Scanner;

public class MyConstants {

    public static void main(String[]args){

        final int touchdown=5;
        final int conversion=1;
        final int fieldgoal=4;

        int td,con,fg;

        //ask the end user to enter the touchdowns,con and fg

        Scanner input= new Scanner(System.in);
        System.out.println("please enter the number of touchdowns!");
        td=input.nextInt()*touchdown;
        System.out.println("please enter the number of conversions!");
        con=input.nextInt()*conversion;
        System.out.println("please enter the number of fieldegoals!");
        fg=input.nextInt()*fieldgoal;

        System.out.println(td);
        System.out.println(con);
        System.out.println(fg);
        System.out.println("our total score is");
        System.out.println(td +con +fg);
    }

}
