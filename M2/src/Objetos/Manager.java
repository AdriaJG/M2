package Objetos;

public class Manager extends Trabajador {

	public Manager(String nombre, double sueldo) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public Manager(double sueldo) {
		super( sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo() + super.getSueldo() * 10 / 100;
	}

}
