public class MyOprators {

    public static void main(String[] args) {


        //Arithmetic Oprators
        //employee,wage, hours worked, overtime, the whole enchilada

//        int reghours, overtimehours;
//        double overtimepay, regularpay, total;
//        float wage;
//        double hourlywithovertime;

//        reghours = 40;
//        overtimehours = 5;
//        wage = 25.50f;
//        regularpay = reghours * wage;
//        overtimepay = (wage * 1.5) * overtimehours;
//        total = overtimepay + regularpay;
//        hourlywithovertime = total / (reghours + overtimehours);

//        System.out.println("regular pay: $" + regularpay + "dollar");
//        System.out.println("overtime pay: $" + overtimepay + "dollar");
//        System.out.println("total pay: $" + total + "dollar");
//        System.out.println("hourly rate with overtime: $" + hourlywithovertime + "dollar");System.out.print("hourly rate overtime:");
//        System.out.printf("$%.2f", hourlywithovertime);


        int number1, number2, number3;
        number1 = 2577;
        number2 = 2;
        number3 = number1 % number2;
        if (number3 == 0) {
            ;System.out.println(number1 + "is an even number");

        }  else {
            System.out.println(number1 + "is an Odd number");

        }

        // we are not going shopping
//         double tax, priceofitem, taxonitem, totalprice;
//
//        tax=.10;
//        priceofitem=100.00;
//        taxonitem=priceofitem*tax;
//        totalprice=priceofitem+taxonitem;
//        System.out.println("price of item $"+priceofitem+"dollars");
//        System.out.println("tax $"+taxonitem+"dollar");
//        System.out.println("price including tax $"+totalprice+"dollars");
//

//     double priceofitem=100;
        //tax is 10 percent
        double priceofitem=100;
        priceofitem*=1.10;

        System.out.println("total price of item is"+priceofitem+"dollars");
        System.out.println("total price of item is:");
        System.out.printf("$%.2f",priceofitem);
        System.out.println("dollars");












       






    }
}
