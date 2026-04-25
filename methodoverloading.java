class Addition{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }

    public class methodoverloading{
        public static void main (String[] args){
        Addition obj = new Addition();
        System.out.println(obj.add(2,4));
        System.out.println(obj.add(2,4,2));
       System.out.println(obj.add(2.5,2.5));
       }
}}