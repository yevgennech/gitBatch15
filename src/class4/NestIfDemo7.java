package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if(studyHard) {

            System.out.println("We gets the job");

            if(salary>100000) {
                System.out.println("Lets buy Tesla");
            } else {
                System.out.println("Lets buy Toyota");
            }



        } else {
            System.out.println("It might take a little longer time to get job");
        }

    }
}
