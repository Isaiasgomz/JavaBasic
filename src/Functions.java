public class Functions {
    public static void main(String[] args) {
        double y = 3;

        System.out.println(circleArea(y));


        System.out.println(spheraArea(y));


        System.out.println(spheraVolumen(y));

        System.out.println(convertToDollar("COP",1000));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static  double spheraArea(double r){
        return 4* Math.PI * Math.pow(r,2);
    }

    public static double spheraVolumen(double r){
        return (4/3)* Math.PI * Math.pow(r,3);
    }

    public static double convertToDollar(String currency, double quantity){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return  quantity;
    }
}
