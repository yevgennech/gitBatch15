package class3;

public class IfElse_9 {
    public static void main(String[] args) {
        char c='M';
        if(c=='M')
        {
            System.out.println("male");
        }

        String name="Nat";
        // with non-primitive data types (such as String) we can't use == operator
        if(name.equals("Sam")){
            System.out.println("Amazing student");

        }
        if(!name.equals("Sam")){
            System.out.println("Super Amazing student");
        }
    }
}
