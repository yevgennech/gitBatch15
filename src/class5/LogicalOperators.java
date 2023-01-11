package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        String country="China";

        if(!country.equals("BadCountry")) {
            System.out.println("Welcome");
        }

        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }

        boolean wifi=true;
        boolean fiveG=true;
        if(wifi||fiveG) {
            System.out.println("You are good to use Internet");
        } else {
            System.out.println("Either connect to wifi og to 5G");
        }


        /*
        if the score in all the subjects are greater than 90 print brilliant student
        otherwise print you need to work hard
         */

                double mathScore=92.5;
                double historyScore=91.5;
                double scienceScore=93.5;

                if(mathScore>90.0){
                    if(historyScore>90){
                        if(scienceScore>90){
                            System.out.println("You are a brilliant Student");
                        }else{
                            System.out.println("You need work harder is Science");
                        }
                    }else{
                        System.out.println("You need work harder in history");
                    }

                }else{
                    System.out.println("You need work harder with Math");
                }


                if(mathScore>90&&historyScore>90&&scienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder");
                }

        boolean isTrue=false;
        boolean condition=!isTrue;
        System.out.println(condition);

        if(condition){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }





    }
}
