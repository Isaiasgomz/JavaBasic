public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSend = 3;
        if (isBluetoothEnabled) {
            fileSend++;
            System.out.println("File Send!");
        }else{
            System.out.println("Porfavor enciende el Bluetooth");
            fileSend--;
        }
    }
}
