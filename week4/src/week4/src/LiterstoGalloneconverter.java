public class LiterstoGalloneconverter {

    public static void main(String[] args) {

        //lit=(gal*3.79)

        double gal, lit;
        int count = 0;

        for (gal = 0; gal <= 100; gal = gal + 5) ;
        lit = gal * 3.79;
        if (lit == 3.79) {
            System.out.printf(gal + " gallon is equal to" + lit + "liter", lit, gal);
            System.out.println();
        } else {

            System.out.printf(gal + " gallon is equal to" + lit + "liter", lit, gal);
            System.out.println();
        }

        count += 1;
        if ( count== 3) {
            System.out.println();
            count = 1;
        }
        System.out.println();
        System.out.println("All done");
    }

}