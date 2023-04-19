package ui;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	public static void main (String[] args) {
		
		System.out.println("Los 10 primeros números enteros");
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		int n=0;
		int cont=0;
		
		
		System.out.println("Primeros 10 números impares");
		do {
			if (n%2 != 0) {
				System.out.println(n);
				cont += 1;
			}
			n += 1;
		} while (cont<10);
		
		System.out.println();
		System.out.println();
		
		String[] palabras = new String[10];
		
		Scanner lector = new java.util.Scanner(System.in);
		
		
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra "+(i+1));
	        palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		System.out.println("Las 10 palabras en orden inverso");
		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.println("palabras["+i+"]: "+palabras[i]);
		}
		
		System.out.println("Ingrese una nueva palabra: ");
		String p = lector.nextLine();
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(p)) {
				System.out.println("La palabra ingresada ya pertenece a las 10 primeras.");
			}
		}
		
		
		/*
		System.out.println("Ingrese un entero: ");
		int x = Integer.parseInt(lector.nextLine());
		System.out.println();
		int[] mayoresA = new int[20];
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el número "+(i+1));
	        numeros[i]=Integer.parseInt(lector.nextLine());
	        if (numeros[i] > x) {
	        	mayoresA[i] = numeros[i];
	        }
		}
		
		System.out.println();
		System.out.println("Los números mayores al primer número ingresado son:");
		for (int i = 0; i < mayoresA.length; i++) {
			System.out.println(mayoresA[i]);
		}
		*/
		
		System.out.println("Ingrese un entero: ");
		int x = Integer.parseInt(lector.nextLine());
		System.out.println();
		
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> mayoresA = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Ingrese el número "+(i+1));
			int nx = Integer.parseInt(lector.nextLine());
			numeros.add(i,nx);
			if (nx > x) {
				mayoresA.add(i,nx);
			}
		}
		
		System.out.println();
		System.out.println("Los números mayores al primer número ingresado son:");
		for(int i = 0; i < mayoresA.size(); i++) {
		    System.out.print(mayoresA.get(i));
		    System.out.print(", ");
		}
		
		
		lector.close();
		
	}

}
