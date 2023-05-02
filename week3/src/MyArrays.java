import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

  // string car=volvo";

  String[] cars=new String[4];
  // in many computer program, we start counting with zero

        cars[0]="volvo";
        cars[1]="ford";
        cars[2]="toyota";
        cars[3]="honda";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

        //String[]books ={"handmaid's tale","Slenderman","the joy luck club","east of eden","the looming tower "};

        String[] books =new String[5];

        books[0]="handmaid's tale";
        books[1]="slenderman";
        books[2]="the joy luck clue";
        books[3]="east of eden";
        books[4]="the looning tower";

        System.out.println(Arrays.toString(books));

        //we are gonig to build a for each loop

        for(String book: books){
            System.out.println(book);
        }


        int[]numbers=new int[3];
        numbers[0]=20;
        numbers[1]=30;
        numbers[2]=50;

        System.out.println(Arrays.toString(numbers));

        for(int number:numbers) {
            System.out.println(number);
        }

        String[]wines=new String[5];
          wines[0]="cabernet";
          wines[1]="merlot";
          wines[2]="syrah";
          wines[3]="Malbec";
          wines[4]="cabernet-frank";
          for(String wine: wines) {
                System.out.println(wine);
                System.out.println(wine.length());
          }


          for(String wine:wines){
                if(wine.equals("Malbec")){
               break;
                }

                System.out.println(wine);

          }
    }

}
