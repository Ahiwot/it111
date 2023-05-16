import java.util.Scanner;


public class DailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter a day of the week excluding weekends (monday-friday only!");
        specials = input.next();

        // in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        int quantity = 0;
        double price;
        boolean saturday = specials.equals("saturday");
        boolean sunday = specials.equals("sunday");

        if (saturday || sunday) {
            System.out.println("please enter a week day not weekend");
            specials = input.next();
        }

        switch (specials) {

            //my cases will be the day of th week

            coffee = "latte";
            price = 4.95;
            System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
            System.out.println(price);
            System.out.println("how many latte would you like to order?");
            specials = input.next();
            if (quantity == 0) {
                System.out.println("looks like you don't like latte! so sad!!!");

            } else if (quantity > 0) {
                System.out.println("looks like you will be ordering" + quantity + "coffee");

            }
            case "tuesday" -> {
                coffee = "frappe";
                price = 4.95;
                System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println(price);
                System.out.println("how many frappe would you like to order?");
                specials = input.next();
                if (quantity == 0) {
                    System.out.println("looks like you don't like latte! so sad!!!");

                } else if (quantity > 0) {
                    System.out.println("looks like you will be ordering" + quantity + "coffee");


                }

                case "wednesday" -> {
                    coffee = ("Cappuccino");
                    price = 4.35;
                    System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                    System.out.println(price);
                    System.out.println("how many cappuccino would you like to order?");
                    specials = input.next();
                    if (quantity == 0) {
                        System.out.println("looks like you don't like latte! so sad!!!");

                    } else if (quantity > 0) {
                        System.out.println("looks like you will be ordering" + quantity + "coffee");


                    }
                    case "thursday" -> {
                        coffee = ("regular joe");
                        price = 2.95;
                        System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                        System.out.println(price);
                        System.out.println("how many latte would you like to order?");
                        specials = input.next();

                        if (quantity == 0) {
                            System.out.println("looks like you don't like latte! so sad!!!");

                        } else if (quantity > 0) {
                            System.out.println("looks like you will be ordering" + quantity + "coffee");
                        }

                        case "friday" -> {
                            coffee = ("green tee latte");
                            price = 4.35;
                            System.out.println(specials + " 's coffee of the day is a" + coffee + "and the price will be $" + price);
                            System.out.println(price);
                            System.out.println("how many latte would you like to order?");
                            specials = input.next();

                            if (quantity == 0) {
                                System.out.println("looks like you don't like latte! so sad!!!");

                            } else if (quantity > 0) {
                                System.out.println("looks like you will be ordering" + quantity + "coffee");

                            }
//
//
                        }

                    }
                }

            }
        }

    }
}