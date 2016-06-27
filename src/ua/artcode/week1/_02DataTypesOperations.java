package ua.artcode.week1;

/**
 * Created by serhii on 26.06.16.
 */
public class _02DataTypesOperations {


    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // binary
        // arithmetical

        int div = a / b;

        System.out.print("a / b = ");
        System.out.println(div);
        System.out.print("a % b = ");
        System.out.println(a % b);

        // string operation: '+' concatenation
        // string + string
        // string + primitive
        // string + primitiv + primit + String
        String result = "a / b = " + div;
        System.out.println(result);


        double d1 = 10.5;
        double d2 = 2.5;

        // double / double = double
        double dRes = d1 / d2;

        System.out.println("result of d1 / d2 is" + dRes);

        double res4 = 23 * 23.1;


        // type converting
        // upcasting , downcasting

        byte b1 = 23;
        short s1 = b1;
        int i1 = b1;

        i1 = s1;

        long l1 = i1;

        // non holistic
        float f1 = l1;

        // holistic
        double d12 = i1;

        // down casting
        // casting
        // split
        int in1 = 18;
        byte by1 = (byte) in1;

        int a22 = (int) 233.23;

        byte b5 = (byte)(by1 * 23);


        // priority
        // * /


        // unary operation
        int abc = 23;
        abc = abc + 1;
        abc++;

        abc = abc - 1;
        abc--;

        // read abc, plus 23 + 1, assign res to abs
        System.out.println(abc);

        // comparing
        boolean ls = 23 < 23;
        boolean eq = 23 == 23;
        boolean nEq = 23 != 23;
        boolean lsE = 23 >= 23;


        // boolean operation
        // AND(&&) OR(||) Invert(!)

        boolean resBool = (23 <= 23 && 23 != 78) || 67 % 2 != 0 || !true;


    }
}
