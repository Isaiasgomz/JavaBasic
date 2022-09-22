import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do{
            System.out.println("Selecciona el numero de la opcion desada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 0:
                    System.out.println("Gracias por Visitarnos");
                    break;
                default:
                    System.out.println("ingresa un opcion valida");
            }
        }while (response != 0);
        System.out.println("Se termino el Programa");
    }
}
