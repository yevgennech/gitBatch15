package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        String pwd="lfkns;n";
        System.out.println(pwd.equals("Pass123"));
        if(!pwd.equals("Pass123")) {
            System.out.println("Wrong passport");
        }
    }
}
