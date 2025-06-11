package Operators;

public class $7_Logical_Gate_operator {
    public static void main(String[] args) {

        /*{
            and gate
             A B Z
             0 0 0
             0 1 0
             1 0 0
             1 1 1   }
        {
            or gate
            A B Z
            0 0 0
            0 1 1
            1 0 1
            1 1 1
        } */
        boolean a=false;
        System.out.println(!a); //not operator
        System.out.println(!!a);
        boolean c=true || false;
        System.out.println(c);
        boolean d= false && true;
        System.out.println(d);
    }
}
