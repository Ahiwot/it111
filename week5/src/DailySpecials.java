import java.util.Scanner;


public class DailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter a day of the week excluding weekends (monday-friday only!");

        specials = input.next();


        // in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;
      boolean saturday= specials.equals("saturday");
        boolean sunday= specials.equals("sunday");

      if(saturday|| sunday) {
          System.out.println("please enter a week day not weekend");
          specials=input.next();
      }

        switch (specials) {

            //my cases will be the day of th week
            case "Monday" -> {
                coffee = "latte";
                price = 4.95;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
            }
            case "tuesday" -> {
                coffee = "frapp";
                price = 4.95;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
            }
            case "wednesday" -> {
                coffee = "cappuccino";
                price = 4.35;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
            }
            case "thursday" -> {
                coffee = "regular joe";
                price = 2.95;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
            }
            case "friday" -> {
                coffee = " green tee latte";
                price = 6.95;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
            }
        }

    }
}
