package entidades;

import java.util.Scanner;

public class Administrativo extends Empleado {
	
	public float hsExtra;
	public float hsMes;
	
	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(float hsExtra) {
		this.hsExtra = hsExtra;
	}
	public float getHsMes() {
		return hsMes;
	}
	public void setHsMes(float hsMes) {
		this.hsMes = hsMes;
	}
	
	@Override
	public void cargaDatos() {
		
		Scanner lector = new java.util.Scanner(System.in);
		
		super.cargaDatos();
		System.out.println("Ingrese las horas extras del administrativo: ");
		this.setHsExtra(Float.parseFloat(lector.nextLine()));
		System.out.println("Ingrese las horas totales en el mes del administrativo: ");
		this.setHsMes(Double.parseDouble(lector.nextLine()));

		lector.close();
		
	}
	
	@Override
	public double getSueldo() {
		return  (this.getSueldoBase()*(this.getHsExtra()*1.5)+this.getHsMes());
	}
	
}
