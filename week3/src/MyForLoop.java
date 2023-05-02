public class MyForLoop {

    public static void main(String[]args){

        //int count;
       // for(count=0;count<=30; count= count+3){
           // System.out.println(count);

     //   }
       // System.out.println("All done");

        int newCount;
        for(newCount=30;newCount>0;newCount=newCount-1){

           if(newCount<=10) {
               System.out.println("we are almost at blast off only"+newCount+ "second away");
           }else{
               System.out.println(newCount);
           }

           }// end for loop


        System.out.println("Blast off" );
    }

}
