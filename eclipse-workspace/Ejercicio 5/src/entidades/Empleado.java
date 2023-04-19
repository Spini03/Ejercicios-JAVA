package entidades;

import java.util.Scanner;

public abstract class Empleado {
	
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private double sueldoBase;
	
	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getSueldoBase() {
		return sueldoBase;
	}



	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public void cargaDatos() {
		
		Scanner lector = new java.util.Scanner(System.in);
		
		System.out.println("Ingrese el dni del empleado: ");
		this.setDni(Integer.parseInt(lector.nextLine()));
		System.out.println("Ingrese el apellido del empleado: ");
		this.setApellido(lector.nextLine());
		System.out.println("Ingrese el nombre del empleado: ");
		this.setNombre(lector.nextLine());
		System.out.println("Ingrese el mail del empleado: ");
		this.setEmail(lector.nextLine());
		System.out.println("Ingrese el sueldo base del empleado: ");
		this.setSueldoBase(Double.parseDouble(lector.nextLine()));
		

		lector.close();
		
	}
	
	public abstract double getSueldo();
	
		
	
	
}
