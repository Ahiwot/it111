import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {

        // ask the user to input their numberical grades
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        // our while loop will count how many times we are asking the end user to input a grade


        while (counter <= 5) {
            System.out.println("please enter your" + counter + "numerical grade ");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }    // close while loop

        String message;
        String letterGrade;

        counter -= 1;

        average = total / counter;
        System.out.println("you have earned at average of" + average+ " after providing us+counter+grades ");

        if (average >= 90 && average < 100) {
        letterGrade="A";
        message="more studying necessary";
        } else if (average >= 70 && average < 80) {
            letterGrade="b";
            message="solid work!";
        } else if (average >= 65 && average < 70) {
           letterGrade="speaking by!";
           message="not a passing grade";
        }else {
            letterGrade="f";
             message="not a passing grade";

        }

        System.out.println("you have earned the following letter grade of" +letterGrade+",and here is the message"+message);


     }

    }
