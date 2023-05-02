public class MyOperators2 {

    public static void main(String[] args) {

        //boolean operators

//        boolean tuna=true;
//        boolean bread=false;
//        if(tuna==true && bread==true){
//            System.out.println("we are having a sandwich!");
//        }else {
//            System.out.println("we are not");

        //}

        boolean tuna = false;
        boolean bread = true;
        if (tuna == true || bread == true) {
            System.out.println("we are having some food products");
        } else {
            System.out.println("we will not be eating any food product today");
        }
         // age - drinking!
        int age=18;

        if(age>=18){
            System.out.println("Yippy skippy, we can order an adult beverage");
        }else {
            System.out.println("we will have a diet coke");
        }

        //amusement park roller coaster rider- smaller than 4 feet
        float height = 4;
        if(height < 4) {
            System.out.println("you will not be able to roller coaster");
        }else{
            System.out.println("have a grate time on a roller coaster");

        }
    }


}
