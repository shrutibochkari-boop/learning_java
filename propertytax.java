class Propertytax{
    public double calculateTax(double areaInSqft){
        return areaInSqft * 10;
    }
    public double calculateTax(int propertyvalue){
        return propertyvalue * 0.02;
    }
    public double calculateTax(double areaInSqft, double ratePerSqft){
        return areaInSqft * ratePerSqft;
    }
    public double calculateTax(double propertyvalue, int servicecharge){
        return (propertyvalue * 0.015) + servicecharge;
    }
}

public class Overloading{
    public static void main(String[] args){
        Propertytax obj = new Propertytax();
        System.out.println(obj.areaInSqft(1000));
        System.out.println(obj.)

    }

}