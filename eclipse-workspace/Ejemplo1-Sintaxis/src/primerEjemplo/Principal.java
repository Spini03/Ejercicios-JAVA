package primerEjemplo;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Primer Ejemplo");
		int n1;
		int n2=3;
		Integer n3;
		String texto;
		String texto2="Bienvenido";
		n1=2;
		
		n3=0;
		System.out.println(n3);
		texto="Hola";
		System.out.println(texto);
		
		Scanner lector = new java.util.Scanner(System.in);
		
		variablesEIfs(n1, n2, texto2, lector);
		iterar(lector);
		
		lector.close();
		
		//String despedida=JOptionPane.showInputDialog("Ingrese saludo final");
		
		//JOptionPane.showMessageDialog(null, despedida);
		
	}

	private static void iterar(Scanner lector) {
		String[] palabras = new String[3];
		//0,1,2
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra "+(i+1));
	        palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		System.out.println("Iterar con for");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("palabras["+i+"]: "+palabras[i]);
		}
		
		System.out.println();
		System.out.println("Iterar con for orden inverso");
		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.println("palabras["+i+"]: "+palabras[i]);
		}
		
		System.out.println();
		System.out.println("Iterar con foreach");
		for (String palabra : palabras) {
			System.out.println(palabra); //la ventaja del foreach es la facilidad de lectura, utilizar siempre que no nos interese el índice
		}
		
	}
	
	private static void variablesEIfs(int n1, int n2, String texto2, Scanner lector) {
		Integer n3;
		String texto;
		System.out.print("Ingrese un texto: ");
		texto=lector.nextLine();
		System.out.print("Ingrese un nro: ");
		n3=Integer.parseInt(lector.nextLine());
		
		System.out.println();
		System.out.println("Texto: "+texto);
		System.out.println("Número: "+n3);
		
		System.out.println();
		if (n3==n2+n1) {
			System.out.println("Números iguales");
		} else {
			System.out.println("Números distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con ==");
		if (texto==texto2) {
			System.out.println("Textos iguales");
		} else {
			System.out.println("Textos distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con equals");
		if (texto.equals(texto2)) {
			System.out.println("Textos iguales");
		} else {
			System.out.println("Textos distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con equalsIgnoreCase");
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("Textos iguales");
		} else {
			System.out.println("Textos distintos");
		}
	}

}
