package Operators;

public class $6_Concatination {
    public static void main(String[] args) {
        String first_name="Prajwal";
        String last_name="G";
        int a=20;
        int b=30;

        System.out.println(first_name + last_name);
        //In this scenario "+" acts as concatination
        System.out.println((a+b));
        //In this scenario "+" acts as arithmatic operator
        System.out.println(first_name+ last_name+ a +b);
        //In this scenario "+" acts as concatination for string and integer
        System.out.println(a + b + first_name + last_name);
        //In this scenario "+" acts as arithmetic operator first for int and concationation for string
        System.out.println(first_name + last_name + (a+b));
        /*In this scenario "+" acts as concatination and according to BODMAS rule considering bracket values
        it acts as a arithmatic operator*/

    }
}
