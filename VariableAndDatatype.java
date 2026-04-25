public class VariableAndDatatype{
    public static void main (String[] args){
        byte a = 2;
        short b = 4;
        int c = 3;
        long d = 1001;
        boolean f = true;
        char g = 'S';
        float v = 12.3f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(v);

        //Arithematic operator
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 % num2);
        System.out.println(num1 % num2);

//Relational operator
         System.out.println(num1 > num2);//true
          System.out.println(num2 > num1);//false

          num2 = 10;

        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        System.out.println(num1 != num2);

        //logical operator
        //num++ post increment
        //num-- pre increment

        int num = 8;

        int result = ++num;
        System.out.println(result);
        System.out.println(num);

    }
}