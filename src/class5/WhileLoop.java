package class5;


public class WhileLoop {
    public static void main(String[] args) {
    /*
      int i=1;


        while(i<101) {
            System.out.println(i);
            i++;
        }

        i=1;
        while(i<16) {
            System.out.println(i);
            i+=2;
        }

        i=5;
        while(i<51) {
            System.out.println(i);
            i+=5;
        }


        i=10;
        while (i>0) {
            System.out.println(i);
            i--;
        }


        i=1;
        int sum=0;
        while(i<=10) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);


        int number=1;
        boolean flag=true;
        while (flag){

            System.out.println(number);
            if(number>3){
                flag=false;
            }
            number++;
        }
    */

        boolean condition=true;
        int num=1;
        while (condition){
            if(!(num%5==0))
            System.out.println(num);
            if(num>15){
                condition=false;
            }
            num++;

          }




    }
}
