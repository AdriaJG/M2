package Objetos;

public class Volunteer extends Trabajador {
	private static final double NOSUELDO = 0;

	public Volunteer(String nombre) {
		super(nombre, NOSUELDO);
		// TODO Auto-generated constructor stub
	}
	
	public Volunteer() {
		super(NOSUELDO);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo();
	}

}
