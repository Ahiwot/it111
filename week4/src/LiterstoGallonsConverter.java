public class LiterstoGallonsConverter {

    public static void main(String[] args) {
        //lit = (gal*3.79)
        //gal*3.79=lit

        double gal,lit;
        int count = 0;

        for(gal=1; gal<= 100;gal =gal+4){
            lit = gal*3.79;
            if (lit==3.79) {
                System.out.printf("%.2f litter is equals to %.if gallon", lit, gal);
                System.out.println();

            }else {

                System.out.printf("%.2f litter is equals to %.if gallon", lit, gal);
                System.out.println();
            }
            count+=1;
            if(count==5) {
                System.out.println();
                count = 0;
            }
        }
        //end for loop
            System.out.println();
            System.out.println("we are done");

        }

    }
