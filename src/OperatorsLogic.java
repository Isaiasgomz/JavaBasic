public class OperatorsLogic {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        if(a == b){
            System.out.println("a es igual a b");
        } else if (a != b) {
            System.out.println("a es diferente a b");
        } else if ((a > b) && (a != b)) {
            System.out.println("a es mayor y distinto de b");
        } else if (a < b) {
            System.out.println("a es menor a b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a es menor o igual a b");
        }
    }
}
