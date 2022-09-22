public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Seleccionaste Ligth Mode");
                break;
            case "Nigth":
                System.out.println("Selecionaste Nigth Mode");
                break;
            case "Blue":
                System.out.println("Selecionaste Blue Nigth Mode");
                break;
            case "Dark":
                System.out.println("Selecionate Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion valida");
        }
    }
}
