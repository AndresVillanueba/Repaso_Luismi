package Repaso;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
    	//Aqui el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero:");
        //He creado un contador para entrar x veces en el bucle
        int cont=0;
        do{
            int numero = scanner.nextInt();
            if (numero<0) {
                System.out.println("El factorial no está definido");
            } else {
            	//Aqui muestro el metodo que calcula para mostrar el factorial del numero que pides
                int factorial=calcularFactorial(numero);
                System.out.println("El factorial de "+numero+" es "+factorial);
            }
            cont++;
        }while(cont<5);
    }
    //Aqui el metodo para poder calcular el factorial
    public static int calcularFactorial(int numero) {
        int factorial=1;
        for (int i=1; i<=numero; i++) {
            factorial *=i;
        }
        return (int) factorial;
    }
}
