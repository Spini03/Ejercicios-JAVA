package entidades;

import java.util.Scanner;

public class Vendedor extends Empleado {
	
	public float porcenComision;
	public int totalVentas;
	
	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	@Override
	public void cargaDatos() {
		
		Scanner lector = new java.util.Scanner(System.in);
		
		super.cargaDatos();
		System.out.println("Ingrese el porcentaje de comisión del vendedor: ");
		this.setPorcenComision(Float.parseFloat(lector.nextLine()));
		System.out.println("Ingrese el total de ventas del vendedor: ");
		this.setTotalVentas(Integer.parseInt(lector.nextLine()));

		lector.close();
		
	}
	
	@Override
	public double getSueldo() {
		return (this.getSueldoBase())+(this.getPorcenComision()*this.getTotalVentas()/100);
	}

}
