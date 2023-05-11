import java.util.Scanner;

public class MyEnum {

    enum whowins {Home,Vistor,Neither}

    public static void main(String[]args){
        //now I am going declare a variable


        whowins who;

        int seahawks, brounce;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the final score for the seahasks");
        seahawks=input.nextInt();

        System.out.println("please enter the final score for the broncos");
        brounce=input.nextInt();

        // if the seahawks score is grater than broncos -

        if(seahawks > brounce) {
            who= whowins.Home; // whowins.home is an object of the whowins type
            System.out.println(who+ "team won!");
            System.out.print("seahawks win by!");
            System.out.print(seahawks - brounce+"points");
        }else if(brounce> seahawks){
            who = whowins.Vistor;//whowins.home is an object of the whowins type
            System.out.println(who+"team win");
            System.out.print("broncos win by!");
            System.out.print(brounce - seahawks+"points");
        }else {
            who=whowins.Neither; //whowins.home is an object of the whowins type
            System.out.println(who+"team won");
            System.out.println("it's a tie");
        }



        }


        }




