package Repaso;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
    	//Esto es el scannner
        Scanner scanner = new Scanner(System.in);
        //He creado un contador para entrar x veces en el bucle
        int cont=0;
        System.out.print("Ingresa un número para generar la sucesión de Ulam: ");
        do {
            int num = scanner.nextInt();
            if (num<=0) {
                System.out.println("Debes ingresar un número entero mayor que cero.");
            } else {
            	//Aqui meto el metodo para mostrar la sucecion de ULAM
                System.out.println("Sucesión de Ulam para el número " +num+":");
                calcularSucesionUlam(num);
            }
          cont++;
        } while(cont<5);
      
    }
    //Aqui el metodo que es necesario para calcular la suecion de ULAM
    public static void calcularSucesionUlam(int numero) {
        System.out.print(numero + " ");
        while (numero!= 1) {
            if (numero%2==0) {
                numero/=2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
