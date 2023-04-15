package ui;

import java.util.LinkedList;
import java.util.Collections;

public class UsoLinkedList1 {

	public static void main(String[] args) {
		// Creaci�n
		LinkedList<String> mamals = new LinkedList<>();

		// Agregar elementos al final
		mamals.add("Dog");
		mamals.add("Horse");

		// Agregar elementos en una ubicaci�n
		System.out.println("Lista inicial");
		System.out.println(mamals);
		System.out.println();System.out.println();
		
		
		System.out.println("Original: "+mamals);
		mamals.add(1,"Cat");
		mamals.add(3,"Lion");
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		
		// mamals.add(5,"Gorila");
		// Se puede usar el add para agregar elementos en medio
		// Se puede indicar tambi�n la posici�n siguiente a la �ltima
		// Pero si se excede la posici�n m�xima se causa una excepci�n 

		
		
		
		// Recuperar elementos
		System.out.println("Primer elemento");
		System.out.println(mamals.get(0));
		// Las colecciones comienzan en 0
		System.out.println();System.out.println();
		
		// System.out.println(mamals.get(3));
		// si el �ndice exede el m�ximo del LinkedList genera una excepci�n
		
		
		// Recuperar el tama�o de un LinkedList
		System.out.println("Tama�o del LinkedList");
		System.out.println(mamals.size());
		System.out.println();System.out.println();

		System.out.println("Reemplazando elemento");
		
		
		// Reemplazar elementos
		System.out.println("Original: "+mamals);
		mamals.set(2,"Zebra");
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		
		//mamals.set(5,"Gorila");
		// Setear un elemento en una posici�n que no existe genera una excepci�n

		
		// Remover elemenos
		System.out.println("Remover elemento por �ndice");
		System.out.println("Original: "+mamals);
		String cat = mamals.remove(1);
		System.out.println("Actual: "+mamals);
		System.out.println("Removido: "+cat);
		System.out.println();System.out.println();
		
		// mamals.remove(5);
		// Remover un elemento de una posici�n inexistente genera una excepci�n
		
		
		System.out.println("Remover elemento por objeto");
		System.out.println("Original: "+mamals);
		boolean lionRemoved= mamals.remove("Lion");
		boolean gorilaRemoved= mamals.remove("Gorila");
		System.out.println("Actual: "+mamals);
		System.out.println("�Lion fue removido?: "+lionRemoved);
		System.out.println("�Gorila fue removido?: "+gorilaRemoved);
		System.out.println();System.out.println();
		
		// Remover un elemento inexistente devuelve false, no genera una excepci�n
		// Remove por objeto utiliza el m�todo equals de la clase
		
		
		// Revisar si un elemento se encuentra en la colecci�n
		System.out.println("�El LinkedList contiene Zebra?: "+ mamals.contains("Zebra"));
		System.out.println();System.out.println();
		
		// Obtener el �ndice de un elemento
		System.out.println("�El �ndice de Dog?: "+ mamals.indexOf("Dog"));
		System.out.println("�El �ndice de Cow?: "+ mamals.indexOf("Cow"));
		System.out.println();System.out.println();
		
		
		// Agregar multiples elementos
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Crocodile");
		animals.addAll(mamals);
		
		System.out.println("Agregar varios elementos");
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		// Remover varios elementos
		System.out.println("Remover todos los elementos de otro LinkedList");
		animals.removeAll(mamals);
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		// Remover todos los elementos
		animals.clear();
		System.out.println("Vaciar un LinkedList");
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		
		// Iterar con for
		System.out.println("Iterar con for");
		for(int i = 0; i < mamals.size(); i++) {
		    System.out.print(mamals.get(i));
		    System.out.print(", ");
		}
		System.out.println();System.out.println();
		
		
		
		// Iterar con foreach
		System.out.println("Iterar con foreach");
		for(String animal : mamals) {
		    System.out.print(animal);
		    System.out.print(", ");
		}
		System.out.println();System.out.println();
		
		
		// Ordenar elementos
		mamals.add("Cow");
		mamals.add("Cat");
		System.out.println("Ordenar elementos");
		System.out.println("Original: "+mamals);
		Collections.sort(mamals);
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		// sort se basa en el m�todo compareTo de la clase.
		
	}

}
