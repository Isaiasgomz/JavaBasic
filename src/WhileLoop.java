public class WhileLoop {
    static boolean isTurnOnLitgh = false;

    public static void main(String[] args) {

    turnOnOffLigth();

    int i = 1;
    while ( isTurnOnLitgh && i <= 10){
        PrintSOS();
        i++;
    }

    }
    public static void PrintSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLigth(){
        isTurnOnLitgh = (isTurnOnLitgh) ? false : true;
        return isTurnOnLitgh;
    }
}
