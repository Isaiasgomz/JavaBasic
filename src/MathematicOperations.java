public class MathematicOperations {
    public static void main(String[] args) {
        double x  = 2.1;
        double y = 3;

//        redondea un entero hacia arriba
        System.out.println(Math.ceil(x));

//        redondea un entero hacia abajo
        System.out.println(Math.floor(x));

//        devuelve el maximo numero
        System.out.println(Math.max(x,y));

//        eleve un numero a otro numero
        System.out.println(Math.pow(x,y));

//        obtiene la raiz cuadrada
        System.out.println(Math.sqrt(x));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println(4* Math.PI * Math.pow(y,2));

//        volumen de una esfera
//        (4/3)*PI * r3
        System.out.println((4/3)* Math.PI * Math.pow(y,3));

    }
}
