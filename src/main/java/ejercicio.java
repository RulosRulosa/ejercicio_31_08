import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a= teclado.nextInt();
        int [] numeros= new int[a];

        rellenarArreglo(a);
        mostrarArreglo(numeros);
        menu();
        int opcion= teclado.nextInt();
        menuAccion(opcion);
    }
    public static void menu(){
        System.out.println("indique que desea hacer");
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("* [1] mostrar arreglo                 *");
        System.out.println("* [2] mostrar numeros pares e impares *");
        System.out.println("* [3] mostrar numeros primos          *");
        System.out.println("* [4] cambiar limites de conjuntos    *");
        System.out.println("* [5] Salir                           *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
    }
    public static void menuAccion(int opcion){
        switch (opcion){
            case 1:
                System.out.println("su arreglo es");
            case 2:
                System.out.println("los numeros pares e impares son:");
            case 3:
                System.out.println("los numeros primos son:");
            case 4:
                System.out.println("ingrese los nuevos límites del conjunto");
            case 5:
                System.out.println("adiós");
        }
    }

    public static void rellenarArreglo(int a){
        Scanner teclado= new Scanner(System.in);
        int []numeros= new int[a];
        for (int i = 0; i <numeros.length; i++) {
            numeros[i]= teclado.nextInt();
        }
    }
    public static void mostrarArreglo (int [] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("["+numeros+"]");
        }
    }
}
