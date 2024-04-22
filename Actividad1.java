package Repaso;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int intro=0;
	System.out.println("Introduce la actividad");
	sugerirDeporte(intro);
	if(intro>=-10 && intro<=0) {
		System.out.println("La actvidad es Esqui");
	}
	else if(intro>0 && intro<=10){
		System.out.println("La actividada es Atletismo");
	}
	else if(intro>10 && intro<=20){
		System.out.println("La actividada es Futbol");
	}
	else if(intro>20 && intro<=30){
		System.out.println("La actividada es Balonmano");
	}else if(intro>30 && intro<=40) {
		System.out.println("La actividad es badminton");
	}
	
	
}



public static String[] sugerirDeporte(int intro) {
	Scanner s=new Scanner(System.in);
	String[] deportes = {"Esqui", "Atletismo", "Futbol", "Balonmano","badminton"};
	String elige="";
	elige=s.next();
	for(int i=0; i<4; i++) {
		
	}
		return deportes;
}
}
