package Objetos;

public abstract class Trabajador {
	protected String nombre;
	protected double sueldo;
	
	public Trabajador(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public Trabajador(double sueldo){
		this.nombre = "Pepe";
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarSueldo(double sueldo) {
		System.out.println("El sueldo es de " + sueldo);
	}
	
}
