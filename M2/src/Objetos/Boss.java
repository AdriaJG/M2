package Objetos;

public class Boss extends Trabajador {

	public Boss(String nombre, double sueldo) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public Boss(double sueldo) {
		super( sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo() + super.getSueldo() * 50 / 100;
	}

}
