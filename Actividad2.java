package Repaso;

import java.util.Scanner;

public class Actividad2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=0;
	System.out.println("Introduce un numero entre 1 y 7");
	num=s.nextInt();
	diasemana(num);
}

private static void diasemana(int num) {
	do {
	if(num==1) {
		System.out.println("Lunes");
	}
	else if(num==2) {
		System.out.println("Martes");
	}
	else if(num==3) {
		System.out.println("Miercoles");
	}
	else if(num==4) {
		System.out.println("Jueves");
	}
	else if(num==5) {
		System.out.println("Viernes");
	}
	else if(num==6) {
		System.out.println("Sabado");
	}
	else if(num==7) {
		System.out.println("Domingo");
	}
	}while(num>8 && num<0);
}
}
