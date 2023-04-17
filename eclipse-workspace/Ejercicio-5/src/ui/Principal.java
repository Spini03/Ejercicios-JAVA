package ui;

import entidades.*;
import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		Scanner lector = new java.util.Scanner(System.in);
		
		Empleado[] emps = new Empleado[20];
		
		int i=0;
		
		String resp = "s";
		
		String tipo = "x";
		
		do {
			
			System.out.println("Administrativo o Vendedor? (a/v)");
			tipo = lector.nextLine();
			if (tipo == "v") {
				emps[i] = new Vendedor();
				emps[i].cargaDatos();
			} else {
				emps[i] = new Administrativo();
				emps[i].cargaDatos();
			}
			
			i += 1;
			
			System.out.println("Desea ingresar otro empleado? (s/n)");
			resp = lector.nextLine();
			
		} while ((resp == "s") && (i<emps.length));
		
		for (Empleado e: emps) {
			System.out.println("DNI: ");
			System.out.println(e.getDni());
			System.out.println("Nombre: ");
			System.out.println(e.getNombre());
			System.out.println("Apellido: ");
			System.out.println(e.getApellido());
			System.out.println("Sueldo: ");
			System.out.println(e.getSueldo());
		}
		
		lector.close();
	}
}