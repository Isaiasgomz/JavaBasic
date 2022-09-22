public class ForLoop {
    static boolean isTurnOnLitgh = false;
    public static void main(String[] args) {

      turnOnOffLigth();
        for (int i = 0; i < 10; i++) {
            PrintSOS();
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
