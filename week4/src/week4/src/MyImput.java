import java.util.Scanner;

public class MyImput {

    public static void main (String[]args) {

        String name, message = null;
        int age;
        double salary;

        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter your first name,please!");

        name = myobj.next();
        System.out.println(name + "please enter your age!");

        age = myobj.nextInt();

        System.out.println(name + "last, but not least, your annual salary!");

        salary = myobj.nextDouble();


        if (salary < 5000) {
            message=("i need another job, or roommate");
        } else if (salary >= 5000 && salary < 60000) {
            message=(" not bad, but to survive in seattle");
        } else if (salary >= 6000 && salary < 70000) {
            message = "salary is getting better";
        } else if (salary >=7000 && salary<80000 )
            message = "Almost livable in seattle";
     //   }else {
         message = "life is good";



        System.out.println("first name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:$"+salary+"dollars");
        System.out.println("message:"+message);

    }
}
