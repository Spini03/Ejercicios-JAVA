package entidades;

public class Alumno extends Persona {
	
	private int legajo;
	
	
	public int getLegajo() {
		return legajo;
	}



	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	
	public Alumno() {
		this.setLegajo(123456);
	}
	
	public Alumno(int legajo, int dni, String apellido, String nombre) {
		super(dni, apellido, nombre);
		this.setLegajo(legajo);
	}
	
	@Override   //Sirve para indicar que estoy escribiendo un método que sobreescribe al de la clase padre, así me informa que hay error si lo llego a escribir mal
	public String getDetalle(boolean mostrarDatosSensibles) {
		return super.getDetalle(mostrarDatosSensibles)+" - Legajo: "+this.getLegajo();
	}
	
	@Override
	public String getDefClase() {
		return "Alumno";
	}
	
}
